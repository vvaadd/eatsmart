package ru.eatsmart.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class HerokuDatabaseConfiguration/* implements EnvironmentAware */ {

//	private final Logger log = LoggerFactory
//			.getLogger(HerokuDatabaseConfiguration.class);
//
//	private RelaxedPropertyResolver propertyResolver;
//
//	@Override
//	public void setEnvironment(Environment environment) {
//		this.propertyResolver = new RelaxedPropertyResolver(environment,
//				"spring.datasource.");
//	}
//
//	@Bean
//	@Profile(Constants.SPRING_PROFILE_PRODUCTION)
//	public DataSource dataSource() {
//		log.debug("Configuring Heroku Datasource");
//
//		String herokuUrl = propertyResolver.getProperty("heroku-url");
//		if (herokuUrl != null) {
//			log.info("Using Heroku, parsing their $DATABASE_URL to use it with JDBC");
//			URI dbUri = null;
//			try {
//				dbUri = new URI(herokuUrl);
//			} catch (URISyntaxException e) {
//				throw new ApplicationContextException(
//						"Heroku database connection pool is not configured correctly");
//			}
//			String username = dbUri.getUserInfo().split(":")[0];
//			String password = dbUri.getUserInfo().split(":")[1];
//			String dbUrl = "jdbc:postgresql://"
//					+ dbUri.getHost()
//					+ ':'
//					+ dbUri.getPort()
//					+ dbUri.getPath()
//					+ "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
//
//			HikariConfig config = new HikariConfig();
//			config.setDataSourceClassName(propertyResolver
//					.getProperty("dataSourceClassName"));
//			config.addDataSourceProperty("url", dbUrl);
//			config.addDataSourceProperty("user", username);
//			config.addDataSourceProperty("password", password);
//			return new HikariDataSource(config);
//		} else {
//			throw new ApplicationContextException(
//					"Heroku database URL is not configured, you must set --spring.datasource.heroku-url=$DATABASE_URL");
//		}
//	}
}

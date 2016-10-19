package ru.eatsmart.config;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableJpaRepositories("com.chrisbaileydeveloper.myapp.repository")
//@EnableTransactionManagement
public class DatabaseConfiguration/* implements EnvironmentAware*/ {
//    private final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);
//
//    private RelaxedPropertyResolver propertyResolver;
//
//    private Environment env;
//
//    @Override
//    public void setEnvironment(Environment env) {
//        this.env = env;
//        this.propertyResolver = new RelaxedPropertyResolver(env, "spring.datasource.");
//    }
//
//    @Bean
//    @Profile(Constants.SPRING_PROFILE_DEVELOPMENT)
//    public DataSource dataSource() {
//        log.debug("Configuring Datasource");
//        if (propertyResolver.getProperty("url") == null && propertyResolver.getProperty("databaseName") == null) {
//            log.error("Your database connection pool configuration is incorrect! The application" +
//                    "cannot start. Please check your Spring profile, current profiles are: {}",
//                    Arrays.toString(env.getActiveProfiles()));
//
//            throw new ApplicationContextException("Database connection pool is not configured correctly");
//        }
//        HikariConfig config = new HikariConfig();
//        config.setDataSourceClassName(propertyResolver.getProperty("dataSourceClassName"));
//        if (propertyResolver.getProperty("url") == null || "".equals(propertyResolver.getProperty("url"))) {
//            config.addDataSourceProperty("databaseName", propertyResolver.getProperty("databaseName"));
//            config.addDataSourceProperty("serverName", propertyResolver.getProperty("serverName"));
//        } else {
//            config.addDataSourceProperty("url", propertyResolver.getProperty("url"));
//        }
//        config.addDataSourceProperty("user", propertyResolver.getProperty("username"));
//        config.addDataSourceProperty("password", propertyResolver.getProperty("password"));
//
//        return new HikariDataSource(config);
//    }
//
//	/* Liquibase */
//	@Bean
//	public SpringLiquibase liquibase(DataSource dataSource) {
//		SpringLiquibase liquibase = new SpringLiquibase();
//		liquibase.setDataSource(dataSource);
//		liquibase.setChangeLog("classpath:config/liquibase/master.xml");
//		liquibase.setContexts("development, production");
//        liquibase.setShouldRun(true);
//
//		log.debug("Configuring Liquibase");
//		return liquibase;
//	}
//
//    @Bean
//    public Hibernate4Module hibernate4Module() {
//        return new Hibernate4Module();
//    }
//
}

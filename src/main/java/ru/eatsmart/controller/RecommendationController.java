package ru.eatsmart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecommendationController {
    final Logger logger = LoggerFactory.getLogger(RecommendationController.class);

    /**
     * Sign in page.
     */
    @RequestMapping("/recommendation")
    public String order() {
        logger.info("Showing recommendation page");

        return "home/recommendation";
    }
}

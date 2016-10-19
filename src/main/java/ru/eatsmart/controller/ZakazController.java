package ru.eatsmart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZakazController {
    final Logger logger = LoggerFactory.getLogger(ZakazController.class);

    /**
     * Sign in page.
     */
    @RequestMapping("/zakaz")
    public String zakaz() {
        logger.info("Showing zakaz page");

        return "home/zakaz";
    }
}

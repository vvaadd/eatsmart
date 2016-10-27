package ru.eatsmart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    final Logger logger = LoggerFactory.getLogger(OrderController.class);

    /**
     * Sign in page.
     */
    @RequestMapping("/order")
    public String order() {
        logger.info("Showing order page");

        return "home/order";
    }
}

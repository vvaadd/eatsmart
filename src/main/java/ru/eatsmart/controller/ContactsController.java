package ru.eatsmart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactsController {
    final Logger logger = LoggerFactory.getLogger(ContactsController.class);

    /**
     * Sign in page.
     */
    @RequestMapping("/contacts")
    public String contacts() {
        logger.info("Showing contacts page");

        return "home/contacts";
    }
}

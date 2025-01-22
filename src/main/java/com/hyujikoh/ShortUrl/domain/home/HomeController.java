package com.hyujikoh.ShortUrl.domain.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author : hyujikoh.
 * CreatedAt : 2024-04-16.
 * Desc :
 */
@Controller
@Slf4j
public class HomeController {
    @GetMapping("")
    public String homeMethod() {
        log.debug("homeMethod");
        return "index.html";
    }
}

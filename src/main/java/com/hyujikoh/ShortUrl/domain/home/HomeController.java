package com.hyujikoh.ShortUrl.domain.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-04-16
 * Desc :
 */
@Controller
public class HomeController {
    @GetMapping("")
    public String homeMethod(){
        return "index.html";
    }
}

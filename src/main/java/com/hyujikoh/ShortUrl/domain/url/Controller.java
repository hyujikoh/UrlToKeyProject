package com.hyujikoh.ShortUrl.domain.url;

import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.URL;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-04-16
 * Desc :
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("url")
public class Controller {
    private final Service service;
    @GetMapping("")
    public ResponseEntity<?> healthCheck() {

        return ResponseEntity.ok().build();
    }

    @GetMapping("/shortUrl")
    public ResponseEntity<?> postStartApi(@RequestParam @URL String url) {
        String randomUrl = this.service.createRandomUrl(url);
        return ResponseEntity.ok(randomUrl);
    }

    @GetMapping("/keyUrl")
    public RedirectView getStartApi(@RequestParam String url) {
        String randomUrl = this.service.getUrlFromKey(url);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(randomUrl);
        return redirectView;
    }

    @GetMapping("/count")
    public ResponseEntity<?> getCountApi(@RequestParam String url) {
        Long countByUrl = this.service.getCountByUrl(url);
        return ResponseEntity.ok(countByUrl);
    }
}

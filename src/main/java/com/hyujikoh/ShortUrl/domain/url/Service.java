package com.hyujikoh.ShortUrl.domain.url;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-04-16
 * Desc :
 */

@org.springframework.stereotype.Service
public class Service {
    Map<String,String> map = new HashMap<>();
    public String createRandomUrl(String url) {
        String random = RandomStringUtils.random(8,33,125,true,true);
        map.put(random,url);
        return random;
    }

    public String getUrlFromKey(String contentAsString) {
        return map.get(contentAsString);
    }

    public Long getCountByUrl(String url) {
        return map.values().stream()
                .filter(s -> url.equals(s)).count();
    }
}
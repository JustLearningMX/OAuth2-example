package tech.hiramchavez.oauth.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

    @GetMapping("/userinfo")
    public Map<String, Object> userInfo(OAuth2AuthenticationToken token) {
        Map<String, Object> userInfo = new HashMap<>();
        userInfo.put("name", token.getPrincipal().getAttribute("name"));
        userInfo.put("email", token.getPrincipal().getAttribute("email"));
        userInfo.put("picture", token.getPrincipal().getAttribute("picture"));
        return userInfo;
    }
}

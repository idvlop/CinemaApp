package org.idvlop.cinemaAppServer.restService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "HELLO WORLD! THIS IS CINEMA APP! DO YOU SEE?";
    }

//    @PostMapping("/login")
//    public String login(){
//        return "login";
//    }

}


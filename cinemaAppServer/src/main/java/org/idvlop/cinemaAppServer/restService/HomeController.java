package org.idvlop.cinemaAppServer.restService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "HELLO WORLD! THIS IS CINEMA APP! DO YOU SEE?";
    }

}

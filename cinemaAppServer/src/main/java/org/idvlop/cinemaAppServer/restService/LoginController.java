package org.idvlop.cinemaAppServer.restService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@Validated
@Slf4j
public class LoginController {

//    @RequestMapping(method = RequestMethod.GET)
//    public String loginPage(Model model){
//        return "login";
//    }

}
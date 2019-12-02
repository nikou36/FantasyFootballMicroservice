package ffa.front.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String hello(HttpServletRequest req, Model model) {
        return "main";
    }

    @GetMapping("/2017Season")
    public String seventeen(HttpServletRequest req) {
        return "2017Season";
    }


}

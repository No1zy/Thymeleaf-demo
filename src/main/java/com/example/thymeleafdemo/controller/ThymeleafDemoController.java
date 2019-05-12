package com.example.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThymeleafDemoController {

    public ThymeleafDemoController() {}
    /**
     * index
     * @param msg message
     * @return index.html
     */
    @GetMapping("/index")
    public String index(@RequestParam(required = false) String msg,
                        @RequestParam(required = false) String test,
                        Model model) {
        model.addAttribute("msg", msg);
        model.addAttribute("test", test);

        return "index";
    }
}

package com.example.study.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MainController {

//    @GetMapping("/")
//    public String main(Model model) {
//        model.addAttribute("data", "hello");
//        return "hello";
//    }
//

    /**
     * default 경로는 resources/templates 인 것 같음
     */
    @GetMapping("")
    public String main() {
        log.info("main method start");
        return "index";
    }

}

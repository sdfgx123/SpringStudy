package com.example.study.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class TestController {

    @GetMapping("/kakao")
    public String kakaoApiTestMap() {
        log.info("카카오 맵 api 테스트 메서드 시작");
        return "/kakao/map";
    }

    @GetMapping("/naver")
    public String naverApiTestMap() {
        log.info("네이버 api 테스트 시작");
        return "/naver/map";
    }


}

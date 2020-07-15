package com.juastory.juastudy.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /* com.juastory.juastudy 패키지 이하 특정 어노테이션이 붙어있는
                   클래스 파일들을 new해서(IOC) 스프링 컨테이너에 관리해줍니다.*/
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String hello() {
        return "<h1>hello spring boot</h1>";
    }
}

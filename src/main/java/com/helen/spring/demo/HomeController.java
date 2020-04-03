package main.java.com.helen.spring.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JinYang.Qin
 * Created on 2020-04-03
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String hello() {
        return "hello world";
    }

}

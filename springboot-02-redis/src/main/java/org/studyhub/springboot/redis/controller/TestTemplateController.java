package org.studyhub.springboot.redis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @author haoren
 * @create 2020-12-14 20:43
 */

@Controller
public class TestTemplateController {

    @RequestMapping("/test/thymeleaf")
    public String testThymeleaf(Model model) {

        model.addAttribute("list", Arrays.asList("111", "222", "333", "444"));

        return "hello";
    }
}

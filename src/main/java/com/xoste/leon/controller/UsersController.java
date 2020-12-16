package com.xoste.leon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Leon
 */
@Controller
public class UsersController {
    @RequestMapping("show")
    public String showPage() {
        System.out.println("showPage...Users...");
        return "/index";
    }
}

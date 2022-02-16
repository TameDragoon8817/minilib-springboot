package com.mavenbase.minilibspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
        if (username.equals("admin") && password.equals("123456")) {
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "输入的信息有误");
            return "index";
        }
    }
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }

    @GetMapping("book/queryPage")
    public String queryPage(){
        return "book/query";
    }
}

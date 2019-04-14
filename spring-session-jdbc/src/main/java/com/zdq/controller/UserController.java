package com.zdq.controller;

import com.zdq.entity.UserEntity;
import com.zdq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    @ResponseBody
    public String findUserById(HttpServletRequest request){
        UserEntity user = userService.findUserById(1);
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        return user.toString();
    }
}

package com.koala.pep.controller;

import com.koala.pep.model.User;
import com.koala.pep.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "getUserByPk")
    public User getUserByPk(HttpServletRequest request){
        String pk_user = request.getHeader("pk_user");
        return userService.queryByPk(pk_user);
    }
}

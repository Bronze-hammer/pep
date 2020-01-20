package com.koala.pep.controller;

import com.koala.pep.model.User;
import com.koala.pep.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jetbrains.annotations.TestOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Api(tags = "用户相关接口", description = "提供用户相关的 Rest API")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "获取数据库中指定用户的信息",notes = "获取并返回指定用户的信息")
    @RequestMapping(method = RequestMethod.GET, value = "getUserByPk")
    public User getUserByPk(HttpServletRequest request){
        String pk_user = request.getHeader("pk_user");
        return userService.queryByPk(pk_user);
    }

    @ApiOperation(value = "获取数据库中所有用户信息",notes = "获取并返回所有用户信息")
    @RequestMapping(method = RequestMethod.GET, value = "getAllUser")
    public List<User> getUsers(){
        return userService.queryAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "updateUser")
    public String updateUser(@RequestBody User user){
        return user.toString();
    }

}

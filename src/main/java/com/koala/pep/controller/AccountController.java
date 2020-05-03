package com.koala.pep.controller;

import com.koala.pep.service.IAccountService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@Api(tags = "转账业务相关接口", description = "提供转账业务相关的 Rest API")
public class AccountController {

    @Autowired
    private IAccountService iAccountService;

    @RequestMapping(method = RequestMethod.POST, value = "/transfer")
    public void demo(){
        iAccountService.transfer("aaa", "bbb", 200d);
    }
}

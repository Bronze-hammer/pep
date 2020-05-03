package com.koala.pep.serviceImpl;

import com.koala.pep.mapper.AccountMapper;
import com.koala.pep.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void transfer(String out_user, String in_user, Double money) {
        int out = accountMapper.transferOut(out_user, money);
        System.out.println("++++++++++++++++++++++资金减少的数据有"+out+"条+++++++++++++++++++++++++");
        int i = 1/0;
        int in = accountMapper.transferIn(in_user, money);
        System.out.println("++++++++++++++++++++++资金增加的数据有"+in+"条+++++++++++++++++++++++++");
    }
}

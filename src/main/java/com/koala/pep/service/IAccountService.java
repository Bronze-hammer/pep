package com.koala.pep.service;

import org.springframework.transaction.annotation.Transactional;

public interface IAccountService {

    @Transactional
    public void transfer(String out, String in, Double money);

}

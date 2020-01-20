package com.koala.pep.service;

import com.koala.pep.model.User;

import java.util.List;

public interface IUserService {

    User queryByPk(String pk_user);

    List<User> queryAll();
}

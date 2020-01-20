package com.koala.pep.service;

import com.koala.pep.model.User;

public interface IUserService {

    User queryByPk(String pk_user);

}

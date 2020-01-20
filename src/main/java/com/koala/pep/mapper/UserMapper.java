package com.koala.pep.mapper;

import com.koala.pep.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUserByPk(String pk_user);

}

package com.koala.pep.mapper;

import com.koala.pep.model.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserMapper {

    //根据主键pk_user查询指定的用户数据
    User getUserByPk(String pk_user);

    //查询所有用户数据
    List<User> getAllUsers();

    //新增用户数据
    void addUsers(User user);

    //更新指定的用户数据
    void updateUsers(User user);

    //删除指定的用户数据
    void deleteUserByPk(List<String> pk_list);

}

package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Long> {

    //根据用户名查询
    public List<User> findByNameIs(String name);

}

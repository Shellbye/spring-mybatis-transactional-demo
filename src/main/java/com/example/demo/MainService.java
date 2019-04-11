package com.example.demo;

import com.example.demo.dao.MyUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MainService {

    private MyUserMapper myUserMapper;

    @Autowired
    public MainService(MyUserMapper myUserMapper) {
        this.myUserMapper = myUserMapper;
    }

    @Transactional(rollbackFor = Exception.class)
    public void createUser(Long id) throws Exception {
        MyUser myUser = new MyUser();
        myUser.setId(id);
        myUser.setUserName("rollback");
        myUserMapper.createMyUser(myUser);
        throw new Exception("for rollback");
    }

    @Transactional
    public void createUserNotRollback(Long id) throws Exception {
        MyUser myUser = new MyUser();
        myUser.setId(id);
        myUser.setUserName("Not rollback");
        myUserMapper.createMyUser(myUser);
        throw new Exception("for rollback");
    }
}

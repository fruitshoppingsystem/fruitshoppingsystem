package com.sys.dao;

import com.sys.pojo.Users;

import java.util.List;

public interface UsersDao {
    void insertUser(Users users);
    void deleteUser(String uEmail);
    void updateUser(Users users);
    void updateUserPassword(Users users);
    List<Users> selectAllUsers();
    void updateVIP(String uEmail);
    void userLogin(String uEmail);
    void userLogout(String uEmail);
}

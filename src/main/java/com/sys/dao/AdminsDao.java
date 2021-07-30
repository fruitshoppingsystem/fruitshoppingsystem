package com.sys.dao;

import com.sys.pojo.Admins;

import java.util.List;

public interface AdminsDao {
    List<Admins> selectAdminById(int id);
}

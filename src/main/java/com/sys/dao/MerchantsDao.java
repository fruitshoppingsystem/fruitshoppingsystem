package com.sys.dao;

import com.sys.pojo.Merchants;
import com.sys.pojo.Users;

import java.util.List;

public interface MerchantsDao {
    void insertMerchant(Merchants merchants);
    void deleteMerchant(int mCertificatenum);
    void updateMerchant(Merchants merchants);
    void updateMerchantPassword(Users users);
    List<Merchants> selectAllMerchants();
    void updateScore(int mCertificatenum);
    void merchantLogin(int mCertificatenum);
    void merchantLogout(int mCertificatenum);
    void merchantCheckPass(int mCertificatenum);
    void merchantCheckNoPass(int mCertificatenum);
}

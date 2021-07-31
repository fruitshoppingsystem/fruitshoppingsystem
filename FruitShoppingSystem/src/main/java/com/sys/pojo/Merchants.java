package com.sys.pojo;

public class Merchants {
    private Integer mCertificatenum;
    private String nname;
    private String mPassword;
    private String mAddress;
    private Integer mPhonenum;
    private Integer mScore;
    private Short mState;

    public Merchants(Integer mCertificatenum, String nname, String mPassword, String mAddress, Integer mPhonenum, Integer mScore, Short mState) {
        this.mCertificatenum = mCertificatenum;
        this.nname = nname;
        this.mPassword = mPassword;
        this.mAddress = mAddress;
        this.mPhonenum = mPhonenum;
        this.mScore = mScore;
        this.mState = mState;
    }

    @Override
    public String toString() {
        return "Merchants{" +
                "mCertificatenum=" + mCertificatenum +
                ", nname='" + nname + '\'' +
                ", mPassword='" + mPassword + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mPhonenum=" + mPhonenum +
                ", mScore=" + mScore +
                ", mState=" + mState +
                '}';
    }

    public Integer getmCertificatenum() {
        return mCertificatenum;
    }

    public void setmCertificatenum(Integer mCertificatenum) {
        this.mCertificatenum = mCertificatenum;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public Integer getmPhonenum() {
        return mPhonenum;
    }

    public void setmPhonenum(Integer mPhonenum) {
        this.mPhonenum = mPhonenum;
    }

    public Integer getmScore() {
        return mScore;
    }

    public void setmScore(Integer mScore) {
        this.mScore = mScore;
    }

    public Short getmState() {
        return mState;
    }

    public void setmState(Short mState) {
        this.mState = mState;
    }

    public Merchants() {



    }
}

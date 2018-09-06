
package com.cjrjob.pojo;


import java.util.Date;


public class Seeker {
    private Integer jobSeekerId;

    private String username;

    private String password;

    private String email;

    private String role;

    private Date regTime;

    private Integer verifyCode;

    private Byte yn;

    public Seeker() {
    }

    public Seeker(Integer jobSeekerId, String username, String password, String email,String role, Date regTime, Integer verifyCode, Byte yn) {
        this.jobSeekerId = jobSeekerId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.regTime = regTime;
        this.verifyCode = verifyCode;
        this.yn = yn;
    }

    public Integer getJobSeekerId() {
        return jobSeekerId;
    }

    public void setJobSeekerId(Integer jobSeekerId) {
        this.jobSeekerId = jobSeekerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Integer getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(Integer verifyCode) {
        this.verifyCode = verifyCode;
    }

    public Byte getYn() {
        return yn;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
    }
}
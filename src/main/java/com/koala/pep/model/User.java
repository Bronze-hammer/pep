package com.koala.pep.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pep_user.pk_user
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    private String pkUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pep_user.username
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pep_user.password
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pep_user.realname
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pep_user.email
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pep_user.phone
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pep_user.creator
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pep_user.creationtime
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    private Date creationtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pep_user.modifier
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    private String modifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pep_user.modifiedtime
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    private Date modifiedtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pep_user.pk_user
     *
     * @return the value of pep_user.pk_user
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public String getPkUser() {
        return pkUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pep_user.pk_user
     *
     * @param pkUser the value for pep_user.pk_user
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public void setPkUser(String pkUser) {
        this.pkUser = pkUser == null ? null : pkUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pep_user.username
     *
     * @return the value of pep_user.username
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pep_user.username
     *
     * @param username the value for pep_user.username
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pep_user.password
     *
     * @return the value of pep_user.password
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pep_user.password
     *
     * @param password the value for pep_user.password
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pep_user.realname
     *
     * @return the value of pep_user.realname
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pep_user.realname
     *
     * @param realname the value for pep_user.realname
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pep_user.email
     *
     * @return the value of pep_user.email
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pep_user.email
     *
     * @param email the value for pep_user.email
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pep_user.phone
     *
     * @return the value of pep_user.phone
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pep_user.phone
     *
     * @param phone the value for pep_user.phone
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pep_user.creator
     *
     * @return the value of pep_user.creator
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pep_user.creator
     *
     * @param creator the value for pep_user.creator
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pep_user.creationtime
     *
     * @return the value of pep_user.creationtime
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public Date getCreationtime() {
        return creationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pep_user.creationtime
     *
     * @param creationtime the value for pep_user.creationtime
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pep_user.modifier
     *
     * @return the value of pep_user.modifier
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pep_user.modifier
     *
     * @param modifier the value for pep_user.modifier
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pep_user.modifiedtime
     *
     * @return the value of pep_user.modifiedtime
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public Date getModifiedtime() {
        return modifiedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pep_user.modifiedtime
     *
     * @param modifiedtime the value for pep_user.modifiedtime
     *
     * @mbg.generated Mon Jan 20 14:30:02 CST 2020
     */
    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    @Override
    public String toString() {
        return "User{" +
                "pkUser='" + pkUser + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", creator='" + creator + '\'' +
                ", creationtime=" + creationtime +
                ", modifier='" + modifier + '\'' +
                ", modifiedtime=" + modifiedtime +
                '}';
    }
}
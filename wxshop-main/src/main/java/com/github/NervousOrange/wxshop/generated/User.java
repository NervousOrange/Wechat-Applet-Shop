package com.github.NervousOrange.wxshop.generated;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.name
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.tel
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.avatar_url
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private String avatarUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.address
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.created_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.modified_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private Date modifiedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.id
     *
     * @return the value of tb_user.id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.id
     *
     * @param id the value for tb_user.id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.name
     *
     * @return the value of tb_user.name
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.name
     *
     * @param name the value for tb_user.name
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.tel
     *
     * @return the value of tb_user.tel
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.tel
     *
     * @param tel the value for tb_user.tel
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.avatar_url
     *
     * @return the value of tb_user.avatar_url
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.avatar_url
     *
     * @param avatarUrl the value for tb_user.avatar_url
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.address
     *
     * @return the value of tb_user.address
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.address
     *
     * @param address the value for tb_user.address
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.created_at
     *
     * @return the value of tb_user.created_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.created_at
     *
     * @param createdAt the value for tb_user.created_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.modified_at
     *
     * @return the value of tb_user.modified_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public Date getModifiedAt() {
        return modifiedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.modified_at
     *
     * @param modifiedAt the value for tb_user.modified_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
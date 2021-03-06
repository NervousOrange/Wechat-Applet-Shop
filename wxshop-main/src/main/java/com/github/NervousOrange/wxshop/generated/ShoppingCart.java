package com.github.NervousOrange.wxshop.generated;

import java.util.Date;

public class ShoppingCart {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shopping_cart.id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shopping_cart.user_id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shopping_cart.goods_id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shopping_cart.number
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shopping_cart.status
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shopping_cart.created_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shopping_cart.updated_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shopping_cart.shop_id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    private Integer shopId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shopping_cart.id
     *
     * @return the value of tb_shopping_cart.id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shopping_cart.id
     *
     * @param id the value for tb_shopping_cart.id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shopping_cart.user_id
     *
     * @return the value of tb_shopping_cart.user_id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shopping_cart.user_id
     *
     * @param userId the value for tb_shopping_cart.user_id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shopping_cart.goods_id
     *
     * @return the value of tb_shopping_cart.goods_id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shopping_cart.goods_id
     *
     * @param goodsId the value for tb_shopping_cart.goods_id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shopping_cart.number
     *
     * @return the value of tb_shopping_cart.number
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shopping_cart.number
     *
     * @param number the value for tb_shopping_cart.number
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shopping_cart.status
     *
     * @return the value of tb_shopping_cart.status
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shopping_cart.status
     *
     * @param status the value for tb_shopping_cart.status
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shopping_cart.created_at
     *
     * @return the value of tb_shopping_cart.created_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shopping_cart.created_at
     *
     * @param createdAt the value for tb_shopping_cart.created_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shopping_cart.updated_at
     *
     * @return the value of tb_shopping_cart.updated_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shopping_cart.updated_at
     *
     * @param updatedAt the value for tb_shopping_cart.updated_at
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shopping_cart.shop_id
     *
     * @return the value of tb_shopping_cart.shop_id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shopping_cart.shop_id
     *
     * @param shopId the value for tb_shopping_cart.shop_id
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}
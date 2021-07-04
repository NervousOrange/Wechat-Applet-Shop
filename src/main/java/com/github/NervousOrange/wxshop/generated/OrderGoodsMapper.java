package com.github.NervousOrange.wxshop.generated;

import com.github.NervousOrange.wxshop.generated.OrderGoods;
import com.github.NervousOrange.wxshop.generated.OrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_goods
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    long countByExample(OrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_goods
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    int deleteByExample(OrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_goods
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_goods
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    int insert(OrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_goods
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    int insertSelective(OrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_goods
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    List<OrderGoods> selectByExample(OrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_goods
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    OrderGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_goods
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    int updateByExampleSelective(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_goods
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    int updateByExample(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_goods
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    int updateByPrimaryKeySelective(OrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_goods
     *
     * @mbg.generated Sat Jul 03 22:27:45 CST 2021
     */
    int updateByPrimaryKey(OrderGoods record);
}
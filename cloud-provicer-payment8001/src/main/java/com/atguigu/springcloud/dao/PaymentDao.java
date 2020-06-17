package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description: dao
 * @author: yinzengxiang
 * @create: 2020-06-15 17:14
 **/
@Mapper
public interface PaymentDao {

    public  int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}

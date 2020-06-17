package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2020
 * @description: json封装实体类
 * @author: yinzengxiang
 * @create: 2020-06-15 17:11
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T     data;


    public  CommonResult(Integer code,String message){
        this(code,message,null);
    }



}
package com.pension.pro.utils;

import lombok.Data;

@Data
public class JsonMassage<T> {
    private Integer code;   //错误代码0成功1失败
    private String msg;     //
    private Integer count;  //总条数
    private T data;         //数据
}

package com.itheima.domain;

import lombok.Data;

import java.util.Date;


public@Data  class Items {
    private Integer id;
    private String name;
    private Double price;
    private String pic;
    private Date createtime;
    private String detail;
}

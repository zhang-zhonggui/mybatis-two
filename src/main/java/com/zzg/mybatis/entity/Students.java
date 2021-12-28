package com.zzg.mybatis.entity;

import lombok.Data;
@Data
public class Students {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Grade grade;
}

package com.zzg.mybatis.entity;

import lombok.Data;

@Data
public class BasePage {
    private Integer PageNumber;
    private Integer PageCount;
    public  Integer getIndex(){
        return (PageCount-1)*PageCount;
    }
}

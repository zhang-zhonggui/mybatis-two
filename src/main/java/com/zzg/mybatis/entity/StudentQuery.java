package com.zzg.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentQuery extends BasePage {
    private String name;
    private Integer minAge;
    private Integer maxAge;
}

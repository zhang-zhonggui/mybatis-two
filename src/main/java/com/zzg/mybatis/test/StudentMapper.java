package com.zzg.mybatis.test;

import com.zzg.mybatis.entity.StudentQuery;
import com.zzg.mybatis.entity.Students;

import java.util.List;

public interface StudentMapper {

    List<Students> studentQuery(StudentQuery query);

    Long queryTotalCount(StudentQuery query);
}

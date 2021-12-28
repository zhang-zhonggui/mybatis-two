package com.zzg.mybatis.test;

import com.zzg.mybatis.entity.StudentQuery;
import com.zzg.mybatis.entity.Students;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class JavaTest {
    SqlSession sqlSession;
    @Before
    public void before() throws Exception {
        String path = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = factory.openSession();
    }

    @After
    public void end() {
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test(){
        StudentQuery studentQuery=new StudentQuery();
        studentQuery.setName("张");
        studentQuery.setPageNumber(2);
        studentQuery.setPageCount(2);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Students> students1 = mapper.studentQuery(studentQuery);
        System.out.println(students1);
        Long aLong = mapper.queryTotalCount(studentQuery);
        System.out.println(aLong);
    }
//    @Test
//    public void testStudent(){
//        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//        List<Students> list = mapper.list();
//        System.out.println(list);
//    }
}

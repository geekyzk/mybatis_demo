package com.em248;

import com.em248.dao.PhotoMapper;
import com.em248.pojo.Photo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by tian on 2017/5/2.
 */
public class Application {


    @Test
    public void test() throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        PhotoMapper mapper = sqlSession.getMapper(PhotoMapper.class);
        Photo photo = mapper.selectByPrimaryKey("4fcd1a6d-67f7-4929-8b60-e446c8c015be");
        System.out.println(photo.getName());
    }



}

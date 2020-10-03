package com.dao;

import java.util.List;

import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.stereotype.Component;

import com.entity.Teacher;


public interface TeacherDao {
//      void add(Teacher tea);
      List<Teacher> getAll();
      Teacher findTeacher(Teacher tea);
}

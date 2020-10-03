package com.biz;

import java.util.List;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.stereotype.Component;

import com.entity.Teacher;

public interface TeacherBiz {
//	void add(Teacher tea);
	List<Teacher> getAll();
	Teacher findTeacher(Teacher tea);
	
}

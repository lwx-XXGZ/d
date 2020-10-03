package com.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.biz.TeacherBiz;
import com.dao.TeacherDao;
import com.entity.Teacher;


@Service
public class TeacherBizImpl implements TeacherBiz{

	@Resource(name="teacherDao")    //这里的name直接传dao类的首字母小写就行了
	private TeacherDao teaDAO;
	

	@Override
	public List<Teacher> getAll() {
		return teaDAO.getAll();
	}

	@Override
	public Teacher findTeacher(Teacher tea) {
		return teaDAO.findTeacher(tea);
	}
	

}

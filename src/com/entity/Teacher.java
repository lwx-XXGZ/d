package com.entity;

import java.util.Date;
/*
 * 实体类：封装Teacher表
 * 1:私有属性 2:get/set方法  3:有参构造   4:无参构造   5:重写toString()方法
 */
public class Teacher {
		private Integer teaId;
		private String teaName;
		private Integer teaAge;
		private Date createDate;    //注意导包时用util包
		
		
		public Teacher() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Teacher(Integer teaId, String teaName, Integer teaAge, Date createDate) {
			super();
			this.teaId = teaId;
			this.teaName = teaName;
			this.teaAge = teaAge;
			this.createDate = createDate;
		}
		public Integer getTeaId() {
			return teaId;
		}
		public void setTeaId(Integer teaId) {
			this.teaId = teaId;
		}
		public String getTeaName() {
			return teaName;
		}
		public void setTeaName(String teaName) {
			this.teaName = teaName;
		}
		public Integer getTeaAge() {
			return teaAge;
		}
		public void setTeaAge(Integer teaAge) {
			this.teaAge = teaAge;
		}
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
		@Override
		public String toString() {
			return "Teacher [teaId=" + teaId + ", teaName=" + teaName + ", teaAge=" + teaAge + ", createDate="
					+ createDate + "]";
		}
}



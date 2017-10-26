package com.zhidi.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private String name;
	private Integer id;
	private String sex;
	/*@DateTimeFormat(pattern="yyyy-MM-dd")*/
	private Date birthday;
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", sex=" + sex + ", birthday=" + birthday + "]";
	}
	
	

}

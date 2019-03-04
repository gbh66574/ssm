package com.entor.entity;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;


public class Student {

	private int id;
	private String name;
	private String username;
	private String password;
	private int sex;
	private int age;
	@JSONField(format="yyyy-MM-dd")
	private Date birthday;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", sex="
				+ sex + ", age=" + age + ", birthday=" + birthday + ", createTime=" + createTime + "]";
	}
}

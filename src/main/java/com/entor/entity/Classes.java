package com.entor.entity;

public class Classes {
	private int id;
	private String name;
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
	@Override
	public String toString() {
		return "Classes [id=" + id + ", name=" + name + "]";
	}
	public Classes(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Classes() {
		super();
	}
	
}

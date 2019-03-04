package com.entor.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseService<T> {
	public void add(T t);
	public void addMore(List<T> list);
	public void deleteById(Class <?>cls,int id);
	public void deleteMore(Class <?>cls,String ids);
	public void update(T t);
	public  T queryById(Class <?>cls,Serializable id);
	public List<T> queryAll(Class <?>cls);
	public List<T> queryByPage(Class <?>cls,int currentPage,int pageSize);
	public int getTotals(Class <?>cls);
}

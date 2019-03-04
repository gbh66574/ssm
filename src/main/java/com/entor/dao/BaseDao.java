package com.entor.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
/**
 * 泛型父接口，基本的数据库持久层对象
 * @author Administrator
 *
 * @param <T>
 */


public interface BaseDao<T> {
	public void add(T t);
	public void addMore(List<T> list);
	public void deleteById(Class <?>cls,Serializable id);
	public void deleteMore(Class <?>cls,String ids);
	public void update(T t);
	public  T queryById(Class <?>cls,Serializable id);
	public List<T> queryAll(Class <?>cls);
	public List<T> queryByPage(Class <?>cls,Map<String, Integer>map);
	public int getTotals(Class <?>cls);
}

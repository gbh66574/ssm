package com.entor.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.BaseDao;


import com.entor.entity.Student;
import com.entor.service.BaseService;


@Service("baseService")
public class BaseServiceimpl<T> implements BaseService<T> {

	@Resource
	private BaseDao<T> baseDao;
	@Override
	public void add(T t) {
		baseDao.add(t);
	}

	@Override
	public void addMore(List<T> list) {
		baseDao.addMore(list);
	}

	@Override
	public void deleteById(Class<?> cls, int id) {
		baseDao.deleteById(cls, id);
	}

	@Override
	public void deleteMore(Class<?> cls, String ids) {
		baseDao.deleteMore(cls, ids);
	}

	@Override
	public void update(T t) {
		baseDao.update(t);
	}

	@Override
	public T queryById(Class<?> cls, Serializable id) {
		return baseDao.queryById(cls, id);
	}

	@Override
	public List<T> queryAll(Class<?> cls) {
		return baseDao.queryAll(cls);
	}

	@Override
	public List<T> queryByPage(Class<?> cls, int currentPage, int pageSize) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return baseDao.queryByPage(cls, map);
	}

	@Override
	public int getTotals(Class<?> cls) {
		return baseDao.getTotals(cls);
	}

}

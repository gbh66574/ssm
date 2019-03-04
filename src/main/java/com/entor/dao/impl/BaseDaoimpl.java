package com.entor.dao.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import com.entor.dao.BaseDao;

@Service("baseDao")
public class BaseDaoimpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {

	@Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
	@Override
	public void add(T t) {
		getSqlSession().insert(t.getClass().getSimpleName()+".add",t);
	}

	@Override
	public void addMore(List<T> list) {
		getSqlSession().insert(list.get(0).getClass().getSimpleName()+".addMore",list);
	
	}

	@Override
	public void deleteById(Class<?> cls, Serializable id) {
		getSqlSession().delete(cls.getSimpleName()+".deleteById",id);
		
	}

	@Override
	public void deleteMore(Class<?> cls, String ids) {
		getSqlSession().delete(cls.getSimpleName()+".deleteMore",ids.split(","));
	}

	@Override
	public void update(T t) {
		getSqlSession().update(t.getClass().getSimpleName()+".update",t);
	}

	@Override
	public T queryById(Class<?> cls, Serializable id) {
		return getSqlSession().selectOne(cls.getSimpleName()+".queryById",id);
	}

	@Override
	public List<T> queryAll(Class<?> cls) {
		return getSqlSession().selectList(cls.getSimpleName()+".queryAll");
	}

	@Override
	public List<T> queryByPage(Class<?> cls, Map<String, Integer> map) {
		
		return getSqlSession().selectList(cls.getSimpleName()+".queryByPage", map);
	}

	@Override
	public int getTotals(Class<?> cls) {
		return getSqlSession().selectOne(cls.getSimpleName()+".getTotals");
	}
	
}

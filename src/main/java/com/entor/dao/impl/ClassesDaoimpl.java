package com.entor.dao.impl;

import org.springframework.stereotype.Repository;

import com.entor.dao.ClassesDao;
import com.entor.entity.Classes;
import com.entor.entity.Student;
@Repository("classesDao")
public class ClassesDaoimpl extends BaseDaoimpl<Classes> implements ClassesDao{

}

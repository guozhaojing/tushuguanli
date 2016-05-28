package com.tushu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tushu.mapper.UserMapper;
import com.tushu.pojo.User;
import com.tushu.pojo.UserExample;
import com.tushu.pojo.UserExample.Criteria;
import com.tushu.service.test;

@Service
public class textimpl implements test {
	@Autowired
	private UserMapper usermapper;

	@Override
	public User getallbyid(int id) {
		//User user = usermapper.selectByPrimaryKey(id);
		//带查询条件的
		UserExample userExample=new UserExample();
		//添加查询条件
		Criteria criteria = userExample.createCriteria();
		criteria.andIdEqualTo(id); //相当于在sql语句中加入where条件  id=? 并把参数放到？中
		List<User> list = usermapper.selectByExample(userExample);
		if(list!=null && list.size()>0){
			User user=list.get(0);
			return user;
		}
		return null;
	}

}

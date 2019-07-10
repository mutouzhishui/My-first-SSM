package cn.edu.cuit.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.cuit.ssm.mapper.UserMapper;
import cn.edu.cuit.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public boolean findUserByNameAndPwd(String name, String password) {
		// TODO Auto-generated method stub
		int res=userMapper.findUserByNameAndPwd(name,password);
		if (res == 1) {
			return true;
		}
		else {
			return false;
		}
	}

}

package cn.edu.cuit.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.cuit.ssm.entity.Goods;
import cn.edu.cuit.ssm.mapper.GoodsMapper;
import cn.edu.cuit.ssm.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodMapper;
	@Override
	public PageInfo<Goods> findAll(int pageNum,int pageSize) {
		// 告诉从哪里开始
		PageHelper.startPage(pageNum,pageSize);
		List<Goods> ls=goodMapper.findAll();
		//封装
		PageInfo<Goods> pageInfo=new PageInfo<>(ls);
		return pageInfo;
	}

}

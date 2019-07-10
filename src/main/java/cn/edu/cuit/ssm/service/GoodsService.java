package cn.edu.cuit.ssm.service;


import com.github.pagehelper.PageInfo;

import cn.edu.cuit.ssm.entity.Goods;

public interface GoodsService {


	PageInfo<Goods> findAll(int pageNum, int pageSize);
	
}

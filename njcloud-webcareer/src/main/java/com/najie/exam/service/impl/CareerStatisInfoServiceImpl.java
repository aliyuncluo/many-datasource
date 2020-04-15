package com.najie.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.najie.exam.config.DataSourceType;
import com.najie.exam.config.TargetDataSource;
import com.najie.exam.dao.CareerStatisInfoMapper;
import com.najie.exam.domain.entity.CareerStatisInfoPO;
import com.najie.exam.service.CareerStatisInfoService;

@Service
public class CareerStatisInfoServiceImpl implements CareerStatisInfoService{

	@Autowired
	private CareerStatisInfoMapper careerStatisInfoMapper;
	
	@TargetDataSource(DataSourceType.Mysql)
	public int insertCareerStatisInfo(CareerStatisInfoPO careerStatisInfoPO) {
		return careerStatisInfoMapper.saveCareerStatisInfo(careerStatisInfoPO);
	}
}

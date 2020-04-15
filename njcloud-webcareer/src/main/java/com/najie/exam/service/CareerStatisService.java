package com.najie.exam.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.najie.exam.domain.PageResult;
import com.najie.exam.domain.entity.CareerStatisInfo;

public interface CareerStatisService {
	
	public CareerStatisInfo getWeekStatis(String pubDate);
	
//	public List<CareerStatisInfo> getMonthStatis(String pubMonth);
//	
//	public List<CareerStatisInfo> getYearStatics(String year);
}

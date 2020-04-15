package com.najie.exam.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.najie.exam.domain.vo.StatisInfoVO;

@Mapper
public interface CareerStatisMapper {
	
    Map<String,Object> selectIncrUnitNum(StatisInfoVO vo);
    
    Map<String,Object> selectIncrJobNum(StatisInfoVO vo);
    
    Map<String,Object> selectRegisterNum(StatisInfoVO vo);
    
    Map<String,Object> selectTotalUnitNum(StatisInfoVO vo);
    
    Map<String,Object> selectTotalJobNum(StatisInfoVO vo);
}

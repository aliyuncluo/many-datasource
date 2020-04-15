package com.najie.exam.schedule;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.najie.exam.domain.entity.CareerStatisInfo;
import com.najie.exam.domain.entity.CareerStatisInfoPO;
import com.najie.exam.service.CareerStatisInfoService;
import com.najie.exam.service.CareerStatisService;
import com.najie.exam.utils.DateUtils;

@Component
public class CareerStatisScheduled {
    
	private Logger logger = LoggerFactory.getLogger(CareerStatisScheduled.class);
	
	@Autowired
	private CareerStatisInfoService careerStatisInfoService;
	@Autowired
	private CareerStatisService careerStatisService;
	
	@Scheduled(cron = "${najie.cron.careerstatis}")
	public void execute() throws Exception {
		//获取前一天的日期
		Date prevDay = DateUtils.getPreviousDay(new Date(), 1);
		String pubDate=DateUtils.getDateStr(prevDay, "yyyy-MM-dd");
		CareerStatisInfo careerStatisInfo = careerStatisService.getWeekStatis(pubDate);
		CareerStatisInfoPO careerStatisInfoPO = new CareerStatisInfoPO();
		careerStatisInfoPO.setId(UUID.randomUUID().toString().replace("-", ""));
		careerStatisInfoPO.setIncr_job_num(careerStatisInfo.getIncrJobNum());
		careerStatisInfoPO.setIncr_unit_num(careerStatisInfo.getIncrCustNum());
		careerStatisInfoPO.setTotal_job_num(careerStatisInfo.getTotalJobNum());
		careerStatisInfoPO.setTotal_unit_num(careerStatisInfo.getTotalCustNum());
		careerStatisInfoPO.setRefresh_num(careerStatisInfo.getRefreshTotal());
		careerStatisInfoPO.setRegister_num(careerStatisInfo.getRegisterNum());
		careerStatisInfoPO.setPublic_date(DateUtils.getDate(pubDate , "yyyy-MM-dd"));
		careerStatisInfoPO.setCreate_name("system");
		careerStatisInfoPO.setCreated(new Date());
		careerStatisInfoPO.setUpdate_name("system");
		careerStatisInfoPO.setUpdated(new Date());
		int num = careerStatisInfoService.insertCareerStatisInfo(careerStatisInfoPO);
		logger.info("保存统计记录的条数为："+num);	
	}
}

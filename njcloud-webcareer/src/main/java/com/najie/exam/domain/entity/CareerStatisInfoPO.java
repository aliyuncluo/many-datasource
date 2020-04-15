package com.najie.exam.domain.entity;

import java.util.Date;

import lombok.Data;

@Data
public class CareerStatisInfoPO {
    //ID
	private String id;
	//新增单位数
	private Integer incr_unit_num;
	//新增职位数
	private Integer incr_job_num;
	//总单位数
	private Integer total_unit_num;
	//总职位数
	private Integer total_job_num;
	//刷新数
	private Integer refresh_num;
	//注册数
	private Integer register_num;
	//发布时间
	private Date public_date;
	//创建人ID
	private String create_id;
	//创建人
	private String create_name;
	//创建时间
	private Date created;
	//更新人ID
	private String update_id;
	//更新人
	private String update_name;
	//更新时间
	private Date updated;
}

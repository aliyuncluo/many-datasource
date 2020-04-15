package com.najie.exam.domain;

import java.util.List;

import lombok.Data;

@Data
public class PageResult<T> {
	//分页后的数据
	private List<T> content;
	//页码
	private Integer number;
	//每页记录数
	private Integer size;
	//总页数
	private Integer totalPages;
	//总记录数
	private Long totalElements;
	
	public static <T> PageResult<T> toPageResult(List<T> list,long total,int pageNum, int pageSize){
		 PageResult<T> pageResult = new PageResult<>();
	        int pages = (int)(total%pageSize==0?total/pageSize:total/pageSize+1);
	        pageResult.setContent(list);
			pageResult.setNumber(pageNum);
			pageResult.setSize(pageSize);
			pageResult.setTotalPages(pages);
			pageResult.setTotalElements(total);
			return pageResult;
		
	}
	
}

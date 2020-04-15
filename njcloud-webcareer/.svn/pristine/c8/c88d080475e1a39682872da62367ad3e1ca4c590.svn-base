package com.najie.exam.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.najie.exam.domain.ResponseData;
import com.najie.exam.exception.ServiceException;

@RestControllerAdvice
public class GlobalHandler {

	@ExceptionHandler(value = ServiceException.class)
	public ResponseData<Map> handlerException(Throwable e){
		Map map = new HashMap();
		if(e instanceof ServiceException) {
			ServiceException exception = (ServiceException)e;
			return ResponseData.error(exception.getMessage());
		}
		return null;
	}
}

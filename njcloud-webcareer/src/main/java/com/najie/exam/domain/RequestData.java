package com.najie.exam.domain;

import lombok.Data;

/**
 *公共请求参数
 */
@Data
public class RequestData<T> {

    private T data;

}

package com.najie.exam.config;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ PackageName: com.dcm.more_ds.config
 * @ ClassName: MyDataSource
 * @ Description: 自定义注解TargetDataSource
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TargetDataSource {

    DataSourceType value() default DataSourceType.Sqlserver;
}

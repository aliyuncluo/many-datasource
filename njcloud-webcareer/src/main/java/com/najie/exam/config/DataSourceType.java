package com.najie.exam.config;

/**
 * @ PackageName: com.dcm.more_ds.constant
 * @ ClassName: DataSourceType
 * @ Description: 数据源类型
 * @ Auther: xusanduo
 * @ Date: 2018/11/6 14:10
 */

public enum DataSourceType {
    Mysql("mysql"),
    Sqlserver("sqlserver");

    private String name;

    DataSourceType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

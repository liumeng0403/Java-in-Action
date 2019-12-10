package org.lm;

import lombok.Setter;

import java.util.Date;

public class AtSetterForField {

    @Setter
    private Long id;
    private String name;
    private Date date;

    /**
     * @Setter on field
     * 1.自动生成 默认构造函数
     * 2.为指定字段 自动生成 setter 方法
     */

}

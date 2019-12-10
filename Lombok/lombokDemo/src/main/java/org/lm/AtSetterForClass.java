package org.lm;

import lombok.Setter;

import java.util.Date;

@Setter
public class AtSetterForClass {

    private Long id;
    private String name;
    private Date date;

    /**
     * @Setter on class
     * 1.自动生成 默认构造函数
     * 2.自动为每个字段生成 setter 方法
     */

}

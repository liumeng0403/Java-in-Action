package org.lm;

import lombok.ToString;

import java.util.Date;

@ToString
public class AtToString {

    private Long id;
    private String name;
    private Date date;

    /**
     *@ToString
     * 1.自动生成 默认构造函数
     * 2.自动生成 toString 方法
     */

}

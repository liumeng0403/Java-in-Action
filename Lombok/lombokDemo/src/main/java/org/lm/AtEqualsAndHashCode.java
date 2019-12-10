package org.lm;

import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode
public class AtEqualsAndHashCode {
    private Long id;
    private String name;
    private Date date;

    /**
     * @EqualsAndHashCode
     * 1.自动生成 默认构造函数
     * 2.自动生成 equals 方法
     * 3.自动生成 canEqual 方法
     * 4.自动生成 hashCode 方法
     */

}

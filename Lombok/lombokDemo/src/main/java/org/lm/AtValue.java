package org.lm;

import lombok.Value;

import java.util.Date;

@Value
public class AtValue {
    private Long id;
    private String name;
    private Date date;

    /**
     * @Value
     * 1.自动生成 全字段的构造函数，但是不生成 默认构造函数
     * 2.自动生成 每个字段的 getter
     * 3.自动生成 equals 方法
     * 4.自动生成 hashCode 方法
     * 5.自动生成 toString 方法
     */

}

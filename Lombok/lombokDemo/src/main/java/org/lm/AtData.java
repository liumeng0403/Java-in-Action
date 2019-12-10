package org.lm;

import lombok.Data;

import java.util.Date;

@Data
public class AtData {

    private Long id;
    private String name;
    private Date date;

    /**
     * @Data：
     * 1.自动生成默认的构造函数
     * 2.自动生成所有字段的 getter setter
     * 3.自动生成 equals 方法
     * 4.自动生成 canEqual 方法
     * 5.自动生成 hashCode 方法
     * 6.自动生成 toString 方法
     */

}

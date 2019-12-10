package org.lm;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class AtAllArgsConstructor {

    private Long id;
    private String name;
    private Date date;

    /**
     * @AllArgsConstructor
     * 1.自动生成一个 全字段的构造函数 但是 不在生成默认构造函数
     */

}

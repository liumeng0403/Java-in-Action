package org.lm;

import lombok.Getter;

import java.util.Date;

@Getter
public class AtGetterForClass {
    private Long id;
    private String name;
    private Date date;

    /**
     * @Getter on class
     * 1.自动生成 默认构造函数
     * 2.为每个字段 自动生成 getter 方法
     */

}

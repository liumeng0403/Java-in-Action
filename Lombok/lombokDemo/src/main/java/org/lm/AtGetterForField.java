package org.lm;

import lombok.Getter;

import java.util.Date;

public class AtGetterForField {
    @Getter
    private Long id;
    private String name;
    private Date date;

    /**
     * @Getter on field
     * 1.自动生成 默认构造函数
     * 2.为指定字段 自动生成 getter 方法
     */

}

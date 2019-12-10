package org.lm;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
public class AtSlf4j {

    private Long id;
    private String name;
    private Date date;

    public void printLog(){
        log.info("lombok slf4j annotation!");
    }

    /**
     * @Slf4j
     * 1.自动生成 默认构造函数
     * 2.自动生成 一个 Logger 类型 的属性 log
     */

}

package org.lm;

import lombok.NonNull;

import java.util.Date;

public class AtNonNull {
    @NonNull
    private Long id;
    private String name;
    private Date date;

    /**
     * @NonNull
     * 1.自动生成 默认构造函数
     * 2.自动为指定字段做非空检查，为空则抛出空指针异常
     */

}

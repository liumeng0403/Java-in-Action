package org.lm;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
public class AtRequiredArgsConstructor {
    private Long id;
    private final String name;
    @NonNull
    private Date date;

    /**
     * @RequiredArgsConstructor
     * 1.用在 类 上，使用类中所有带有 @NonNull 注解的或者带有 final 修饰的成员变量生成对应的构造方法
     *   但是 不自动生成 默认构造函数
     */

}

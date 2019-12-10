package org.lm;

import lombok.Synchronized;

public class AtSynchronized {

    private final Object readLock=new Object();

    @Synchronized
    public static void method1(){
        System.out.println("method 01");
    }

    @Synchronized
    public void method2(){
        System.out.println("method 02");
    }

    @Synchronized("readLock")
    private void method3(){
        System.out.println("method 03");
    }

    /**
     * @Synchronized
     * 1.自动生成 默认构造函数
     * 2.用在 类方法 或者 实例方法 上，效果和 synchronized 关键字相同，
     *   区别在于锁对象不同，对于类方法和实例方法，synchronized 关键字的锁对象分别是类的 class 对象和 this 对象，
     *   而 @Synchronized 的锁对象分别是 私有静态 final 对象 lock 和 私有 final 对象 lock，
     *   当然，也可以自己指定锁对象
     */

}

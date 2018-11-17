package com.sunny.designPattern.build.prototype;

/**
 * 原型模式
 * 定义：创建重复对象，保证性能
 * 注意点：通过拷贝一个现有对象生成新对象。浅拷贝（实现Cloneable）、深拷贝（序列化）。
 * 
 * @author dell
 *
 */
public class PrototypeMain {

    public static void main(String[] args) throws Exception {
        Teacher t1 = new Teacher();
        t1.setName("teacherA");

        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setT(t1);

        Student s2 = s1.clone();
        Student s3 = s1.deepClone();

        Teacher t2 = s2.getT();
        Teacher t3 = s3.getT();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}

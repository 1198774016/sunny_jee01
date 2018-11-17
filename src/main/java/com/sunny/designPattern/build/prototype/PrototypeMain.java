package com.sunny.designPattern.build.prototype;

/**
 * ԭ��ģʽ
 * ���壺�����ظ����󣬱�֤����
 * ע��㣺ͨ������һ�����ж��������¶���ǳ������ʵ��Cloneable������������л�����
 * 
 * @author dell
 *
 */
public class PrototypeMain {

    public static void main(String[] args) throws Exception {
        Teacher t1 = new Teacher();
        t1.setName("teacherA");

        Student s1 = new Student();
        s1.setName("����");
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

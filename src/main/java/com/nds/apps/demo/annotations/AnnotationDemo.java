package com.nds.apps.demo.annotations;


public class AnnotationDemo
{
    public static void main(String[] args) {
        Student s=new Student();
        s.studentName="student";
        GoodClass annotation = s.getClass().getAnnotation(GoodClass.class);
        System.out.println(annotation.count());
    }
}

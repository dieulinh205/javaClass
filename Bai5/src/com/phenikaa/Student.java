package com.phenikaa;

public class Student<T> {

//    private int ID;
//    public static int count;
//    private String name;
//    //private int age;
//
//    public Student(String name) {
//        this.name = name;
//        //this.age = age;
//        this.ID = ++count;
//    }
//
//    public Student() {
//    }
//
//    public static int id() {
//        ++count;
//        return count;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
////    public int getAge() {
////        return age;
////    }
//
////    public void setAge(int age) {
////        this.age = age;
////    }
//
//    //@Override
////    public String toString() {
////        return "Student{" +
////                "ID=" + ID +
////                ", name='" + name + '\'' +
////                ", age=" + age +
////                '}';
////    }


    private T id;
    public String name;

    public Student(){

    }

    public Student(T id, String name) {
        this.id = id;
        this.name=name;

    }

    public T getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
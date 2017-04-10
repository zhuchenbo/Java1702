package java1702.javase.newoop;

import sun.reflect.generics.tree.VoidDescriptor;

/**
 * Created by xiaozhu
 * on 2017/4/1
 */
public class Human {
    private String name;//name 姓名
    private char gender;//gender 性别
    private int age;//age  年龄
    private double height;//height  身高
    private double weight;// weight 体重

//    public Human() {
//        name=18;
//    }

    public Human(String name, char gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }



    public static void main(String[] args) {
//        Human human = new Human("Tom", 'M', 19, 1.7, 56);
//        System.out.println(human.name);
//        System.out.println(human.age);
//        System.out.println(human.gender);
//        System.out.println(human.height);
//        System.out.println(human.weight);

    }

    public void study() {
        //study 学习
    }

    public void work() {
        //work 工作
    }

    public void eat() {
        //eat 吃饭
    }

    public void sleep() {
        //sleep 睡觉
    }
}

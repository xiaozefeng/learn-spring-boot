package com.gz.learnspringboot.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author xiaozefeng
 */
@Getter
@Setter
public class Person implements Serializable{
    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public static  Person of(String name, int age) {
        return new Person(name, age);
    }

}

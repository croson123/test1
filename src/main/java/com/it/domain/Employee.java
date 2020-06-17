package com.it.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Employee {

    Integer id;

    @Min(value=0,message="年龄最小值为{value}")
    Integer age ;

    @NotNull(message = "姓名不可以为空！")
    String name ;

    @NotNull(message = "性别是男或女")
    String sex;

    String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", age:" + age +
                ", name:'" + name + '\'' +
                ", sex:'" + sex + '\'' +
                ", address:'" + address + '\'' +
                '}';
    }
}

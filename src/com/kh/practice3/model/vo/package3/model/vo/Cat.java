package com.kh.practice3.model.vo.package3.model.vo;

public class Cat extends Animal{

    private String location;
    private String color;

    public Cat(){
    }

    public Cat(String name, String kinds, String location, String color) {
        super(name, kinds);
        this.location = location;
        this.color = color;
    }

    @Override
    public void speak() {
        System.out.printf(super.toString() + " %s에 서식하며, 색상은 %s입니다.\n", location, color);
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

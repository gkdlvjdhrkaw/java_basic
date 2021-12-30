package com.kh.practice3.model.vo.package3.controller;

import com.kh.practice3.model.vo.package3.model.vo.Animal;
import com.kh.practice3.model.vo.package3.model.vo.Cat;
import com.kh.practice3.model.vo.package3.model.vo.Dog;


public class AnimalManager {

    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Dog("뽀삐", "푸들", 3);
        animals[1] = new Cat("나비", "코리안숏헤어", "대전시 서구", "노랑색");
        animals[2] = new Cat("야옹", "러시안블루", "대전시 증구", "시멘트색");
        animals[3] = new Dog("불도기", "불독", 6);
        animals[4] = new Dog("치치", "치와아", 2);

        for (Animal a : animals) {
            a.speak();
        }




    } // main end
} // class end

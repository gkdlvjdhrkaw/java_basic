package com.kh.practice.chap02_abstractNinterface.model.vo;

public interface Phone {

    String makeCall();  // 전화걸기
    String takeCall();  // 전화받기

    public char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};

}

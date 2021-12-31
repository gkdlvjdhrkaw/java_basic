package com.kh.practice.chap02_abstractNinterface.model.vo;

public class V40 extends SmartPhone implements NotePen{

    @Override
    public String picture() {
        return "1200, 1600만 트리플 카메라";
    }

    @Override
    public String charge() {
        return "고속 충전, 고속 무선 충전";
    }

    @Override
    public boolean bluetoothPen() {
        return false;
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        return "수신 버튼을 누름";
    }

    @Override
    public String printlnformation() {
        return "V40는 LG에서 만들어졌고 제원은 다음과 같다.";
    }

    @Override
    public String touch() {
        return "정전식";
    }
}

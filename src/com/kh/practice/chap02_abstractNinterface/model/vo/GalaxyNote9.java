package com.kh.practice.chap02_abstractNinterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

    @Override
    public String picture() {
        return "1200만 듀얼 카메라";
    }

    @Override
    public String charge() {
        return "고속 충전, 고속 무선 충전";
    }

    @Override
    public boolean bluetoothPen() {
        return true;
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
        return "갤럭시 노트9은 삼성에서 만들어졌고 제원은 다음과 같다.";
    }

    @Override
    public String touch() {
        return "정전식, 와콤펜 지원";
    }
}

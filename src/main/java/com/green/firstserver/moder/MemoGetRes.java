package com.green.firstserver.moder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoGetRes {
    //아이디 제목 내용 담을수있는 객체
    private int id;
    private String title;
    private String content;
}// 데이터베이스로부터의 데이터를 담을수있음

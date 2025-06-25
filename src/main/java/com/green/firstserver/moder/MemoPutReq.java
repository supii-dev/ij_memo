package com.green.firstserver.moder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//아이디 제목 내용을 받을수 있는 객체를 만들수있는 클레스를 만드시오
@Getter
@Setter
@ToString
public class MemoPutReq {
    private int id;
    private String title;
    private String content;
}

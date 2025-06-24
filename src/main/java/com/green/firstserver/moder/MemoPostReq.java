package com.green.firstserver.moder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemoPostReq {// 메모고 포스트방식으로 요청때 들어왓다
    private String title;
    private String content; //setter, 생성자
}// 클라이언트로부터 데이터를 담을수있음

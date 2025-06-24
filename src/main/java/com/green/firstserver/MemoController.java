package com.green.firstserver;

import com.green.firstserver.moder.MemoGetOneRes;
import com.green.firstserver.moder.MemoGetRes;
import com.green.firstserver.moder.MemoPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//빈(Bean)등록, 스프링 컨테이너 객체 생성을 대리로 맡긴다 요청 / 응답 담당자
@RequiredArgsConstructor //롬복에있는 에노테이션
public class MemoController {

    private final MemoService memoService;//파이널은 무조건 값을 넣어야함
//    public MemoController(MemoService memoService) {
//        this.memoService = memoService;
//    }

    //DI 받는방법 3가지 (주소값이 들어오는것)
    //1. 필드주입
    //2. setter 주입 (메소드주입)
    //3. 생성자주입

    @GetMapping("/memo")
    public List<MemoGetRes> getMemo() {
        return memoService.selMemoList();
    }
    @GetMapping("/memo/{id}")
    public MemoGetOneRes getMemo(@PathVariable int id) {
        System.out.println("getMemo: " + id);
        return memoService.selMemo(id);
    }
    @PostMapping("/memo")
    public String postMemo(@RequestBody MemoPostReq req){ //빨갛게 뜨면 알트 누르고 앤터, @RequestBody 제이슨 데이터를 받을거야
        System.out.println("post memo req: " + req);
        int result = memoService.insMemo(req);
        return result == 1 ? "성공":"실패";
    }
}

package com.green.firstserver;

import com.green.firstserver.moder.MemoGetOneRes;
import com.green.firstserver.moder.MemoGetRes;
import com.green.firstserver.moder.MemoPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service //빈등록 요청과 응답 담당자 아님
public class MemoService {
    //persistence DB 작업처리(로직+DB작업 지시)
    private final MemoMapper memoMapper;

    //생성자로 주입받고싶음

    public int insMemo(MemoPostReq req){
        return memoMapper.insMemo(req);
    }
    public List<MemoGetRes> selMemoList(){
        return memoMapper.selMemoList();
    }
    public MemoGetOneRes selMemo(int id){
        return memoMapper.selMemo(id);
    }
}

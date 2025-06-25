package com.green.firstserver;

import com.green.firstserver.moder.MemoGetOneRes;
import com.green.firstserver.moder.MemoGetRes;
import com.green.firstserver.moder.MemoPostReq;
import com.green.firstserver.moder.MemoPutReq;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

// 인터페이스가 implements한 클래스가 만들어지고 그
// 클래스를 객체화하고(주소값이 생김) 그 객체 주소값을 스프링 컨테이너가 들고있는다
// 스프링 컨테이너가 객체 주소값을 들고 있을수 있는건 빈등록이 되었기 때문
// 주소값이들어오면 주소값을 사용할수있다

@Mapper
public interface MemoMapper {
    //insert,update,delete 작업은 메소드 만들 때 리턴타입 int
    int insMemo(MemoPostReq req);// 똑같아야 연결 ,내용이있는 객체를 만들수있다
   List<MemoGetRes> selMemoList();
    MemoGetOneRes selMemo(int id);
    int updMemo(MemoPutReq req);
    int delMemo(int id);
}

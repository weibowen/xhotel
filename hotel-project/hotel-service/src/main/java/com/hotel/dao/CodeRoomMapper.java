package com.hotel.dao;

import com.hotel.po.CodeRoom;
import com.hotel.po.CodeRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeRoomMapper {
    int countByExample(CodeRoomExample example);

    int deleteByExample(CodeRoomExample example);

    int deleteByPrimaryKey(String roomCode);

    int insert(CodeRoom record);

    int insertSelective(CodeRoom record);

    List<CodeRoom> selectByExample(CodeRoomExample example);

    CodeRoom selectByPrimaryKey(String roomCode);

    int updateByExampleSelective(@Param("record") CodeRoom record, @Param("example") CodeRoomExample example);

    int updateByExample(@Param("record") CodeRoom record, @Param("example") CodeRoomExample example);

    int updateByPrimaryKeySelective(CodeRoom record);

    int updateByPrimaryKey(CodeRoom record);
}
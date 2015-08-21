package com.hotel.dao;

import com.hotel.po.CodeRoomType;
import com.hotel.po.CodeRoomTypeExample;
import com.hotel.po.CodeRoomTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeRoomTypeMapper {
    int countByExample(CodeRoomTypeExample example);

    int deleteByExample(CodeRoomTypeExample example);

    int deleteByPrimaryKey(CodeRoomTypeKey key);

    int insert(CodeRoomType record);

    int insertSelective(CodeRoomType record);

    List<CodeRoomType> selectByExample(CodeRoomTypeExample example);

    CodeRoomType selectByPrimaryKey(CodeRoomTypeKey key);

    int updateByExampleSelective(@Param("record") CodeRoomType record, @Param("example") CodeRoomTypeExample example);

    int updateByExample(@Param("record") CodeRoomType record, @Param("example") CodeRoomTypeExample example);

    int updateByPrimaryKeySelective(CodeRoomType record);

    int updateByPrimaryKey(CodeRoomType record);
}
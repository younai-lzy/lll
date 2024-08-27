package com.sina.mapper;



import com.sina.bean.Sugar;
import com.sina.bean.SugarTwo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SugarMapper {
    List<Sugar> getList1();

    List<Sugar> getList2();

    List<Sugar> getList3();

    List<SugarTwo> getList4();

}

package com.sina.service.impl;


import com.sina.bean.Sugar;
import com.sina.bean.SugarTwo;
import com.sina.mapper.SugarMapper;
import com.sina.service.SugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SugarServiceImpl implements SugarService {
    @Autowired
    SugarMapper sugarMapper;

    @Override
    public List<Sugar> getList1() {
        return sugarMapper.getList1();
    }

    @Override
    public List<Sugar> getList2() {
        return sugarMapper.getList2();
    }

    @Override
    public List<Sugar> getList3() {
        return sugarMapper.getList3();
    }

    @Override
    public List<SugarTwo> getList4() {
        return sugarMapper.getList4();
    }
}

package com.sina.controller;



import com.sina.bean.Sugar;
import com.sina.bean.SugarTwo;
import com.sina.service.SugarService;
import com.sugar.SugarUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class SugarController {

    @Autowired
    SugarService sugarService;

    @RequestMapping("/list1")
    public Map getList1(){
        List<Sugar> list = sugarService.getList1();
        return SugarUtil.getMapData(list);
    }

    @RequestMapping("/list2")
    public Map getList2(){
        List<Sugar> list = sugarService.getList2();
        return SugarUtil.getBarData(list);
    }

    @RequestMapping("/list3")
    public Map getList3(){
        List<Sugar> list = sugarService.getList3();
        return SugarUtil.getPieData(list);
    }


    /**
     *  1.需要重新创建实体
     *  2.需要创建list表头信息
     * @return
     */
    @RequestMapping("/list4")
    public Map getList4(){
        List<SugarTwo> list = sugarService.getList4();
        List  list1 = new ArrayList<>(); //表头信息
        list1.add("类别");
        list1.add("新用户");
        list1.add("老用户");
        return SugarUtil.getTablePlayData(list1,list);
    }
}

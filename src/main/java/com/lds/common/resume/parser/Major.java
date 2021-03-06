package com.lds.common.resume.parser;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author wx
 * @version 1.0.0
 * @className Major
 * @description 专业
 * @date 2019/12/6 15:41
 */
public class Major {

    private static Map<String,String> marjorMap = new HashMap();

    public static String getMajor(String content){
        String major = "";
        Iterator<String> iterator = marjorMap.keySet().iterator();
        while (iterator.hasNext()){
            major = iterator.next();
            if( content.toLowerCase().contains(major.toLowerCase())){
                return major;
            }
        }
        return "";
    }

    static {
        marjorMap.put("电子信息工程","电子信息工程");
        marjorMap.put("计算机科学与技术","计算机科学与技术");
        marjorMap.put("电气工程及其自动化","电气工程及其自动化");
        marjorMap.put("通信工程","通信工程");
        marjorMap.put("电子科学与技术","电子科学与技术");
        marjorMap.put("集成电路设计与集成系统","集成电路设计与集成系统");
        marjorMap.put("计算机科学","计算机科学");
        marjorMap.put("计算机工程","计算机工程");
        marjorMap.put("计算机网络","计算机网络");
        marjorMap.put("计算机应用","计算机应用");
        marjorMap.put("软件工程","软件工程");
        marjorMap.put("软件技术","软件技术");
        marjorMap.put("计算机信息管理","计算机信息管理");
        marjorMap.put("网络工程","网络工程");
        marjorMap.put("计算机辅助设计","计算机辅助设计");
        marjorMap.put("机械设计制造及其自动化","机械设计制造及其自动化");
        marjorMap.put("机械电子工程/机电一体化","机械电子工程/机电一体化");
        marjorMap.put("机械工程及自动化","机械工程及自动化");
        marjorMap.put("机械制造工艺与设备","机械制造工艺与设备");
        marjorMap.put("制造自动化与测控技术","制造自动化与测控技术");
        marjorMap.put("材料成型及控制工程","材料成型及控制工程");
        marjorMap.put("过程装备与控制工程","过程装备与控制工程");
        marjorMap.put("模具设计与制造","模具设计与制造");
        marjorMap.put("微机电系统工程","微机电系统工程");
        marjorMap.put("车辆工程","车辆工程");
        marjorMap.put("建筑工程","建筑工程");
        marjorMap.put("道路与桥梁","道路与桥梁");
        marjorMap.put("工业与民用建筑","工业与民用建筑");
        marjorMap.put("工程造价管理","工程造价管理");
        marjorMap.put("建筑环境与设备工程","建筑环境与设备工程");
        marjorMap.put("艺术设计","艺术设计");

    }
}

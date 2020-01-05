package com.rongflag.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {

    private static Map<String, Object>map =new HashMap();

    public static void put(String key,Object obj){
        if(StringUtils.isNotBlank(key) && obj!= null && !map.containsKey(key)){
            map.put(key,obj);
        }
    }

    public static Object getInstance(String key){
        return map.get(key);
    }
}

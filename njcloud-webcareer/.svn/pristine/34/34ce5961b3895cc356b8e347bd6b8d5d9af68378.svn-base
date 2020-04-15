package com.najie.exam.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;


import lombok.Data;

public class ObjectUtil {
	private static Logger logger=LoggerFactory.getLogger(ObjectUtil.class);

    /**
     * @desc 判断一个实体对象是否为空
     * @param obj
     * @return true 为空  false 不为空
     * @throws IllegalAccessException
     */
    public static Boolean entityISEmpty(Object obj) throws IllegalAccessException {
        Boolean flag = true;
        if(obj==null || obj==""){
           return true;
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for(Field field:declaredFields){
            field.setAccessible(true);
            Object o = field.get(obj);
            if(o!=null){
                flag=false;
            }
        }
        return flag;
    }

    /**
     * @desc 将实体类转换为Map
     * @param obj
     * @return
     */
    public static Map<String,Object> entityToMap(Object obj) throws IllegalAccessException {
        Map<String,Object> map = new HashMap<>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            String key = field.getName();
            Object value = field.get(obj);
            map.put(key,value);
        }
        return map;
    }

    /**
     * @desc 将list实体类集合转换为list的Map集合
     * @param list
     * @return
     * @throws IllegalAccessException
     */
    public static List<Map<String,Object>> listEntityToMap(List<? extends Object> list) throws IllegalAccessException {
        List<Map<String,Object>> resultList = new ArrayList<>();
        for(Object obj:list){
              Map<String, Object> map = entityToMap(obj);
            resultList.add(map);
        }
        return resultList;
    }
    /**
     * @desc 初始化对象数据格式
     * @param entity
     * @param <T>
     * @return
     * @throws IllegalAccessException
     */
    public static <T extends Object> T initObjectData(T entity) throws IllegalAccessException {
        Field[] fields = entity.getClass().getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            Class<?> fieldType = field.getType();
            if(fieldType.equals(Integer.class)){
                field.set(entity,0);
            }
            if(fieldType.equals(Long.class)){
                field.set(entity,0L);
            }
            if(fieldType.equals(Double.class)){
                field.set(entity,0.00);
            }
            if(fieldType.equals(Date.class)){
                field.set(entity,new Date());
            }
            if(fieldType.equals(Boolean.class)){
                field.set(entity,false);
            }
            if(fieldType.equals(String.class)){
                field.set(entity,null);
            }
        }
        return entity;
    }

    /**
     * @desc 将Map转换为实体类entity
     * @param map
     * @param clazz
     * @return
     * @throws IllegalAccessException
     */
    public static <T> T mapToEntity(Map<String,Object> map,Class<T> clazz) {
        if(map==null){
            return null;
        }
        T obj = null;
        try {
            obj = clazz.newInstance();
            Field[] fields = obj.getClass().getDeclaredFields();
            for(Field field:fields){
                int mod = field.getModifiers();
                if(Modifier.isStatic(mod)|| Modifier.isFinal(mod)){
                    continue;
                }
                field.setAccessible(true);
                String fieldTypeName = field.getType().getName();
                if(fieldTypeName.equalsIgnoreCase("java.util.Date")){
                    Date datetimestamp = new Date(String.valueOf(map.get(field.getName())));
                    if (datetimestamp==null) {
                        field.set(obj, null);
                    }else{
                        field.set(obj, datetimestamp);
                    }
                }else{
                    field.set(obj,map.get(field.getName()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static void main(String[] args) throws IllegalAccessException {
       Map<String,Object> map = new HashMap<>();
       map.put("id",1L);
       map.put("name","张三");
       map.put("age",20);
       map.put("flag",false);
       map.put("birth",new Date());
       map.put("salary",5000.00);
       Person person = mapToEntity(map, Person.class);
        System.out.println(person.toString());
    }

}

@Data
class Person{
    private Long id;
    private String name;
    private Integer age;
    private Boolean flag;
    private Date birth;
    private Double salary;
}
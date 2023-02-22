package com.hansunping_secondstage.generic_.homework_;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Homework01 {
    //定义个泛型类DAO<T>,在其中定义一个Map成员变量，Map的键为String类型，值为T类型。
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        DAO<String> dao = new DAO<>();
        dao.save("001", "jack");
        dao.save("002", "king");
        dao.save("003", "smith");


        dao.update("003", "milan");



        dao.delete("001");


        ArrayList<String> list = (ArrayList) dao.list();
        for (String s : list
                ) {
            System.out.println(s);

        }
    }


}


class DAO<T> {
    Map<String, T> map = new HashMap<>();


    public void save(String id, T entity) {
        //保存T类型的对象到Map成员变量中
        map.put(id, entity);
    }

    public T get(String id) {
        //从Map中获取id对应的对象
        return map.get(id);
    }

    public void update(String id, T entity) {
        //替换map中key为id的内容，改为entity对象
        map.put(id, entity);
    }

    public List<T> list() {
        //返回map 中存放的所有T对象
        //创建ArrayList
        List<T> list = new ArrayList<>();

        //遍历map
        Set<String> keySet = map.keySet();


        for (String key :
                keySet) {
            list.add(map.get(key));
        }

        return list;
    }


    public void delete(String id) {
        //删除指定的id对象

        map.remove(id);
    }
}

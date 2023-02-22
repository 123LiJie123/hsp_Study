package com.hansunping_secondstage.common_classes.arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysMethod01 {
    public static void main(String[] args) {
//        Integer[] integers = {1, 20, 90, 12, 134, 123};
        Integer[] integers = {123, 134, 12, 90, 20, 1};
        //遍历数组

//1、可以直接使用冒泡排序，也可以直接使用Arrays提供的sort方法排序
//2、因为数组是引用类型，所有通过sort排序后，会直接影响到 实参arr
        Arrays.sort(integers);
//3、 sort重载的，也可以通过传入一个接口 Comparator 实现定制排序\
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int i1 = o2 - o1;
                //当用前面的参数减后面的参数则 是升序
                //当用后面的参数减前面的参数则是降序

                return i1;
            }
        });
        System.out.println("排序后：");


//4、toString返回数组的字符串形式
        System.out.println("\n" + Arrays.toString(integers));


//5、binarySearch通过二分搜索法进行查找，
// 要求必须排好序,如果该数组是无序的则不能使用binarySearch.  如果数组中不存在该元素则返回-1
        int index = Arrays.binarySearch(integers, 12);
        System.out.println(index);


//copyOf数组元素的复制  从数组【original】中拷贝【newLength】个元素到新数组中
        Integer[] newArr = Arrays.copyOf(integers, 100);

        System.out.println(Arrays.toString(newArr));


//fill 数组元素的填充
        Integer[] num = new Integer[]{9, 3, 2};
        //解读：
        //用【val】的数去填充 num数组， 可以理解成是用【val】去替换数组的所有元素
        Arrays.fill(num, 99);
        System.out.println(Arrays.toString(num));


//equals  比较两个数组内容是否完全一致,
// 如果两个数组完全一样则返回true，否则返回false
        Integer[] integers01 = {123, 134, 12, 90, 20, 1};
        Integer[] integers02 = {123, 134, 12, 90, 1, 20};
        System.out.println(Arrays.equals(integers01, integers02));


//asList 将一组值，转换成List
//        asList 的形参是以可变参数来定义的，所以可以添加数组
        List<Integer> list01 = Arrays.asList(integers01);   //方式一
        List<Integer> list02 = Arrays.asList(2, 3, 4, 123, 234);   //方式二
        System.out.println(list01);
    }
}

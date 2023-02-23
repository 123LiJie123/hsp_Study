package com.hansunping_thirdstage_.reflect_.class_;

public class GetClass_ {
    /**
     * 演示得到Class对象各种方式（6种）
     *
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //前提：已知一个类的全类名，且该类的类路径下，可通过Class类的静态方法forName()获取，可能抛出ClassNotFoundException

        //1、Class.forName
        String classAllPath = "com.hansunping_thirdstage_.reflect_.class_.Car";
        Class<?> aClass1 = Class.forName(classAllPath);
//        Car o = (Car) aClass1.newInstance();
//        System.out.println(o.getClass());
        System.out.println(aClass1);

        //2、类名.class,应用场景：多用于参数传递
        Class<Car> aClass2 = Car.class;
        System.out.println(aClass2);

        //3、已知某个类的实例，调用该实例的getClass()方法获取Class对象
        Car car = new Car();
        Class<?> aClass3 = car.getClass();//获取到的是运行类型
        System.out.println(aClass3);

        //4、通过类加载器来获取到类的Class对象
        //(1)先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class<?> aClass4 = classLoader.loadClass(classAllPath);
        System.out.println(aClass4);
        //aClass1,aClass2,aClass3,aCla其实是同一个对象


        //5、基本数据（int,char,boolean,float,double,byte,long,short）按如下方式得到Class类对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);   //int
        System.out.println(characterClass);  //char
        System.out.println(booleanClass);  //boolean


        //6、基本数据类型对应的包装类，可以通过.TYPE得到Class对象
        Class<Integer> type1 = Integer.TYPE;
        Class<Character> type2 = Character.TYPE;
        Class<Boolean> type3 = Boolean.TYPE;
        System.out.println(type1);
        System.out.println(type2);
        System.out.println(type3);


        System.out.println(integerClass.hashCode());
        System.out.println(type1.hashCode());

    }
}

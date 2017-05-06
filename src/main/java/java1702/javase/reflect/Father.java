package java1702.javase.reflect;


import java.lang.reflect.ParameterizedType;

/**
 * Created by xiaozhu
 * on 2017/5/5
 */
public class Father<C> {// C - Career
    public Father() {
//        System.out.println(((Class) (((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0])).getSimpleName());
        System.out.println(((Class)(((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0])).getSimpleName());
    }
}

class SonA extends Father<Doctor> {
}

class SonB extends Father<Lawyer> {
}

class SonC extends Father<Programmer> {
}

class SonD extends Father<Programmer> {
}

class Doctor {
}

class Lawyer {
}

class Programmer {
}

class SonTest {
    public static void main(String[] args) {
        SonA sonA = new SonA();
        SonB sonB = new SonB();
        SonC sonC = new SonC();
        SonD sonD = new SonD();
        // son* > career?

        // Doctor
//        Class clazz = SonA.class;
//        Type type = clazz.getGenericSuperclass();
//        ParameterizedType parameterizedType = (ParameterizedType) type;
//        Type[] types = parameterizedType.getActualTypeArguments();
//        Type t = types[0];
//        Class aClass = (Class) t;
//        System.out.println(aClass.getSimpleName());
    }
}

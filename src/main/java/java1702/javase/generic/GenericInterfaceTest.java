package java1702.javase.generic;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * Created by xiaozhu
 * on 2017/4/13
 */
public interface GenericInterfaceTest<T extends Number> {
    void m1(T t);
//
//    void m2(T t1, T t2);
//
//    T m3();
}

class GenericInterfaceTestImpl<T extends Number> implements GenericInterfaceTest<T> {

    @Override
    public void m1(T t) {

    }
}

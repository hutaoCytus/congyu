package Collection体系集合.List接口使用.泛型;

public class MyInterfacelmpl2<T> implements Myinterface<T>{
    @Override
    public T server(T s) {
        System.out.println(s);
        return s;
    }

}

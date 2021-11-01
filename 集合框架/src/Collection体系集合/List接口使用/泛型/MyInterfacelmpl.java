package Collection体系集合.List接口使用.泛型;

public class MyInterfacelmpl implements Myinterface<String>{
    @Override
    public String server(String s) {
        System.out.println(s);
        return s;
    }
}

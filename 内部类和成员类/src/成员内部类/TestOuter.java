package 成员内部类;
public class TestOuter {
    public static void main(String[] args) {
//        //1创建外部对象
//        Outher outher=new Outher();
//        //2创建内部对象
//        Outher.Inner inner=outher.new Inner();
//        inner.show();

        //一步完成
        Outher.Inner inner=new Outher().new Inner();
        inner.show();
    }
}

package 继承;

public class TestDog extends Animal{
    public static void main(String[] args) {
        Dog dog=new Dog();
          dog.breed="萨摩";
          dog.age=2;
          dog.sex="公";
          dog.funcolor="白";


          dog.jie();
          dog.eat();
          dog.drink();
          dog.run();
          Bird fi=new Bird();
          fi.eat();
    }
}

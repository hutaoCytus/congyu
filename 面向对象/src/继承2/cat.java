package 继承2;

import 继承.Animal;//在不同的包里面，还是可以继承

public class cat extends Animal {
        String hobby;
        public int play(int i){
            System.out.println(this.hobby);
            return i;
        }
}

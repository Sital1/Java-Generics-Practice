package Example1;

public class Example1 {

    public static void main(String[] args) {

        /*
        Using objects instead of Generics
         */

        Foo f1 = new Foo();
        f1.x = 5;

        Foo f2 = new Foo();
        f2.x = "Hello";


        /*
        Works from compilation point of view
        But will throw ClassCastException
         */
        int x =  (int) f2.x;

    }
}

package pzn.java.oop.application;

import pzn.java.oop.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld eng = new HelloWorld(){
            public void hello() {
                System.out.println("Hello");
            }

            public void hello(String name) {
                System.out.println("Hello "+ name);
            }
        };

        eng.hello();
        eng.hello("Echo");

        HelloWorld id = new HelloWorld(){
            public void hello() {
                System.out.println("Hai");
            }

            public void hello(String name) {
                System.out.println("Hai "+ name);
            }
        };

        id.hello();
        id.hello("Echo");
    }
}

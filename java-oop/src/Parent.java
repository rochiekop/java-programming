class Parent {
    String name;

    void hello(){
        System.out.println("Parent says ");
    }
}


class Child extends Parent{
    String name;
    void hello(){
        System.out.println("Child says ");
        System.out.println("Parent name is "+super.name);
    }
}
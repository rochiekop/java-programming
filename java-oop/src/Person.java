public class Person {
    String name;
    String address;
    final String country ="Indonesia";


    /*Constructor Overloading*/
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    Person(String paramName){
        this(paramName, null);
    }

    Person(){
        this(null);
    }

    public void sayHello(String name) {
        System.out.println("Hell0 "+name +" , My name is "+this.name);
    }
}

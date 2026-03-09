class Manager extends Employee{
    String address;

    Manager(String name, String address){
        super(name);
        this.address = address;
    }
    Manager(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hello "+name+" , my manager name is "+this.name);
    }

}

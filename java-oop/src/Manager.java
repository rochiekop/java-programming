class Manager {
    String name;
    String address;

    Manager(String name, String address){
        this.name = name;
        this.address = address;
    }
    void sayHello(String name){
        System.out.println("Hello "+name+" , my manager name is "+this.name);
    }

}

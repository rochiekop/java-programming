class VicePresident extends Manager{

    VicePresident(String name){
        super(name, null);
    }

    void sayHello(String name){
        System.out.println("Hello "+name+" , my vp name is "+this.name);
    }
}

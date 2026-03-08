public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Echo","Bandung");
        //manager.name="Echo";

        manager.sayHello("Edi");


        VicePresident vp = new VicePresident("Eko");
        //vp.name = "Eko";
        vp.sayHello("Budi");
    }


}

package application;

public class MultipleConstraintApp {
    public static void main(String[] args) {
        //Data<Manager> managerData = new Data<>(new Manager()); //ERROR
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());

        vicePresidentData.data.sayHello("Eko");


    }

    public static class Employee{

    };

    public static interface CanSay{
        void sayHello(String name);
    }

    public static class Manager extends Employee{

    }

    public static class VicePresident extends Employee implements CanSay{

        @Override
        public void sayHello(String name) {
            System.out.println("Hello from "+name);
        }
    }

    public static class Data<T extends Employee & CanSay>{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public Data() {
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}

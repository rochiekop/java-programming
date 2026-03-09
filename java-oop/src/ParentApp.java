class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name="Budi";

        child.hello();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.hello();
        System.out.println(parent.name);


    }
}

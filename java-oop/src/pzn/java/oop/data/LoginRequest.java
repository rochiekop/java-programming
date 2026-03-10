package pzn.java.oop.data;

public record LoginRequest(String name, String password) {
    public LoginRequest{
        System.out.println("Hello from record");
    }

    public LoginRequest(String name){
        this(name, "");
    }

    public LoginRequest(){
        this("","");
    }

}

package pzn.java.oop.application;

import pzn.java.oop.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("echo", "pass");
        System.out.println(loginRequest.name());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest("echo"));
        System.out.println(new LoginRequest());
    }
}

package pzn.java.oop.application;

import pzn.java.oop.data.LoginRequest;
import pzn.java.oop.error.ValidationException;
import pzn.java.oop.utils.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("echo", null);

        try {
            ValidationUtil.validate(loginRequest);
        }catch(ValidationException | NullPointerException e){
            System.out.println("Error "+e.getMessage());
        }finally {
            System.out.println("Finish");
        }


    }
}

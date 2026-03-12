package pzn.java.oop.application;

import pzn.java.oop.data.CreateUserRequest;
import pzn.java.oop.utils.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setName("Echo");
        createUserRequest.setUsername("echo");
        createUserRequest.setPassword("echo");
        ValidationUtil.validationReflection(createUserRequest);
    }
}

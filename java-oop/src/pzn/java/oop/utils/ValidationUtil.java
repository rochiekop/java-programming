package pzn.java.oop.utils;

import pzn.java.oop.data.LoginRequest;
import pzn.java.oop.error.BlankException;
import pzn.java.oop.error.ValidationException;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.name() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.name().isBlank()) {
            throw new ValidationException("Username is Empty");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is Empty");
        }
    }

    public static void validateRuntime (LoginRequest loginRequest){
        if (loginRequest.name() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.name().isBlank()) {
            throw new BlankException("Username is Empty");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is Empty");
        }
    }
}

package pzn.java.oop.utils;

import pzn.java.oop.annotation.NotBlank;
import pzn.java.oop.data.LoginRequest;
import pzn.java.oop.error.BlankException;
import pzn.java.oop.error.ValidationException;

import java.lang.reflect.Field;

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

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                // validated
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank ");
                    }

                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }

        }
    }
}

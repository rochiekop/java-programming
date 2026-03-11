package pzn.java.oop.error;

public class BlankException extends RuntimeException{
    private String message;
    public BlankException(String message){
        super(message);
    }
}

package pzn.java.oop.application;

import pzn.java.oop.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        ConnectDatabase("username",null);


    }

    public static void ConnectDatabase(String username, String password){
        if(username== null | password == null){
            throw new DatabaseError("Can't connect to database, username or password is null");
        }
    }
}

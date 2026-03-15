package pzn.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        /***
         * Load data
         */
        try {
            Properties properties = new Properties();
            /**
             * Load File
             */
            properties.load(new FileInputStream("application.properties"));

            System.out.println(properties.getProperty("database.username"));
            System.out.println(properties.getProperty("database.password"));
            System.out.println(properties.getProperty("database.port"));
        } catch (FileNotFoundException exception) {
            System.out.println("Data Not Found");
        } catch (IOException exception) {
            System.out.println("Io Exception");
        }

        /***
         * Store data
         */
        try {
            Properties properties = new Properties();
            properties.put("name.first", "Rochi");
            properties.put("name.middle", "Eko");

            properties.store(new FileOutputStream("application.userprofile"), "To store user profile");
        } catch (FileNotFoundException exception) {
            System.out.println("Data Not Found");
        } catch (IOException exception) {
            System.out.println("Io Exception");
        }
    }
}

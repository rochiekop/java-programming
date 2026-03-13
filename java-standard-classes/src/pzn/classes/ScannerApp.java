package pzn.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Name : ");
        String name = scanner.nextLine();
        System.out.print("Input Age : ");
        Integer age = scanner.nextInt();
        System.out.print("is Male? : ");
        boolean isMale = scanner.nextBoolean();

        System.out.println("Name : "+name +" Age : "+age + " is Male "+isMale);
    }
}

package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello word!");
        System.out.println("How are you?");
        String result = scanner.nextLine().toUpperCase(Locale.ROOT);
        if (result.equals("FINE")){
            System.out.println("That is so good");
        }else {
            System.out.println("That is so bad");
        }
    }
}

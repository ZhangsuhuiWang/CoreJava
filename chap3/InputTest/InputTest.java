package InputTest;

import java.io.Console;
import java.util.*;

public class InputTest {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("what is your name?");
//
//        String name = in.nextLine();
//
//        System.out.println("how old are you?");
//        int age = in.nextInt();
//
//        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
//        System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due date:", new Date());
        System.out.printf("%s %tB %<te %<tY", "Due date:", new Date());
    }
}

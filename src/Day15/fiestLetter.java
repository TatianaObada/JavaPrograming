package Day15;
import java.sql.SQLOutput;
import java.util.Scanner;
public class fiestLetter {
    public static void main(String[] args) {

        String str = "xcodeX";//xcodex
        String result = str.replace("x", "a").replace("X", "a");
        System.out.println(result);

    }
}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
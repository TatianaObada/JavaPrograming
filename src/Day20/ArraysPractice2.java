package Day20;
import  java.util.Arrays;
public class ArraysPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];
        /*
        letters[0] = 'A';
        letters[1] = 'B';
        letter[2] = 'C';
        ....
         */

        /*
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }
         */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }

        System.out.println(Arrays.toString(letters));  //[A~Z]


        System.out.println("-------------------------------");

        char[] letters2 = new char[26];  //[Z~A]
        /*for (int i = 0, j = 'Z'; i < letters2.length ; i++, j-- ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }
        System.out.println(Arrays.toString(letters2));*/
        System.out.println("_____________________");
        char chs = 'A';
        for (int i = 0; i < letters2.length; i++, chs++) {
            letters[i] = chs;
        }
        System.out.println(Arrays.toString(letters2));

    }
}

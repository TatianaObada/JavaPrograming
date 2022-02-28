package Day17;

public class FrequencyOfWord {
    public static void main(String[] args) {
            String  str = "JavaJavaJavaJavaJava";
            int frequency = 0;
//                              8 - 4
            for (int i = 0; i <= str.length()-4; i++) {
                String eachSub =    str.substring(i, i+4 );
                //System.out.println(eachSub);

                if(eachSub.equals("Java")){
                    frequency++;
                }

            }
            System.out.println(frequency);
    }
}
/*
2. Write a program that can return the unique characters from a String
            Ex:
                input:
                    AABCCD
                output:
                    BD
            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */
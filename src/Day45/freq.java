package Day45;

public class freq {
    public static void freq(String str){
        String result = "";

        for (int j = 0; j < str.length() ; j++) {
            char ch = str.charAt(j);//to count each character of the string
            int count = 0;

            for (int i = 0; i <str.length() ; i++) { //to find the frequency of each character

                char each = str.charAt(i); //each character of str
                if(ch ==each){
                    count++;
                }
            }
            if(result.contains("" +ch)){
                continue;
            }

            result+=ch;
            result+=count;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        freq("AAABBCDD");
    }



}

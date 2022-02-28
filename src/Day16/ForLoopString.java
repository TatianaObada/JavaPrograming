package Day16;

public class ForLoopString {
    public static void main(String[] args) {
        String str="Wood Spoon";
        //index:       0123456789
        String result= "";//containnthe reversed version of str
        //noopS nedooW
       /* result +=str.charAt( 11);//n
        result +=str.charAt(10);//o
        result +=str.charAt( 9);//0
        result +=str.charAt(8);//p
        result +=str.charAt( 7);//n
        result +=str.charAt(6);//o
        result +=str.charAt( 5);//0
        result +=str.charAt(4);//p
        result +=str.charAt( 3);//n
        result +=str.charAt(2);//o
        result +=str.charAt( 1);//0
        result +=str.charAt(0);//p
*/
        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}

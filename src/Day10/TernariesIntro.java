package Day10;

public class TernariesIntro {
    public static void main(String[] args) {
        int n=100;
        if(n%2==0){
            System.out.println(" Even ");
        } else{
            System.out.println("Odd");
        }
        System.out.println("-------------------------");
        String result1 =(n%2==0)? "Even"  :  "Odd";
        System.out.println(result1);
        System.out.println("___________________");
        int age=23;
        if(age>=23){
            System.out.println("Eligible");//string
        }else{
            System.out.println("Not eligible");//string
        }
        System.out.println("________________________");
        String  rest=(age>=23)? "Eligible" :  "Not eligible";
        System.out.println(rest);

    }
}

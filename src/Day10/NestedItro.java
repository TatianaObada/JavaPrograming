package Day10;

public class NestedItro {
    public static void main(String[] args) {
        int score =40;
        if(score>=0 && score<=100){//if score is valid
            if(score>=60){//if student failed exam
                System.out.println("Passed");
            }else{// if the score is not valid
                System.out.println("Failed");
            }
            System.out.println("-----------------------------------");
            int age =25;
            if(age>=21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }
        }
    }
}

package Day07;

public class RelationalOperators {
    public static void main(String[] args) {
        //>, <, >=, <=
        boolean result1=200>40;//true
        System.out.println("result1 = " + result1);
        boolean result2=300>=150;//true
        System.out.println("result2 = " + result2);
        boolean result3=100>=100;//true
        System.out.println("result3 = " + result3);
        boolean result4=300>=500;//fals
        System.out.println("result4 = " + result4);
        //credit score of 720
        int score=745;
        boolean isEligible=score>=720;//true
    }
}

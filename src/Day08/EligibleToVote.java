package Day08;

public class EligibleToVote {
    public static void main(String[] args) {
        String name="Jone";
        int age=8;
        String citizen="USA";
        boolean isEligible=age>=21 && citizen=="USA";
        //Eligible
        if(isEligible){
            System.out.println("Eligible ");
        }
        //Not Eligible
        if(!isEligible){
            System.out.println("Not Eligible ");
        }
    }
}

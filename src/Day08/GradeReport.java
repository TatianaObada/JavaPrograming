package Day08;

public class GradeReport {
    public static void main(String[] args) {
        int score=95;
        boolean a=score>=90 && score<=100,
                b=score>=80 && score<=89,
                //b=score>=80 && !a,este la fel ca prima
                c=score>=70 && score<=79,
                //c=score!a && !b && score<=79
                d=score>=60 && score<=69,
                e=score>=0 && score<=59;
        if(a){
            System.out.println("Excellent");
        }
        if(b){
            System.out.println("Great");
        }
        if(c){
            System.out.println("Good");
        }
        if(d){
            System.out.println("Passed");
        }
        if(e) {
            System.out.println("Failed");
        }


    }
}
/*
score:
90-100==>Excellent
80-89==>Great
70-79==>Good
60-69==>Passed
0-59==>Failed
 */
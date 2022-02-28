package Day20;

public class MinNumber {
    public static void main(String[] args) {
        int[] numbers={20,1,3,4,5,6};
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min) {
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);
    }
}

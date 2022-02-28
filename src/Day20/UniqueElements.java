package Day20;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words={"Java", "Java", "C#", "Python", "Python"};
        String element=words[0]; // "Java"
        int  frequency=0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(element)){
                frequency++;
            }
        }

    }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Class c = new Class(25, "Word", new int[]{1, 2, 3, 4, 5});
        System.out.println(c.toString());//1
        System.out.println("Number: " + c.getNumber() + ", word: " + c.getWord() + ", Array: " + Arrays.toString(c.getArray()));//2
    }
}

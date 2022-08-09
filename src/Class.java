import java.util.Arrays;

public class Class {
    private int number;
    private String word;
    private int[] array;

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", word='" + word + '\'' +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public Class(int number, String word, int[] array){
        this.number=number;
        this.word=word;
        this.array=array;
    }

}

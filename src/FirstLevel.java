import java.util.Arrays;

public class FirstLevel {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10;
        }
        array[1] = 0;
        array[99] = 0;
        System.out.println(Arrays.toString(array));

    }
}

import java.util.Arrays;

public class inverter {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
        invert.invert(array);
        System.out.println(Arrays.toString(array));
    }
}

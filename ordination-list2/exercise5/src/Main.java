import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        QuickSort qs = new QuickSort();

        int[] vector1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        int[] vector2 = {44, 43, 42, 41, 40, 39, 38};
        int[] vector3 = {31, 32, 33, 34, 99, 98, 97, 96};

        System.out.println("Vector1 before ordination: " + Arrays.toString(vector1));
        System.out.println("Vector1 after ordination: " + qs.quickSort(vector1, 0, vector1.length - 1) + "\n");

        System.out.println("Vector2 before ordination: " + Arrays.toString(vector2));
        System.out.println("Vector2 after ordination: " + qs.quickSort(vector2, 0, vector2.length - 1) + "\n");

        System.out.println("Vector3 before ordination: " + Arrays.toString(vector3));
        System.out.println("Vector3 after ordination: " + qs.quickSort(vector3, 0, vector3.length - 1) + "\n");

    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BubbleSort bs = new BubbleSort();
        MergeSort ms = new MergeSort();

        int []vector1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        int []vector2 = {44, 43, 42, 41, 40, 39, 38};
        int []vector3 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        int []vector4 = {44, 43, 42, 41, 40, 39, 38};

        System.out.println("Vector 1 before ordination with bubble sort: " + Arrays.toString(vector1));
        System.out.println("Vector 1 after ordination with bubble sort: " + bs.bubbleSort(vector1) + "\n");

        System.out.println("Vector 2 before ordination with bubble sort: " + Arrays.toString(vector2));
        System.out.println("Vector 2 after ordination with bubble sort: " + bs.bubbleSort(vector2) + "\n");

        System.out.println("Vector 3 before ordination with merge sort: " + Arrays.toString(vector3));
        System.out.println("Vector 3 after ordination with merge sort: " + ms.mergeSort(vector3, 0, vector3.length -1) + "\n");

        System.out.println("Vector 4 before ordination with merge sort: " + Arrays.toString(vector4));
        System.out.println("Vector 4 after ordination with merge sort: " + ms.mergeSort(vector4, 0, vector4.length -1));

    }
}
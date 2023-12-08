public class Main {
    public static void main(String[] args) {

        BubbleSort bs = new BubbleSort();
        MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();

        int[] vector1 = new int[1500];
        int[] vector2 = new int[1500];
        int[] vector3 = new int[1500];

        for (int i = 1499; i > 0; i--){
            vector1[i] = i;
            vector2[i] = i;
            vector3[i] = i;
        }

        long startTime = System.nanoTime();
        bs.bubbleSort(vector1);
        long finalTime = System.nanoTime();

        long totalTime = finalTime - startTime;

        System.out.println("Total time with Bubble Sort: " + totalTime + "ns");

        startTime = System.nanoTime();
        ms.mergeSort(vector2, 0, vector2.length - 1);
        finalTime = System.nanoTime();

        totalTime = finalTime - startTime;

        System.out.println("Total time with Merge Sort: " + totalTime + "ns");

        startTime = System.nanoTime();
        qs.quickSort(vector3, 0, vector3.length - 1);
        finalTime = System.nanoTime();

        totalTime = finalTime - startTime;

        System.out.println("Total time with Quick Sort: " + totalTime + "ns");

    }
}
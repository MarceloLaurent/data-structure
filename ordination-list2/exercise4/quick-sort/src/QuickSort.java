import java.util.Arrays;

public class QuickSort {

    public QuickSort() {
        super();
    }

    public String quickSort(int[] vector, int begin, int end) {
        if(end > begin) {
            int indexPivot = partition(vector, begin, end);

            quickSort(vector, begin, indexPivot - 1);

            quickSort(vector, indexPivot + 1, end);
        }
        return Arrays.toString(vector);
    }

    private int partition(int[] vector, int begin, int end) {
        int pivot, leftMark, hightMark = end;
        leftMark = begin + 1;
        pivot = vector[begin];

        while(leftMark <= hightMark) {
            while(leftMark <= hightMark && vector[leftMark] <= pivot) {
                leftMark++;
            }

            while(hightMark >= leftMark && vector[hightMark] > pivot) {
                hightMark--;
            }

            if(leftMark < hightMark) {
                change(vector, hightMark, leftMark);
                leftMark++;
                hightMark--;
            }
        }

        change(vector, begin, hightMark);
        return hightMark;
    }

    private void change(int[] vector, int i, int j) {
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }
}

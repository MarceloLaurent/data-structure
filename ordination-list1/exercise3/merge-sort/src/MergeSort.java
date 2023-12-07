import java.util.Arrays;

public class MergeSort {

    public MergeSort() {
        super();
    }

    public String mergeSort(int[] vector, int begin, int end) {

        if(begin < end) {
            int middle = (begin + end) / 2;

            mergeSort(vector, begin, middle);

            mergeSort(vector, middle + 1, end);

            interpolate(vector, begin, middle, end);
        }

        return Arrays.toString(vector);
    }
    private static void interpolate(int[] vector, int begin, int middle, int end) {


        int []newVector = new int[vector.length];

        if (end + 1 - begin >= 0) System.arraycopy(vector, begin, newVector, begin, end + 1 - begin);

        int j = middle + 1;

        for( int k = begin; k <= end; k++){
            if(begin > middle){
                vector[k]= newVector[j++];
            } else if (j > end){
                vector[k] = newVector[begin++];
            } else if(newVector[begin] < newVector[j]){
                vector[k] = newVector[begin++];
            } else {
                vector[k] = newVector[j++];
            }
        }

    }
}


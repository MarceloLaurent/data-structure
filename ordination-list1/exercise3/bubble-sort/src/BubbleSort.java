import java.util.Arrays;

public class BubbleSort {

    public BubbleSort() {
        super();
    }

    public String bubbleSort(int []vector){
        for(int i = 0; i < vector.length; i++){
            for(int j = 0; j < vector.length - 1; j++)
                if(vector[j] > vector[j + 1]){
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
        }
        return Arrays.toString(vector);
    }
}
package task5.services;

import java.util.Arrays;

public class SequenceAnalyzer {
    public int countElementsToDelete(int[] array) {
        if(array == null || array.length == 0) {
            return 0;
        }

        int[] lengthArray = new int[array.length];

        for (int i = 0; i < array.length; i++){
            lengthArray[i] = 1;
            for (int j = i - 1; j >= 0; j--){
                if (array[i] > array[j] && lengthArray[i] < lengthArray[j] + 1){
                    lengthArray[i] = lengthArray[j] + 1;
                }
            }
        }

        return array.length - Arrays.stream(lengthArray).max().getAsInt();
    }
}

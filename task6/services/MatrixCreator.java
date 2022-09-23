package task6.services;

public class MatrixCreator {
    public static int[][] create(int[] array){
        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("Array parameter cannot be null or empty array.");
        }

        int[][] resultMatrix = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                resultMatrix[i][j] = array[(array.length + j + i) % array.length];
            }
        }
        return resultMatrix;
    }
}

package task7.services;

public final class GnomeSort {
    private GnomeSort() {}

    public static void sort(double[] array) {
        var i = 0;
        while (i < array.length - 1) {

            if (array[i] > array[i + 1]) {
                // swap
                var temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

                if(i > 0) {
                    i--;
                }
            }
            else {
                i++;
            }
        }
    }
}

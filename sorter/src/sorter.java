public class sorter {
    public static void main(String[] args) {
        int[] array1 = {9,14,3,2,43,11,58,22,7,5};
        selectionSort(array1);
        for(int i:array1){
            System.out.print(i+" ");
        }

    }

    public static void selectionSort(int[] Array) {
        for (int i = 0; i < Array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j] < Array[index]) {
                    index = j;
                }
            }
            int smallerNumber = Array[index];
            Array[index] = Array[i];
            Array[i] = smallerNumber;
        }
    }

}
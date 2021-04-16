package tugas4;
public class nomer5 {
       public static void printData(int[] data){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
    private static int partition(int[] data, int p, int r){
        int i, j;
        double pivot = data[p];
        i = p-1;
        j = r+1;
        for (;;){
            do {
                i++;
            }
            while (data[i] < pivot);
            do {
                j--;
            }
            while (data[j] > pivot);
            if (i < j){
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
            else{
                return j;
            }
        }
    }
    public static void quickSort(int[] data, int p, int r){
        if (p < r){
            int q = partition(data, p, r);
            quickSort(data, p, q);
            quickSort(data, q+1, r);
        }
    }
    public static void main(String[] args) {
        int[] nilai = {25,7,9,13,3};
        System.out.println("--- before ---");
        printData(nilai);
        quickSort(nilai, 0, nilai.length-1);
        System.out.println("\n--- after ---");
        printData(nilai);
    }
}

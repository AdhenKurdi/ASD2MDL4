package tugas4;
public class nomer6 {
        public static void mergeSort(int[] data, int i, int j){
        int low = i;
        int high = j;
        if (low >= high){
            return;
        }
        int middle = (low+high)/2;
        mergeSort(data, low, middle);
        mergeSort(data, middle+1, high);
        int endLow = middle;
        int startHigh = middle+1;
        while ((i<=endLow) && (startHigh<=high)){
            if (data[low]<data[startHigh]){
                low++;
            }
            else{
                int temp = data[startHigh];
                for (int k=startHigh-1; k>=low; k--){
                    data[k+1] = data[k];
                }
                data[low] = temp;
                low++;
                endLow++;
                startHigh++;
            }
        }
    }
    public static void printData(int[] data){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nilai = {25,7,9,13,3};
        System.out.println("--- before ---");
        printData(nilai);
        mergeSort(nilai, 0, nilai.length-1);
        System.out.println("\n--- after ---");
        printData(nilai);
    }
}

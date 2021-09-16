package Code1.SortingAlgorithms;

public class inertionSort {
    public static void main(String[] args) {
        

        int arr[] = {5,7,-2,4,1,3};


        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

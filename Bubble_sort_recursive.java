public class Bubble_sort_recursive {
    static void bubblesort(int arr[],int n ){
        if (n==1) return;
            for(int j=0 ; j<=n-2 ; j++){
                if( arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            bubblesort(arr, n-1);
           

    }
    public static void main(String[] args) {
        int arr[] = {14,9,15,12,6,8,13};
        int n= arr.length;
        System.out.println("before sorting");
        for(int i = 0;i <n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubblesort(arr, n);

        System.out.println("after sorting");
        for(int i =0 ;i<n ;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
        
    }

    
}

public class SecondLargestElement {
    public static void main(String args[]){
        int arr[]={2,4,1,6,3,9};
        System.out.println("Second largest element="+find(arr,5));
    }
    public static int find(int[] arr,int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[n-1];
    }

}

public class BubbleSort_Example {

	public static void main(String[] args) {
		int arr[]={8,7,9,5,2,6};
        int t;
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length-1-i;j++) {
                if (arr[j]>arr[j+1]) {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
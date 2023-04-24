public class ReverseArray {
    public static void main(String[] args){
       int[] arr={2,5,2,5,2,4};
       arr = reverseArr(arr);
       for (int i : arr){
        System.out.println(i);
       }

    }
    static int[] reverseArr(int[] arr){
        int low=0;
        int high=(arr.length)-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;

        }
        return arr;
    }
    
}

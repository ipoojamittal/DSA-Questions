public class SortedArray {
    public static void main(String[] args){
        int[] arr={3,5,2,6,9};
        sortArray(arr);
        

    }
    static Boolean sortArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
            
           
        }
        return true;
        

    }
}

public class SecondLargestElement{
    public static void main(String[] args){
        
    }
    static int myMethod(int[] arr){
        int res=-1;
        int largest=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){  
                res=largest;
                largest=i;
                
            }
            else if(arr[i]<arr[largest]){
                if(res==-1){  //{10,10,10}10
                    res=i;
                }
                // else if(arr[i]<=arr[largest]){   //{2,4,6}1

                // }
                else if(arr[i]>arr[res]){
                    res=i;

                }
            }
            
            
        }
        return res;
    }
}
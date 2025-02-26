// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    

        public static int lear(int[] arr , int n , int k ){
            
            for( int i =0; i<n; i++){
                if(arr[i] == k ){
                   System.out.println(i);
                    
                    return i;
                }

                
            }
            System.out.println("dont find it ...");
            return -1;
        }
        
        public static int binary( int[] arr , int n , int k ){
            
            int left = 0;
            int right = n-1;
            
            for( int i = 0 ; i < n ; i++){
                
                int mid = left + ( right - left )/2
            
             if(mid == k){
                 return i;
                 }
                
                if(arr[mid] < k){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
             }
            }
           
            return 1;
            
            
            
        }
    
    
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {0,10, 20 , 30 , 40  };
        int n = arr.length;
        int k = 30;
        int result = lear(arr,n,k);
      
        if (result != -1) {
            System.out.println("Search successful! Element found at index: " + result);
        } else {
            System.out.println("Search unsuccessful!");
        }
    }
}
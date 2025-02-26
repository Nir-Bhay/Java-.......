// main.Java
// Use this editor to write, compile and run your Java code online

class main {
    

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
        
        public static int binary(int[] arr, int n, int k) {
            int left = 0;
            int right = n - 1; // Correct the right boundary

            while (left <= right) { // Use a while loop for binary search
                int mid = left + (right - left) / 2;

                if (arr[mid] == k) { // Check the middle element
                    return mid; // Return the index of the found element
                }

                if (arr[mid] < k) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return -1; // Return -1 if the element is not found
        }

    
    
    //find the complexity of it 
    // O(log n) for binary search and O(n) for linear search
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {0,10, 20 , 30 , 40  };
        int n = arr.length;
        int k = 0;
        int result = lear(arr,n,k);
      
        if (result != -1) {
            System.out.println("Search successful! Element found at index: " + result);
        } else {
            System.out.println("Search unsuccessful!");
        }
    }
}



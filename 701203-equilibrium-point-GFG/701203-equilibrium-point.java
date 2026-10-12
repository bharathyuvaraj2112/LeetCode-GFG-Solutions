class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int total=0;
        int leftsum=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
            
        }
        for(int i=0;i<arr.length;i++){
            total-=arr[i];
            
            if(leftsum==total){
                return i;
                
            }
            leftsum+=arr[i];
            
        }
        return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
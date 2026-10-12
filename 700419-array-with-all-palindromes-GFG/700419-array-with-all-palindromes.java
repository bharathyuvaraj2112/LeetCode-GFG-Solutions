class Solution {
    public static boolean isPalinArray(int[] arr) {
        
        for(int n:arr){
            int o=n;
            int reversed=0;
            
            while(n>0){
               int  digit=n%10;
                reversed=reversed*10+digit;
                n=n/10;
                
            }
            if(reversed !=o){
            return false;
            }
            
        }
        return true;
        // code here.
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
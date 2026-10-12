class Solution {
    public int getSecondLargest(int[] arr) {
       int l=-1;
       int sl=-1,i;
       
       for(i=0;i<arr.length;i++){
           if(arr[i]>l){
               sl=l;
               l=arr[i];
               
           }
           else if(arr[i]>sl && arr[i]!=l){
               sl=arr[i];
               
           }
       }
        
        return sl;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
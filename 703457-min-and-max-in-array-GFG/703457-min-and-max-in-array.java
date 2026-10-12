class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                
            }
            if(arr[i]>max){
                max=arr[i];
                
            }
            
        }
        
     ArrayList <Integer> result=new ArrayList<>();
     
     result.add(min);
     result.add(max);
     
     return result;
     
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
     
        ArrayList<Integer> r=new ArrayList<>();
        HashSet<Integer> s=new HashSet<>();
        
        
        for(int i=0;i<arr.length;i++){
            if(s.add(arr[i])){
                r.add(arr[i]);
            }
            
        }
        return r;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
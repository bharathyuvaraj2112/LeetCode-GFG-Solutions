class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        
        ArrayList<Integer> r=new ArrayList<>();
        
        
        for(int i=0;i<arr.length;i=i+2){
            r.add(arr[i]);
        }
        return r;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
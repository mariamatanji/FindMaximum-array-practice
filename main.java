public class Main
{
    public static int findMaximum(int[] numbers) {
        
        // 1. Initialize 'max' to the first element of the array.
        // This is the starting point for comparison.
        int max = numbers[0]; 
        
        // 2. Traverse the array starting from the second element (index 1).
        // We can skip index 0 since we already set 'max' to that value.

      
        for (int i = 1; i < numbers.length; i++) {
            
            // 3. Compare the current element to the current maximum.
            if (numbers[i] > max) {
                // If the current element is larger, update the maximum.
                max = numbers[i]; 
            }
        }
        
        // 4. Return the largest value found.
        return max;
    }
    
	public static void main(String[] args) {
	    // The main method is correctly calling the function.
		System.out.println("max number is : " + findMaximum(new int[] {15, 27, 4, 88, 12}));
	}
}

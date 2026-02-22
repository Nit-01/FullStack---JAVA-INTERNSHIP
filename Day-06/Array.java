class Array {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);

    }
}

// The program starts execution from the main method. An array is created and initialized with values. 
// A loop starts from index 0 and accesses each element using its index. Each value is added to the sum variable.
// After the loop ends, the total sum is printed on the screen.
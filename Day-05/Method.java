class Method {

    static int add(int... numbers) {
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {

        int result = add(10, 20, 30);
        System.out.println(result);

    }
}


// The program starts execution from the main method. The add method is called with three values. These values are received as 
// varargs and treated like an array. The loop adds all the numbers and returns the sum. The returned value is stored in result 
// and printed on the screen.
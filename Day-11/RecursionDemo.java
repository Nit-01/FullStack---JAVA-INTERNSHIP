class RecursionDemo {

    static int factorial(int n) {

        if(n == 1)
            return 1;

        return n * factorial(n - 1);

    }

    public static void main(String[] args) {

        int result = factorial(5);
        System.out.println(result);

    }
}

// The program starts from the main method and calls factorial with value 5. The method calls itself repeatedly with decreasing values
// until it reaches the base condition n equals 1. Each call waits in the stack. After reaching the base condition, 
// the values are returned back step by step, and the final factorial value is printed.
class day04{
    public static void main(String[] args) {

        int num = 5;

        if(num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        for(int i = 1; i <= num; i++) {
            System.out.println(i);
        }

    }
}


// The program starts execution from the main method. First, the variable num is assigned the value 5. 
// The if-else statement checks whether the number is even or odd and prints the result. 
// Then the for loop starts from 1 and repeats until 5, printing each value. 
// The loop stops when the condition becomes false, and the program ends.
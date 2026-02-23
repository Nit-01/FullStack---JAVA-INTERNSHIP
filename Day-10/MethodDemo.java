class MethodDemo {

    static void display(int num) {
        num = num + 10;
        System.out.println("Inside method: " + num);
    }

    public static void main(String[] args) {

        int value = 20;
        display(value);
        System.out.println("Inside main: " + value);

    }
}

// The program starts execution from the main method. A variable value is created and passed to the display method. 
// Java passes a copy of the value to the method. Inside the method, the value is increased and printed. After the method finishes, 
// control returns to main. The original value remains unchanged because Java uses call-by-value.

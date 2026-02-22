class JaggedArray {
    public static void main(String[] args) {

        final int arr[][] = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[1][2] = 50;
        arr[2][0] = 60;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}



// The program starts from the main method. A final jagged array is declared with 3 rows. Each row is assigned a different column size. 
// Values are stored using row and column indexes. Nested loops are used to access and print each element. The array reference cannot be 
// changed because it is final, but its elements are modified and displayed.
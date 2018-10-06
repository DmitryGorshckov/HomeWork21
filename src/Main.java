public class Main {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        printProcedure(arr);
        System.out.println("======");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i][j + 1];
            }
            arr[i][arr[i].length - 1] = 0;
        }
          printProcedure(arr);
    }

    private static void printProcedure(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");


            }
            System.out.println();
        }
    }
}

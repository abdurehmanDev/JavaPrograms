import java.util.Scanner;

class MultiplyTwoMatrix {

  // size of array
  static int MAX = 100;

  // function to print Matrix
  static void printMatrix(int M[][], int rowSize, int colSize) {

    for (int i = 0; i < rowSize; i++) {
      for (int j = 0; j < colSize; j++) {
        System.out.print("[" + i + "][" + j + "]: " + M[i][j]);
        System.out.println();

      }

    }

  }

  // function for multiply two matrices A and B

  static void multiplyMatrix(int row1, int col1, int A[][], int row2, int col2, int B[][]) {
    int i, j, k;

    int C[][] = new int[MAX][MAX];
    // check if Rectangular Matrix is valid or not
    if (col1 != row2) {
      System.out.println("Enter valid Matrices elements as Multiplication not possible");
      return;
    } else {
      // we can multiply

      for (i = 0; i < row1; i++) {
        for (j = 0; j < col2; j++) {
          C[i][j] = 0;
          for (k = 0; k < row2; k++) {
            C[i][j] += A[i][k] * B[k][j];

          }

        }

      }

    }

    // Print the result
    System.out.println();
    System.out.println("Resultant Matrix: ");
    printMatrix(C, row1, col2);

  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int row1, col1, row2, col2, i, j;

    int A[][] = new int[MAX][MAX];
    int B[][] = new int[MAX][MAX];

    // Read Size of Matrix A
    System.out.print("Enter the number of rows of First Matrix: ");
    row1 = input.nextInt();

    System.out.print("Enter the number of cols of First Matrix: ");
    col1 = input.nextInt();

    // Read Elements of Matrix A
    System.out.println("Enter the elements of First Matrix: ");

    for (i = 0; i < row1; i++) {

      for (j = 0; j < col1; j++) {
        System.out.print("A[" + i + "][" + j + "]: ");
        A[i][j] = input.nextInt();
      }

    }

    // Read Size of Matrix B
    System.out.print("Enter the number of rows of Second Matrix: ");
    row2 = input.nextInt();

    System.out.print("Enter the number of cols of Second Matrix: ");
    col2 = input.nextInt();

    // Read Elements of Matrix B
    System.out.println("Enter the elements of Second Matrix: ");

    for (i = 0; i < row2; i++) {

      for (j = 0; j < col2; j++) {
        System.out.print("B[" + i + "][" + j + "]: ");
        B[i][j] = input.nextInt();
      }

    }

    // print the Matrix A
    System.out.println();
    System.out.println("First Matrix: ");
    printMatrix(A, row1, col1);

    // print the Matrix B
    System.out.println();
    System.out.println("Second Matrix: ");
    printMatrix(B, row2, col2);

    // product of the Matrices A and B
    multiplyMatrix(row1, col1, A, row2, col2, B);

  }
}
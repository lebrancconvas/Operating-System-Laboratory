import java.util.Arrays;

public class Lab_MatrixMul {
    public static void main(String[] args) {
        int[][] inputA = { { 5, 6, 7 }, { 4, 8, 9 } };
        int[][] inputB = { { 6 , 4 }, { 5, 7 }, { 1, 1 } };
        MyData matA = new MyData(inputA);
        MyData matB = new MyData(inputB);
        int matC_r = matA.data.length;
        int matC_c = matB.data[0].length;
        MyData matC = new MyData(matC_r, matC_c);
        //Q4 construct 2D array for each "thread" with respected to each cell in matC
        //Q5 start each thread
        matC.show();
    }
    
}

class MatrixChild implements Runnable {
    int processing_row;
    int processing_col;
    MyData datA;
    MyData datB;
    MyData datC;

    MatrixChild(int r, int c, MyData a, MyData b, MyData c) {
        // Q1
    }

    /* Q2 */
    void run() {
        // Q3
        // System.out.println("perform sum of multiplication of assigned row and col");
    }
}

class MyData {
    int[][] data;

    MyData(int[][] m) {
        data = m;
    }

    MyData(int r, int c) {
        data = new int[r][c];
        for (int[] aRow : data)
            Arrays.fill(aRow, 9);
    }

    void show() {
        System.out.println(Arrays.deepToString(data));
    }
}

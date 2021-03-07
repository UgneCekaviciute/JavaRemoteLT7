package homework.nd3;

public class Uzduotis3 {
    //3.	Please, implement the program, which will be displaying
    // 2-dimensional table like this below:
    //0 0 0 0 0
    //0 1 0 0 0
    //0 0 2 0 0
    //0 0 0 3 0
    //0 0 0 0 4
    //Notice: Use a 2-dimensional table as a structure. Do not
    // initialize the table in the static way - please, fill the
    // table values using ‘for’ loops.

    public static void main(String[] args) {
        int [][] arr = new int[5][5];
        arr [1][1] = 1;
        arr [2][2] = 2;
        arr [3][3] = 3;
        arr [4][4] = 4;
        for (int [] row: arr) {
            for (int value: row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

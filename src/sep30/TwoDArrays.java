package sep30;

public class TwoDArrays {
    public static void main(String[] args) {
        // multi dimention array
       // int[][] arr = new int[3][4];

         int[][] arr = { {1,2,3,5}, {4,5,6,5},{7,8,9,5}};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

        /*
          1    2    3
          4    5    6
          7    8    9
         */


        // Object array
    }
}

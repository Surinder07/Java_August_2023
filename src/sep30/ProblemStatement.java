package sep30;
// find the maximum element in the array
// arrange it and compare numbers
// which is farthest from 0

public class ProblemStatement {
    public static void main(String[] args) {

        //sort this array
        int[] arr = {10, -20 , 43 , 435, 232, 43, 56};
        // 56, 43, 232, 435, 43, -20, 10
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max > arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

package oct14.polymorph;

public class Calculator {

    int sum(int num1, int num2){
        return num1 + num2;
    }

    int sum(int num1, float num2 ){
        return (int) (num1 + num2);
    }

}
/*

 Type casting
   // Box-1   SIZE =  10    ----   BOX-2 --    SIZE= 20

    float x = 10.23f;

    int y = (int) x;
 */
package sep12;

public class Conditional2 {
    public static void main(String[] args) {

        int score = 125;
        if(score < 40){
            System.out.println("fail"); // false
        }
        else if (score > 40 && score < 60){
            System.out.println("B grade "); // false
        }
        else if(score > 60 && score < 80) {
            System.out.println("B + grade"); // true
        }
        else if(score > 80){
            System.out.println("A grade ");
        }
        else{
            System.out.println("Nothing... ");
        }

    }
}

//  driver license
// if age < 16 ---> you can not drive
// 16- 19 ----> you can not drive on 400 highways
// if 19 -65   ---> you are eligible to drive
// > 65 --> need to take permission from wife.
//======

/*

if age less than 19 and has G license --> Block Alchohol lever --> 0.0
if age greater than 19 and has G licence --> you can have BAL --> 0.05
if age greater than 19 and has G license and BAL greater than 0.05 --> ticketed.

int age = 24
boolean hasGLicense = true

if(age < 19 && hasGLicense){
SOP --you should have BAL to 0.0

else{



 */





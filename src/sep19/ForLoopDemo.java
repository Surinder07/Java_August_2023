package sep19;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            if(i % 2 != 0) continue;
            System.out.println(i);
            sum  = sum +i;
        }
        System.out.println(sum);
    }
}

// 1. print all the even numbers 1-100   /// sum of all even numbers
// print all the odd numbers  // sum of all odd numbers

// 1-100 : 56, you will get 5 tries,
// user will enter the number :  Winner, You lost?
/*
Lucky number = 78
1. 23  -> please retry your luck
2. 66
3. 99
4. 23
5. 78--- > Congratulations You won!

-- 5 times




 // add numbers
            // continue : skip the iteration
                // break ,  -- break iteration
                // continue ; -- skip 1 iteration

 */





// init
// checks condition
// print statement
// increment/decrement


//
/*
for(init ; condition  ; increment/decrement ){

// statement

}

 */
/*

git add    --> staging area
git commit    --> final save to local git
git push    --> github

git status   ---> to check current status of git

git pull --- > to get the latest changes from github


 */
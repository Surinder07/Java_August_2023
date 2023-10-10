package oct7.oops.constr;

public class DateDemo {

    int day;
    int month;
    int year;

    DateDemo(){
        day = 7;
        month = 10;
        year = 2023;
    }

    DateDemo(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }


    public void displayDate(){
        System.out.println("Date : " + day + "/" +"/"+month+ "/"+year);
    }

}


/*

// const
    // same name as class
    // no return type - no void even
    // looks same as method (special type of method )

    // default const

 */
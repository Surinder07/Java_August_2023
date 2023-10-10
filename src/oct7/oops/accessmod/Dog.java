package oct7.oops.accessmod;

//library  -- LOMBOK

// @toStr
public class Dog {

    // private  -- can only be accessed within the class
     private int age;
     private int weight;
     private String color;

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

     /*  //Getter
     public int getAge(){
         return age;
     }
     public void setAge(int a){ // a = 10

         // rules set by class owner or programmer
     }*/




 /*    //getter and setter


    public void setAge(int age) {
        this.age = age;
    }*/



  /*  // behaviour
    void running(){
        System.out.println(age);
        System.out.println("Dog is running ..");
    }

    void barking(){
        System.out.println("dog is barking");
    }

    void singing(){
        System.out.println("dog is singing ");
    }
*/

}

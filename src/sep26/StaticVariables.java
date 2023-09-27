package sep26;

public class StaticVariables {

    int id;
    String name;
    String companyName = "pragra";

    void show(){
        System.out.println(id + " " + name + " " + companyName );
    }
    public static void main(String[] args) {

        StaticVariables s = new StaticVariables();
        s.id = 101;
        s.name = "Asher";
        s.show();

        StaticVariables s2 = new StaticVariables();
        s2.id = 102;
        s2.name = "Dilpreet";
        s2.show();

        StaticVariables s3 = new StaticVariables();
        s3.id = 102;
        s3.name = "Dilpreet";
        s3.show();


    }
}

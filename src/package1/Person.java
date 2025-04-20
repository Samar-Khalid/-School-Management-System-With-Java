package package1;

public class Person {
    private int id;
    private String name;
//    private int salary;
//    private int salaryEarned=0;

    public Person (int id, String name ){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}
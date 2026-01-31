package practice2;


public class Student {
    private String name;
    private int id;
    private int year_of_study;
    public Student(String name, int id){
        this.name = name;
        this.id = id;
        this.year_of_study = 1;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getYearOfStudy() {
        return year_of_study;
    }
    public void incYear_of_study(){
        year_of_study++;
    }
}

package practice2;

public class Main {
    public static void main(String []args){
        Student s = new Student("Ilyas", 24);
        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getYearOfStudy());
        s.incYear_of_study();
        System.out.println(s.getYearOfStudy());
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(4, 24, 33);
        t.add(t2);
        System.out.println(t.toUniversal());

    }
}

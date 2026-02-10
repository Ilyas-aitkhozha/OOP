package Lab1.Problem4;

public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisites;
    public Course() {
        this.name = "Unknown";
        this.description = "";
        this.credits = 0;
        this.prerequisites = "";
    }
    public Course(String name, String description, int credits, String prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Course{name='" + name + "' description='" + description + "' credits=" + credits + " prerequisites='" + prerequisites + "'}";
    }
}

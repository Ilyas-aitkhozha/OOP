package Lab1.Problem4;

import java.util.ArrayList;

import practice2.Student; // <-- ВАЖНО: поменяй package, если у тебя Student в другом пакете

public class GradeBook {
    private Course course;
    private ArrayList<Student> students;
    private int[] grades;

    public GradeBook(Course course, ArrayList<Student> students) {
        this.course = course;
        this.students = students;
        this.grades = new int[students.size()];
    }

    public void setGrade(int index, int grade) {
        grades[index] = grade;
    }
    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public double determineClassAverage() {
        int sum = 0;
        int i;
        for (i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }
    public int getMinimumGrade() {
        int min = grades[0];
        int i;
        for (i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    public int getMaximumGrade() {
        int max = grades[0];
        int i;
        for (i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }
    public int getIndexOfMinimum() {
        int min = grades[0];
        int minIndex = 0;
        int i;
        for (i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public int getIndexOfMaximum() {
        int max = grades[0];
        int maxIndex = 0;
        int i;
        for (i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public void outputBarChart() {
        System.out.println("\nGrades distribution:");
        int[] frequency = new int[11]; // 0-9,10-19,...,90-99,100
        int i;
        for (i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade == 100) {
                frequency[10]++;
            } else {
                frequency[grade / 10]++;
            }
        }

        int range;
        for (range = 0; range < frequency.length; range++) {
            if (range == 10) {
                System.out.print("100:   ");
            } else {
                System.out.printf("%02d-%02d: ", range * 10, range * 10 + 9);
            }

            int stars;
            for (stars = 0; stars < frequency[range]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void displayGradeReport() {
        double avg = determineClassAverage();
        int minIndex = getIndexOfMinimum();
        int maxIndex = getIndexOfMaximum();
        int min = grades[minIndex];
        int max = grades[maxIndex];
        System.out.printf("\nClass average is %.2f. ", avg);
        System.out.println("Lowest grade is " + min + " (" + students.get(minIndex) + ").");
        System.out.println("Highest grade is " + max + " (" + students.get(maxIndex) + ").");
        outputBarChart();
    }
    public String toString() {
        return "GradeBook{course=" + course + ", studentsCount=" + students.size() + "}";
    }
}

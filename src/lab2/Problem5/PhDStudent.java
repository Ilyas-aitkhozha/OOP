package lab2.Problem5;

public class PhDStudent extends Person {
    private String researchField;
    public PhDStudent(String name, int age, String researchField) {
        super(name, age);
        this.researchField = researchField;
    }

    @Override
    public void assignPet(Animal pet) {
        // Rule: PhDStudent cannot own Dog
        if (pet instanceof Dog) {
            return;
        }
        super.assignPet(pet);
    }
    @Override
    public String getOccupation() {
        return "PhDStudent(" + researchField + ")";
    }
}

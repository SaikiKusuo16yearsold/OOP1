public class Ravenclaw extends Hogwarts {
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int fullnessCreativity;


    public Ravenclaw(String name, int magicalPower, int transgressionDistance, int mind, int wisdom, int wit,
                     int fullnessCreativity) {
        super(name, magicalPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullnessCreativity = fullnessCreativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdomisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getFullnessCreativity() {
        return fullnessCreativity;
    }

    public void comparingStudents(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int totalFirstStudent = 0;
        int totalSecondStudent = 0;
        totalFirstStudent += firstStudent.mind + firstStudent.wisdom + firstStudent.wit
                + firstStudent.fullnessCreativity;
        totalSecondStudent += secondStudent.mind + secondStudent.wisdom + secondStudent.wit
                + secondStudent.fullnessCreativity;
        if (totalFirstStudent > totalSecondStudent) {
            System.out.println(firstStudent.getFullname() + " лучше когтевранец чем " + secondStudent.getFullname());
        } else if (totalFirstStudent < totalSecondStudent) {
            System.out.println(secondStudent.getFullname() + " лучшие когтевранец чем " + firstStudent.getFullname());

        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}

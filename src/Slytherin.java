public class Slytherin extends Hogwarts {
    private final int trick;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstPower;


    public Slytherin(String name, int magicalPower, int transgressionDistance, int trick, int determination, int ambition,
                     int resourcefulness, int thirstPower) {
        super(name, magicalPower, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getTrick() {
        return trick;
    }

    public int getDeinstitutionalization() {
        return determination;
    }

    public int getBravery() {
        return ambition;
    }

    public int getFullnessCreativity() {
        return resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }


    public void comparingStudents(Slytherin firstStudent, Slytherin secondStudent) {
        int totalFirstStudent = 0;
        int totalSecondStudent = 0;
        totalFirstStudent += firstStudent.trick + firstStudent.determination + firstStudent.ambition
                + firstStudent.resourcefulness + firstStudent.thirstPower;
        totalSecondStudent += secondStudent.trick + secondStudent.determination + secondStudent.ambition
                + secondStudent.resourcefulness + secondStudent.thirstPower;

        if (totalFirstStudent > totalSecondStudent) {
            System.out.println(firstStudent.getFullname() + " лучше слизеринец чем " + secondStudent.getFullname());
        } else if (totalFirstStudent < totalSecondStudent) {
            System.out.println(secondStudent.getFullname() + " лучшие слизеринец чем " + firstStudent.getFullname());

        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}

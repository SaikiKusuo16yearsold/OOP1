public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;


    public Gryffindor(String name, int magicalPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicalPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


    public static void comparingStudents(Gryffindor firstStudent, Gryffindor secondStudent) {
        int totalFirstStudent = 0;
        int totalSecondStudent = 0;
        totalFirstStudent += firstStudent.bravery + firstStudent.honor + firstStudent.nobility;
        totalSecondStudent += secondStudent.bravery + secondStudent.honor + secondStudent.nobility;
        if (totalFirstStudent > totalSecondStudent) {
            System.out.println(firstStudent.getFullname() + " лучше грифиндорец чем " + secondStudent.getFullname());
        } else if (totalFirstStudent < totalSecondStudent) {
            System.out.println(secondStudent.getFullname() + " лучше грифиндорец чем " + firstStudent.getFullname());

        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}
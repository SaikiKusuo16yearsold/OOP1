public class Hufflepuff extends Hogwarts {
    private final int industriousness;
    private final int loyalty;
    private final int honesty;


    public Hufflepuff(String name, int magicalPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, magicalPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void comparingStudents(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int totalFirstStudent = 0;
        int totalSecondStudent = 0;
        totalFirstStudent += firstStudent.industriousness + firstStudent.loyalty + firstStudent.honesty;
        totalSecondStudent += secondStudent.industriousness + secondStudent.loyalty + secondStudent.honesty;
        if (totalFirstStudent > totalSecondStudent) {
            System.out.println(firstStudent.getFullname() + " лучше пуфендуец чем " + secondStudent.getFullname());
        } else if (totalFirstStudent < totalSecondStudent) {
            System.out.println(secondStudent.getFullname() + " лучшие пуфендуец чем " + firstStudent.getFullname());

        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}

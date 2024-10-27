public class Hogwarts {
    private final String fullname;
    private final int magicalPower;
    private final int transgressionDistance;

    public Hogwarts(String fullname, int magicalPower, int transgressionDistance) {
        this.fullname = fullname;
        this.magicalPower = magicalPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicalPower() {
        return magicalPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getFullname() {
        return fullname;
    }

    public static void comparisonHogwartsStudents(Hogwarts firstsStudent, Hogwarts secondStudent) {

        if (firstsStudent.magicalPower > secondStudent.magicalPower) {
            System.out.println(firstsStudent.fullname + " сильнее чем " + secondStudent.fullname + " в магической силе");
        } else if (secondStudent.magicalPower > firstsStudent.magicalPower) {
            System.out.println(secondStudent.fullname + " сильнее чем " + firstsStudent.fullname + " в магической силе");
        } else {
            System.out.println("силы " + firstsStudent.fullname + " такие же как у  " + secondStudent.fullname);
        }

        if (firstsStudent.transgressionDistance > secondStudent.transgressionDistance) {
            System.out.println(firstsStudent.fullname + " сильнее чем  " + secondStudent.fullname + " в трансгрессии");
        } else if (secondStudent.transgressionDistance > firstsStudent.transgressionDistance) {
            System.out.println(secondStudent.fullname + " сильнее чем " + firstsStudent.fullname + " в трансгрессии");
        } else {
            System.out.println("силы у  " + firstsStudent.fullname + "в трансгрессии такие же как " + secondStudent.fullname);
        }
    }

    public static void describeStudent(Hogwarts Student) {
        if (Student instanceof Gryffindor) {
            Gryffindor students = (Gryffindor) Student;
            System.out.println("У стедента " + students.getFullname() + " " + students.getMagicalPower()
                    + " магической силы и " + students.getTransgressionDistance() + " расстояние трагресии и " + " столько благоролства, чести и храбрости " +
                    +students.getHonor() + ", " + students.getBravery() + ", " + students.getNobility());
        } else if (Student instanceof Hufflepuff) {
            Hufflepuff students = (Hufflepuff) Student;
            System.out.println("У стедента " + students.getFullname() + " " + students.getMagicalPower()
                    + " магической силы и " + students.getTransgressionDistance() + " расстояние трагресии и " + " трудолюбивы, верны, честны " +
                    +students.getLoyalty() + ", " + students.getHonesty() + ", " + students.getIndustriousness());
        } else if (Student instanceof Ravenclaw) {
            Ravenclaw students = (Ravenclaw) Student;
            System.out.println("У стедента " + students.getFullname() + " " + students.getMagicalPower()
                    + " магической силы и " + students.getTransgressionDistance() + " расстояние трагресии и "
                    + " присущи хитрость, решительность, амбициозность, находчивость и жажда власти " +
                    +students.getMind() + ", " + students.getWisdomisdom() + ", " + students.getWit() + " " +
                    students.getFullnessCreativity());
        } else if (Student instanceof Slytherin) {
            Slytherin students = (Slytherin) Student;
            System.out.println("У стедента " + students.getFullname() + " " + students.getMagicalPower()
                    + " магической силы и " + students.getTransgressionDistance() + " расстояние трагресии и "
                    + " присущи хитрость, решительность, амбициозность, находчивость и жажда власти " +
                    +students.getDeinstitutionalization() + ", " + students.getBravery() + ", " +
                    students.getThirstPower() + ", " + students.getFullnessCreativity() + ", " + students.getTrick());
        }
    }

}

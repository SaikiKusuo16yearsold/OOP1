public class Main {

    public static void main(String[] args) {
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 90, 50, 5, 5, 6);
        Gryffindor ron = new Gryffindor("Рон Уизли", 80, 77, 3, 6, 5);
        Hogwarts.describeStudent(hermione);
        Hogwarts.comparisonHogwartsStudents(hermione, ron);
        Gryffindor.comparingStudents(hermione, ron);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 88, 55, 6, 7, 8);
        Hogwarts.comparisonHogwartsStudents(cedric, ron);
    }
}

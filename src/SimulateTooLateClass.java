import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class SimulateTooLateClass {
    public static void main(String[] args) {

//        System.out.println("First name is : " + student1.getFirstName() + " Last name is : " + student1.getLastName() +
//                " Birthdate is : " + student1.getDateOfBirth() + " And the java knoweledge is " + student1.isHasPreviousJavaKnoweledge());

        createClass();



    }

    private static void createClass() {
        Student student1 = new Student("Olteanu","Alexandru", LocalDate.of(1988, Month.OCTOBER,12),false);
        Student student2 = new Student("Draga","Sorin", LocalDate.of(1988, Month.OCTOBER,12),false);
        Student student3 = new Student("Gradinaru","Traian", LocalDate.of(1988, Month.OCTOBER,12),false);
        Student student4 = new Student("Lenter","Diana", LocalDate.of(1988, Month.OCTOBER,12),false);
        Student student5 = new Student("Naghi","Andrea", LocalDate.of(1988, Month.OCTOBER,12),false);
        Student student6 = new Student("Gheorghe","Dorina", LocalDate.of(1988, Month.OCTOBER,12),false);
        Student student7 = new Student("Calin","Cornelia", LocalDate.of(1988, Month.OCTOBER,12),false);
        Student student8 = new Student("Orza","Alexandra", LocalDate.of(1988, Month.OCTOBER,12),false);
        Student student9 = new Student("Balan","Adrian", LocalDate.of(1988, Month.OCTOBER,12),false);
        Student student10 = new Student("Torok","Szabi", LocalDate.of(1988, Month.DECEMBER,1),false);
        System.out.println(student1.toString());

        List<Student> studentsRo16=  Arrays.asList(student1,student2,student3);
        List<Student> studentsRo17=  Arrays.asList(student4,student5);
        List<Student> studentsRo18=  Arrays.asList(student6,student7);
        List<Student> studentsRo19=  Arrays.asList(student8,student9,student10);


        Trainer trainer1 = new Trainer("Olteanu","Alexandru", LocalDate.of(1988, Month.OCTOBER,12),false);
        Trainer trainer2 = new Trainer("Olteanu","Alexandru", LocalDate.of(1988, Month.OCTOBER,12),false);
        Trainer trainer3 = new Trainer("Olteanu","Alexandru", LocalDate.of(1988, Month.OCTOBER,12),false);

        Group javaRo16 = new Group(trainer1,studentsRo16);
        Group javaRo17 = new Group(trainer1,studentsRo17);
        Group JavaRo18 = new Group(trainer3,studentsRo18);
        Group javaRo19 = new Group(null,studentsRo19);
        javaRo19.setTrainer(trainer3);
    }
}

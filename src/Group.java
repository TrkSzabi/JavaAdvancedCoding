import java.util.List;

public class Group {
    private Trainer trainer;

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    List<Student> studentList;

    public Group(Trainer trainer, List<Student> studentList) {
        this.trainer = trainer;
        this.studentList = studentList;
    }
}

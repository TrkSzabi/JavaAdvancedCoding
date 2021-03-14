import java.util.List;
import java.util.Set;

public class Group {
    private Trainer trainer;
    private Set<Student> students;


    public Group(Trainer trainer, Set<Student> students) {
        this.trainer = trainer;
        if (students.size() <= 5) {
            this.students = students;
        } else {
            throw new MaximumNumberOfStudentsReached("Students limit exceeded");
        }
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setStudents(Set<Student> students) {
        if (students.size() <= 5) {
            this.students = students;
        } else {
            throw new MaximumNumberOfStudentsReached("Students limit exceeded");
        }
    }


    @Override
    public String toString() {
        return "Group{" +
                "trainer=" + trainer +
                ", students=" + students +
                '}';
    }
}

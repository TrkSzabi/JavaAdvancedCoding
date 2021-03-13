import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class Student extends Person {
    boolean hasPreviousJavaKnoweledge;

    public boolean isHasPreviousJavaKnoweledge() {
        return hasPreviousJavaKnoweledge;
    }

    public void setHasPreviousJavaKnoweledge(boolean hasPreviousJavaKnoweledge) {
        this.hasPreviousJavaKnoweledge = hasPreviousJavaKnoweledge;
    }


    public Student(String firstName, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnoweledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnoweledge = hasPreviousJavaKnoweledge;

    }

    @Override
    public String toString() {
        return super.toString() +
                ", has PreviousJavaKnoweledge " + hasPreviousJavaKnoweledge + "}";
    }


}

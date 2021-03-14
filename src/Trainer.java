import java.time.LocalDate;

public class Trainer extends Person{
     boolean isAuthorized ;


     public Trainer(String firstName, String lastName, LocalDate dataOfBithd, boolean b) {
          super(firstName, lastName, dataOfBithd );
          this.isAuthorized = b;

     }

     @Override
     public String toString() {
          return super.toString() +
                  "isAuthorized=" + isAuthorized +
                  '}';
     }
}


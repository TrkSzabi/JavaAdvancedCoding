import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainerTest {


    @Test
    public void verifyIsAutorizedTrainer() {
        //Given
        Trainer trainer = new Trainer(null, null, null, true);

        //When + Then
        assertTrue(trainer.isAuthorized());

    }

}

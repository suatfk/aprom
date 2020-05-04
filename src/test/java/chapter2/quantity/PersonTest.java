package chapter2.quantity;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

@Log
class PersonTest {

    @Test
    public void quantityTest() {
        Person person = new Person();
        person.setHeight(Quantity.from(BigDecimal.valueOf(180L), Unit.CM));
        person.setWeight(Quantity.from(BigDecimal.valueOf(80L), Unit.POUND));
        person.setGlucoseLevel(Quantity.from(BigDecimal.valueOf(82.3), Unit.MG_DL));
        log.info(person.toString());
    }
}
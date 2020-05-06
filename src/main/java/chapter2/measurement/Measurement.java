package chapter2.measurement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Measurement {

    private Quantity quantity;

    private PhenomenonType type;
}

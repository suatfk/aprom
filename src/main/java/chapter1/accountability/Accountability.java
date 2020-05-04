package chapter1.accountability;

import lombok.Getter;
import lombok.Setter;

public class Accountability {

    @Getter
    @Setter
    private AccountabilityType type;

    @Getter
    @Setter
    private Party responsible;

    @Getter
    private Party commissioner;

    @Getter
    @Setter
    private DateRange timePeriod;

    public void setResponsible(Party responsible) {
        type.getConstraints().apply(commissioner, responsible);
        this.responsible = responsible;
    }
}

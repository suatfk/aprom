package chapter1.accountabilityKnowledgeLevel;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Accountability {

    private AccountabilityType type;

    private Party commissioner;

    private Party responsible;

    private DateRange timePeriod;

    private List<Action> actions;

    private void validate() {
        if (!type.isValidCommissioner(commissioner)) {
            throw new RuntimeException("Not a valid commisioner!");
        }

        if (!type.isValidResponsible(responsible)) {
            throw new RuntimeException("Not a valid responsible");
        }
    }
}

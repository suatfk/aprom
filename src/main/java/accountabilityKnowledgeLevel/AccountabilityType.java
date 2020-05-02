package accountabilityKnowledgeLevel;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AccountabilityType {

    private List<PartyType> commissioners;

    private List<PartyType> responsibles;

    public boolean isValidCommissioner(Party party) {
        return commissioners.contains(party);
    }

    public boolean isValidResponsible(Party party){
        return responsibles.contains(party);
    }
}

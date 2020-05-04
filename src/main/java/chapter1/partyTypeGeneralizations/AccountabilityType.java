package chapter1.partyTypeGeneralizations;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AccountabilityType {

    private List<PartyType> commissioners;

    private List<PartyType> responsibles;
}

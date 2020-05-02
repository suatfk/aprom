package partyTypeGeneralizations;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Party {

    private PartyType type;

    private List<PartyType> types = deriveTypes();

    private List<PartyType> deriveTypes() {
        List<PartyType> allTypes = new ArrayList<>();

        PartyType type = this.type.getParent();
        while (type != null) {
            allTypes.add(type);
            type = type.getParent();
        }

        return allTypes;
    }
}

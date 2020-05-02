package accountability;

import accountability.rule.AccountabilityRule;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountabilityType {

    private String name;

    private AccountabilityRule constraints;

}

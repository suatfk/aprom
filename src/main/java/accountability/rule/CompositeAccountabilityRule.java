package accountability.rule;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccountabilityRule implements AccountabilityRule {

    private List<AccountabilityRule> accountabilityRules = new ArrayList<>();

    public void apply(Party child, Party parent) {
        accountabilityRules.stream().forEach(accountabilityRule -> accountabilityRule.apply(child, parent));
    }
}

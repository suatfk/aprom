package accountability.rule;

import accountability.Party;

public interface AccountabilityRule {

    void apply(Party child, Party parent);
}

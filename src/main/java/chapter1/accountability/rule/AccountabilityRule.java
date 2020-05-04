package chapter1.accountability.rule;

import chapter1.accountability.Party;

public interface AccountabilityRule {

    void apply(Party child, Party parent);
}

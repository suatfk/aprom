package accountability.rule;

public interface AccountabilityRule {

    void apply(Party child, Party parent);
}

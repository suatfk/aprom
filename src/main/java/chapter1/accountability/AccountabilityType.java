package chapter1.accountability;

import chapter1.accountability.rule.AccountabilityRule;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountabilityType {

    private String name;

    private AccountabilityRule constraints;

}

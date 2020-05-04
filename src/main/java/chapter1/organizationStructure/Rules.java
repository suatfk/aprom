package chapter1.organizationStructure;

import java.util.ArrayList;
import java.util.List;

public class Rules implements Rule {

    private List<Rule> rules = new ArrayList<>();

    public void apply(Organization child, Organization parent) {
        rules.stream().forEach(rule -> rule.apply(child, parent));
    }
}

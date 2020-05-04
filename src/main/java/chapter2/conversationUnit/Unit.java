package chapter2.conversationUnit;

import lombok.*;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Unit {
    public static final Unit US = new Unit("US dollars");

    public static final Unit POUND = new Unit("Pounds");

    public static final Unit CM = new Unit("Centimeter");

    public static final Unit MG_DL = new Unit("mg/dL");

    public static final Unit M = new Unit("Meter");

    private String name;

    private List<ConversationRatio> conversationRatios;

    public Unit(String name) {
        this.name = name;
    }

    public ConversationRatio getConversationRatio(Unit from, Unit to) {
        return conversationRatios
                .stream()
                .filter(cr -> from.equals(cr.getFrom()) && to.equals(cr.getTo()))
                .findFirst().get();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return Objects.equals(name, unit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

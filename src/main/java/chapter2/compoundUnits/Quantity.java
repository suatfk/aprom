package chapter2.compoundUnits;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Quantity {

    private BigDecimal amount;

    private Unit unit;

    public static Quantity from(BigDecimal amount, Unit unit) {
        return new Quantity(amount, unit);
    }

    public Quantity convertTo(Unit to) {
        return Quantity.from(unit.getConversationRatio(unit, to).apply(amount), to);
    }
}

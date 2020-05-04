package chapter2.quantity;

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
}

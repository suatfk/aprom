package chapter2.quantity;

import lombok.*;

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

    private String name;

}

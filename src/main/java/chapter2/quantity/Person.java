package chapter2.quantity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {

    private Quantity height;

    private Quantity weight;

    private Quantity glucoseLevel;


}

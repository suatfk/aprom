package chapter5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Identifier {

    private IdentificationScheme identificationScheme;

    private String data;
}

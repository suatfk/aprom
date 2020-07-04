package chapter5;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Entity {

    private Long id;

    private List<Identifier> identifiers = new ArrayList<>();
}

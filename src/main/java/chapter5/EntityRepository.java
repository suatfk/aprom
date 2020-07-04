package chapter5;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class EntityRepository {

    public List<Entity> repositoryEntities = new ArrayList<>();

    public Entity findByIdAndIdentificationScheme(String id, IdentificationScheme scheme) {
        for (Entity e : repositoryEntities) {
            List<Identifier> identifiers = e.getIdentifiers();
            for (Identifier i : identifiers) {
                if (id.equals(i.getData()) && scheme.equals(i.getIdentificationScheme())) {
                    return e;
                }
            }
        }

        return null;
    }
}

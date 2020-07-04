package chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityTest {

    @Test
    public void identificationTest1() {

        Identifier passport = new Identifier();
        passport.setIdentificationScheme(IdentificationScheme.PASSPORT);
        passport.setData("1234");

        Identifier socialSecurityNumber = new Identifier();
        socialSecurityNumber.setIdentificationScheme(IdentificationScheme.SOCIAL_SECURITY);
        socialSecurityNumber.setData("4321");

        Identifier socialSecurityNumber2 = new Identifier();
        socialSecurityNumber.setIdentificationScheme(IdentificationScheme.SOCIAL_SECURITY);
        socialSecurityNumber.setData("43210");

        Entity person1 = new Entity();
        person1.setId(1L);
        person1.getIdentifiers().add(passport);
        person1.getIdentifiers().add(socialSecurityNumber);

        Entity person2 = new Entity();
        person2.setId(2L);
        person2.getIdentifiers().add(socialSecurityNumber2);

        EntityRepository entityRepository = new EntityRepository();
        entityRepository.getRepositoryEntities().add(person1);
        entityRepository.getRepositoryEntities().add(person2);

        Entity foundPerson = entityRepository.findByIdAndIdentificationScheme("1234", IdentificationScheme.PASSPORT);

        assertEquals(1L, foundPerson.getId());

    }

}
package organizationHierarchy;

public class Division extends Organization {

    @Override
    protected void setParent(Organization organization) {
        if (!(organization instanceof Region)) {
            throw new RuntimeException("Division organization must be a Region");
        }
        super.setParent(organization);
    }
}

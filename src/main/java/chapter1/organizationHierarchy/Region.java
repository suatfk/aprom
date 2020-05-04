package chapter1.organizationHierarchy;

public class Region extends Organization {

    @Override
    protected void setParent(Organization organization) {
        if (!(organization instanceof OperatingUnit)) {
            throw new RuntimeException("Region organization must be a OperatingUnit");
        }

        super.setParent(organization);
    }
}

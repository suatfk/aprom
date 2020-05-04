package chapter1.organizationHierarchy;

public class OperatingUnit extends Organization {

    @Override
    protected void setParent(Organization organization) {
        throw new RuntimeException("OperatingUnit cannot have parents");
    }
}

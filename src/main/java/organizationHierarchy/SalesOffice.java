package organizationHierarchy;

class SalesOffice extends Organization {

    @Override
    protected void setParent(Organization organization) {

        if (!(organization instanceof Division)) {
            throw new RuntimeException("SalesOffice parent must be a Division");
        }

        super.setParent(organization);
    }
}

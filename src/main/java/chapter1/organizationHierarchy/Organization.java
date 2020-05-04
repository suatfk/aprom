package chapter1.organizationHierarchy;

class Organization {

    private Organization parent;

    public Organization() {
    }

    public Organization getParent() {
        return parent;
    }

    protected void setParent(Organization parent) {
        this.parent = parent;
    }
}

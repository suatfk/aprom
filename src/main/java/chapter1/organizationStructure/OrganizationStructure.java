package chapter1.organizationStructure;

import lombok.Getter;

@Getter
class OrganizationStructure {

    private Organization parent;

    private Organization organization;

    private OrganizationStructureType organizationStructureType;

    private DateRange timePeriod;

    public OrganizationStructure(Organization organization, OrganizationStructureType organizationStructureType) {
        this.organization = organization;
        this.organizationStructureType = organizationStructureType;
    }

    public Organization getParent() {
        return parent;
    }

    public void setParent(Organization parent) {
        organizationStructureType.getOrganizationRules().apply(this.organization, parent);
        this.parent = parent;
    }
}

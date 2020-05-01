package organizationStructure;

public class Main {

    /*
    The service team for the 2176 high-volume cappuccino maker in Boston reports to the Boston sales office.
     We would model this as an organization structure whose parent is the Boston sales office,
      subsidiary is the Boston 2176 service team, and organization structure type is line management.
     */
    public static void main(String[] args) {
        OrganizationStructureType lineManagement = new OrganizationStructureType();
        lineManagement.setStructureType("LINE_MANAGEMENT");
        lineManagement.setOrganizationRules(new Rules());

        OrganizationStructure bostonSalesOffice = new OrganizationStructure(new SalesOffice(), lineManagement);
        OrganizationStructure bostonDivision = new OrganizationStructure(new Division(), lineManagement);
        OrganizationStructure bostonRegion = new OrganizationStructure(new Region(), lineManagement);
        OrganizationStructure bostonOperatingUnit = new OrganizationStructure(new OperatingUnit(), lineManagement);

        bostonSalesOffice.setParent(bostonDivision.getOrganization());
        bostonDivision.setParent(bostonRegion.getOrganization());
        bostonRegion.setParent(bostonOperatingUnit.getOrganization());

        System.out.println(bostonOperatingUnit);


    }
}

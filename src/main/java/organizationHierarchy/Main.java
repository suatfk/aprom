package organizationHierarchy;

public class Main {

    public static void main(String[] args) {
        Organization bostonSalesOffice = new SalesOffice();
        Organization bostonDivision = new Division();
        Organization bostonRegion = new Region();
        Organization bostonOperatingUnit = new OperatingUnit();

        bostonSalesOffice.setParent(bostonDivision);
        bostonDivision.setParent(bostonRegion);
        bostonRegion.setParent(bostonOperatingUnit);

        System.out.println(bostonOperatingUnit);

    }
}

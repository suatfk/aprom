package chapter5;

public enum IdentificationScheme {

    SOCIAL_SECURITY("Social Security Number"), PASSPORT("Passport number");

    private String name;

    IdentificationScheme(String name) {
        this.name = name;
    }
}

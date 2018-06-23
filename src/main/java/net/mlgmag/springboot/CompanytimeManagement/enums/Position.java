package net.mlgmag.springboot.CompanytimeManagement.enums;

public enum Position {
    CEO("Chief Executive Officer"),
    COO("Chief Operating Officer"),
    CFO("Chief Financial Officer"),
    Secretary("Secretary");

    private final String name;

    Position(String name) {
        this.name = name;
    }
}

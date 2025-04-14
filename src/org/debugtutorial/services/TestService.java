package org.debugtutorial.services;


import org.debugtutorial.util.DiscountValidator;

public class TestService {
    private final DiscountValidator validator = new DiscountValidator();

    public void unitTest() {
        System.out.println("[Test] Verifying discount codes...");
        // Some test-specific logic...
        System.out.println("[Test] Validating test code TEST2025...");
        validator.validate("TEST2025"); // Call should be ignored by conditional breakpoint
        System.out.println("[Test] Verification complete.");
    }
}
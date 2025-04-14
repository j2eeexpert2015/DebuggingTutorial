package org.debugtutorial.services;

import org.debugtutorial.util.DiscountValidator;

public class AdminService {
    private final DiscountValidator validator = new DiscountValidator();

    public void runReport() {
        System.out.println("[Admin] Running monthly discount report...");
        // Some admin-specific logic...
        System.out.println("[Admin] Validating internal code ADMIN50 for report...");
        validator.validate("ADMIN50"); // Call should be ignored by conditional breakpoint
        System.out.println("[Admin] Report generation finished.");
    }
}
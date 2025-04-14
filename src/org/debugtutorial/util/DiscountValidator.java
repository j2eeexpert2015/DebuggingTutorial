package org.debugtutorial.util; 

public class DiscountValidator {

    /**
     * Validates the given discount code.
     * @param code The discount code string.
     */
    public void validate(String code) {
        System.out.println(" !!!!!!!!!!!!!!!!!!!!!!!! Validating code: " + code + " (called by: " + getCallerClassName() + ")");

        // Simulate validation logic
        if (code == null || code.isEmpty()) {
            System.out.println("❗ Validation Result: Code is empty or null.");
            return;
        }

        if (code.startsWith("RETAIL")) {
            System.out.println("Validation Result: Retail code is valid.");
        } else if (code.startsWith("ADMIN")) {
            System.out.println("Validation Result: Admin code is valid.");
        } else if (code.startsWith("TEST")) {
            System.out.println("Validation Result: Test code is valid.");
        } else {
            System.out.println("Validation Result: Unknown code format.");
        }
    }

    /**
     * Helper method to get the class name of the immediate caller.
     * Used here for illustrative console output.
     */
    private String getCallerClassName() {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            // Index 0: getStackTrace
            // Index 1: getCallerClassName (this method)
            // Index 2: validate (the method calling this one)
            // Index 3: The actual caller of validate (e.g., checkout, runReport)
            if (stackTrace.length > 3) {
                 String fullClassName = stackTrace[3].getClassName();
                 return fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
            }
        } catch (Exception e) {
            // Ignore potential errors during stack trace inspection
        }
        return "Unknown";
    }
}
package org.debugtutorial.services; // Updated package

import org.debugtutorial.util.DiscountValidator;

public class RetailOrderService {
    private final DiscountValidator validator = new DiscountValidator();

    public void checkout() {
        System.out.println("[Retail] Initiating checkout...");
        // Some retail-specific logic here...
        System.out.println("[Retail] Applying discount code RETAIL10...");

        // Option : Conditional Breakpoint Approach (Recommended for this scenario)
        // Set a *conditional* breakpoint inside DiscountValidator.validate()
        // Condition: Thread.currentThread().getStackTrace()[2].getClassName().contains("RetailOrderService")

        // Option : Trigger Point Approach (If demonstrating triggers is the goal)
        // Set TRIGGER POINT on the line below (or the one just before)
        validator.validate("RETAIL10");

        System.out.println("[Retail] Checkout complete.");
    }
}
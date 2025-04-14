package org.debugtutorial.demo;

import org.debugtutorial.services.AdminService;
import org.debugtutorial.services.RetailOrderService;
import org.debugtutorial.services.TestService;

public class DebugDiscountValidation {
    public static void main(String[] args) {
        RetailOrderService retailService = new RetailOrderService();
        AdminService adminService = new AdminService();
        TestService testService = new TestService();

        System.out.println("\n--- Running Admin Workflow ---");
        // We want the conditional breakpoint in DiscountValidator to *ignore* this call
        adminService.runReport();

        System.out.println("\n--- Running Test Workflow ---");
        // We want the conditional breakpoint in DiscountValidator to *ignore* this call
        testService.unitTest();
        
        System.out.println("--- Running Retail Workflow ---");
        // We want the conditional breakpoint in DiscountValidator to trigger here
        retailService.checkout();

        System.out.println("\n--- Demo Complete ---");
    }
}
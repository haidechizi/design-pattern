package com.gupaoedu;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        DiscountApply discountApply = new DiscountApply();
        discountApply.setBillNo("12vg");
        discountApply.setCntrNo("11");
        discountApply.setOrderNo("99ud");
        discountApply.setVisitId("111");
        ImportApply importApply = new ImportApply();
        CopyPropertiesUtils.copyProperties(discountApply, importApply);
        System.out.println(importApply.getBillNo());
    }
}

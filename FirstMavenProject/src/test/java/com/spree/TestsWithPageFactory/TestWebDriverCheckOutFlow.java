package com.spree.TestsWithPageFactory;

import com.spree.pages.PageFactory.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWebDriverCheckOutFlow extends BaseClassTest {

//        @Test(priority = 1)
//        public void loginTest(){
//
//         LoginPage loginPage = new LoginPage(driver);
//         String loginMessageStr = loginPage.login("user2@gmail.com","Password@2");
//         Assert.assertTrue(loginMessageStr.contains("success"),"Login Message incorrect");
//        }

        @Test
            public void checkoutFlow(){
            LoginPage loginPage = new LoginPage(driver);
      String loginMessageStr = loginPage.login("user2@gmail.com","Password@2");
            CategorySelectPage categorySelect =  new CategorySelectPage(driver);
            categorySelect.selectCategoryFromSideBar();
            categorySelect.selectProduct();

            AddToCartPage addToCart = new AddToCartPage(driver);
            addToCart.addProductToCart("3");

            VerifyCartPage cartTotal = new VerifyCartPage(driver);
           // Assert.assertEquals(cartTotal.verifyTotal(),"$50.37");
            String cartTotalValue = cartTotal.verifyTotal();

            CheckOutPage checkOut = new CheckOutPage(driver);
            checkOut.checkoutCart();

            BillingPage billing = new BillingPage(driver);
            billing.clearTextBillingInformation();
            String summaryTotalFromBilling = billing.billingInformation();


            // Assert cart Total value in AddToCart Page and Summary total in Billing Page
            Assert.assertEquals(cartTotalValue,summaryTotalFromBilling);

            CheckOutToDeliveryPage checkoutDelivery = new CheckOutToDeliveryPage(driver);

            String shippingTotal = checkoutDelivery.getShippingTotal();
            System.out.println("Shipping total :"+shippingTotal);
            // trimming the dollar symbol from shipping  and storing as Double

            double summaryTotalBillingFloat = Double.valueOf(summaryTotalFromBilling.substring(1,(summaryTotalFromBilling.length()))).doubleValue();
            double shippingTotalFloat = Double.valueOf(shippingTotal.substring(1,(shippingTotal.length()))).doubleValue();

            String derivedSummaryTotal = "$"+String.valueOf(summaryTotalBillingFloat+shippingTotalFloat);
            System.out.println("derivedSummaryTotal : "+derivedSummaryTotal);

            //get actual order total value from checkout to delivery and compare with expected value

            //Assert.assertEquals(checkoutDelivery.getOrderTotalDelivery(),derivedSummaryTotal);
            Assert.assertEquals(checkoutDelivery.getOrderTotalDelivery(),"X");
            checkoutDelivery.continueToPayment();

            //Payment Information

            PaymentByCheckPage payment = new PaymentByCheckPage(driver);
            payment.completePaymentByCheck();

            //Order Complete Status verify
            OrderCompletePage orderStatus = new OrderCompletePage(driver);

            Assert.assertTrue((orderStatus.getOrderStatus()).contains("success"),"Order incomplete");

        }



}

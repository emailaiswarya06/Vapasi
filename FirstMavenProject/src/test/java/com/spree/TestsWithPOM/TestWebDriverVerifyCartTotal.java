package com.spree.TestsWithPOM;

import com.spree.pages.POM.AddingProduct;
import com.spree.pages.POM.CategorySelectPage;
import com.spree.pages.POM.LoginPage;
import com.spree.pages.POM.VerifyCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.spree.TestsWithPOM.BaseClassTest;

public class TestWebDriverVerifyCartTotal extends BaseClassTest {

  @Test
    public void testTotalCartValue(){

      LoginPage loginPage = new LoginPage(driver);
      loginPage.login("user1@gmail.com","Password@1");


      CategorySelectPage category = new CategorySelectPage(driver);
      category.selectCategory("Bags");
      category.selectProduct();

      AddingProduct addProduct = new AddingProduct(driver);
      addProduct.addProductToCart("2");

      VerifyCartPage verifyCart = new VerifyCartPage(driver);

      Assert.assertEquals(verifyCart.verifyTotal(),"$45.98");

  }



}

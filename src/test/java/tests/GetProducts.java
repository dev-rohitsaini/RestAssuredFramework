package tests;

import helpers.ProductServiceHelpers;
import models.Product;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertNotNull;

import java.util.List;

public class GetProducts {

    private ProductServiceHelpers productServiceHelpers;

    @BeforeClass
    public void init(){
        productServiceHelpers = new ProductServiceHelpers();
    }

    @Test
    public void validateAllProducts(){
        List<Product> productList = productServiceHelpers.getAllProducts();
        assertNotNull(productList,"Product list is not empty");


    }
}

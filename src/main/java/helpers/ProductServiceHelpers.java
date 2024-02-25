package helpers;

import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.Product;
import utils.ProductUtils;

import java.lang.reflect.Type;
import java.util.List;

import static contants.EndPoints.GET_PRODUCTS;

public class ProductServiceHelpers {


    public static final String base_url = ProductUtils.getInstance().getString("base_url");

    public ProductServiceHelpers(){
        System.out.println(base_url);
        RestAssured.baseURI = base_url;
        RestAssured.useRelaxedHTTPSValidation();
    }

    public List<Product> getAllProducts(){
        String endPoint = GET_PRODUCTS;
        Response response = RestAssured.given().
                                            contentType(ContentType.JSON).
                                        when().
                                            get(endPoint).
                                            andReturn();

        Type type = new TypeReference<List<Product>>(){}.getType();
        List<Product> productsList = response.as(type);
        return productsList;
    }


}

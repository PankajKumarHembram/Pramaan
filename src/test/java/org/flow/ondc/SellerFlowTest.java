package org.flow.ondc;

import controller.Mockserver;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utitility.ApiTest;

public class SellerFlowTest extends ApiTest {

    // Seller Testing
    public static String flowName, bppUri, bppId, searchType;
    public static int testId ;

    //Classes Declaration
    public Mockserver mockserver;


    @BeforeTest
    public void initializeClass(){
        mockserver = new Mockserver();
    }

    @Test
    public void orderToConfirmToFulfillment(){
        // Search from buyer to Gateway
        Response payload = mockserver.sendPostRequestForSearch(18771);

    }
}

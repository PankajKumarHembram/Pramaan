package com.ondc.test;

import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import constants.JsonPayload;
import controller.BuyerApiController;
import controller.Mockserver;
import controller.SellerApiController;
import io.restassured.response.Response;
import org.testng.Assert;
import utitility.Helper;

public class ValidateSearch {

    public void validateSearchAction() {
        try {
            Mockserver mockserver = new Mockserver();
            SellerApiController sellerApiController = new SellerApiController();
            Response response = mockserver.sendPostRequestForSearch(1234);
            Assert.assertNotNull(response, "Null response received from Mock Server");
            Assert.assertEquals(response.getStatusCode(), 200, "Mock Server Status Code");

            String header = Helper.getHeaderFromMock(response);
            String payload = Helper.extractAndStoreActionPayload(response, "search");

            //Send post to gateway
//        etest.log(Status.INFO, searchType + " request to Gateway");
            Response gatewayResponse = sellerApiController.sendSearchCallToGateway(header, payload);
//        sendConsoleMessageForSeller("Sending search call to gateway", TestStatus.INFO.getValue());
            Assert.assertNotNull(gatewayResponse, "Gateway Response");
            Assert.assertEquals(gatewayResponse.getStatusCode(), 200);
//        sendConsoleMessageForSeller("Received response from the gateway ", TestStatus.INFO.getValue());
            JsonPayload.ON_CONTEXT_TIMESTAMP = gatewayResponse.jsonPath().getString("context.timestamp");
            Markup markup = MarkupHelper.createCodeBlock(gatewayResponse.getBody().asPrettyString());
//        etest.info("Gateway response");
//        etest.info(markup);

            if (gatewayResponse.jsonPath().getString("message.ack.status").equalsIgnoreCase("NACK")) {
//            etest.log(Status.FAIL,"Test execution stopped due to gateway response: NACK received");
//            sendConsoleMessageForSeller("Received NACK from the gateway ", TestStatus.FAIL.getValue());
                Assert.fail("Received NACK ");
            }

            Assert.assertEquals(gatewayResponse.jsonPath().get("message.ack.status"), "ACK", "Gateway Response Status");
//        etest.log(Status.PASS, "Received ACK response from Gateway");
//        sendConsoleMessageForSeller("Received ACK from the gateway ", TestStatus.SUCCESS.getValue());
        }
    catch (AssertionError e) {
//        etest.log(Status.FAIL, "Unable to validate gateway response: " +e.getMessage());
//        CustomException.addErrorMessages("Unable to validate gateway response: " + e.getMessage());
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
//        log.error("Exception occurred in {}", methodName);
        Assert.fail("Assertion Error Occurred in Gateway: " + e.getMessage());
    } catch (Exception e) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
//        log.error("Exception occurred in {}", methodName);
        Assert.fail("Exception Occurred in Gateway: " + e.getMessage());
    }
    }

    public void waitForResponse(int waitTimeInMinutes, int pollIntervalInSec ){
        long MAX_WAIT_TIME = waitTimeInMinutes*10000;
        long POLL_INTERVAL = pollIntervalInSec*1000;
    }

    public void validateOnSearchAction() {
        BuyerApiController buyerApiController = new BuyerApiController();
        Response response = buyerApiController.getOnSearch();
    }
}

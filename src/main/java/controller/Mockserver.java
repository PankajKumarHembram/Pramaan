package controller;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.response.Response;
import utitility.Helper;
import utitility.Properties;

public class Mockserver extends ApiController{

    public final String baseUri = Properties.mockServerUrl;
    public final String PAYLOAD = "/payload";
    public String SEARCH = "/search";
    public String flowName ;
    public boolean isUpdateRefundVtd;

    public Response sendPostRequestForSearch( int testId, String searchType) {
        try {
            log.info("Sending POST request to baseURI: {} pathParam: {} \n payload:{}", SEARCH, PAYLOAD, (Helper.bodyForSearch(flowName,searchType,isUpdateRefundVtd)));

            EncoderConfig encoderConfig = RestAssured.config().getEncoderConfig()
                    .appendDefaultContentCharsetToContentTypeIfUndefined(false);
            RestAssured.config = RestAssured.config().encoderConfig(encoderConfig);
            new RequestSpecBuilder().build();

            Response response = RestAssured.given().log().everything(false)
                    .header(REQUEST_ACCEPT_HEADER, APPLICATION_JSON)
                    .header(CONTENT_TYPE, APPLICATION_JSON)
                    .header("searchtype", searchType)
                    .body(Helper.bodyForSearch(flowName,searchType,isUpdateRefundVtd)).post(baseUri + PAYLOAD + SEARCH + "/" + testId)
                    .andReturn();
            System.out.println("Response");
            System.out.println(response.getBody().asString());

            return response;
        } catch (Exception e) {
            log.error(POST_EXCEPTION);
        }
        return null;
    }

    public Response sendPostRequestForSearch(int testId) {
       return sendPostRequestForSearch(testId,"/search_by_city");
    }
}

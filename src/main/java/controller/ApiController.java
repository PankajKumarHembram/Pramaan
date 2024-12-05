package controller;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApiController {
    public  final String POST_EXCEPTION = "Exception occurred POST call";
    public  final String STATUS = "/status";
    public  final String PAYLOAD = "/payload";
    public  final String REQUEST_ACCEPT_HEADER = "Accept";
    public  final String APPLICATION_JSON = "application/json";
    public  final String CONTENT_TYPE = "Content-Type";
    public  String timerKey = "";
    public   final Logger log = LogManager.getLogger();
    public  String mapplsUrl = "https://apis.mappls.com/advancedmaps/v1/";
    public  String key = "vs7x51936v8686tw261s47w7w3wxut74";

    public Response sendGetRequest(String baseUri, String pathParam) {
        try {
            log.info("Sending GET request to URI: {}{}", baseUri, pathParam);

            EncoderConfig encoderConfig = RestAssured.config().getEncoderConfig()
                    .appendDefaultContentCharsetToContentTypeIfUndefined(false);
            RestAssured.config = RestAssured.config().encoderConfig(encoderConfig);
            new RequestSpecBuilder().build();

            Response response = RestAssured.given().log().everything(false)
                    .header(REQUEST_ACCEPT_HEADER, APPLICATION_JSON)
                    .header(CONTENT_TYPE, APPLICATION_JSON)
                    .get(baseUri + "/" + pathParam);
            System.out.println("---------------------Response----------------------");
            System.out.println(response.getBody().asString());

            return response;
        } catch (Exception e) {
            log.error("Exception occurred GET call baseUri: {} pathParam: {}", baseUri, pathParam);
        }
        return null;
    }

    public  Response sendPostRequest(String baseUri, String pathParam, String payload, int testId, String transactionId1, String transactionId2) {
        try {
            log.info("Sending POST request to baseURI: {} pathParam: {} \n payload:{}", baseUri, pathParam, payload);
            EncoderConfig encoderConfig = RestAssured.config().getEncoderConfig()
                    .appendDefaultContentCharsetToContentTypeIfUndefined(false);
            RestAssured.config = RestAssured.config().encoderConfig(encoderConfig);
            new RequestSpecBuilder().build();
            Response response = RestAssured.given().log().everything(false)

                    .header(REQUEST_ACCEPT_HEADER, APPLICATION_JSON)
                    .header(CONTENT_TYPE, APPLICATION_JSON)
                    .header("transactionid1", transactionId1)
                    .header("transactionid2", transactionId2)
                    .body(payload).post(baseUri + PAYLOAD + pathParam + "/" + testId)
                    .andReturn();
            System.out.println("Response");
            System.out.println(response.getBody().asString());

            return response;
        } catch (Exception e) {
            log.error(POST_EXCEPTION);
        }
        return null;
    }
}

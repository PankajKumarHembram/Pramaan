package controller;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.response.Response;

public class PayloadApiController extends ApiController{

    public Response getPayloadFromMockServer(String baseUri,String pathParam){
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
    }
}

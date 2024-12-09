package controller;

import io.restassured.response.Response;
import utitility.Properties;

public class SellerApiController extends ApiController{

    public Response sendSearchCallToGateway(String header, String paylod){
        return sendPostRequestWithAuthorization(Properties.gatewayUrl,"/search",header,paylod);
    }
}

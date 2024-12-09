package controller;

import io.restassured.response.Response;
import utitility.Properties;

public class BuyerApiController extends ApiController {
    public Response getOnSearch(){
        return sendGetRequest(Properties.mockServerUrl,"on_search");
    }
}

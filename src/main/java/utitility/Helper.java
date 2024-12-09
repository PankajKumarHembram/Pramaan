package utitility;

import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import constants.JsonPayload;
import constants.JsonResponse;
import controller.ApiController;
import io.restassured.builder.ResponseBuilder;
import io.restassured.response.Response;



public class Helper extends ApiController {

    // Creating body for search
    public static String bodyForSearch(String flowName ,String SearchType,boolean isUpdateRefundVtd) {
        try {
            return String.format("{\n" +
                    " \"flow_name\":\"%s\",\n" +
                    " \"flow_type\":\"%s\",\n" +
                    " \"update_refund\":%s" +
                    "}", flowName, SearchType, isUpdateRefundVtd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    //Method to extract header form response of Mock Server
    public static String getHeaderFromMock(Response response) {
        try {
            log.info("Getting header from mock server");
            return response.jsonPath().get("header").toString().trim();
        } catch (Exception e) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            log.error("Exception occurred in {}", methodName);
        }
        return null;
    }

    public static String extractAndStoreActionPayload(Response response, String action){
        try {
            Gson gson = new Gson();
            JsonObject responseObject = gson.fromJson(response.getBody().print(), JsonObject.class);

            log.info("Getting payload for Action call from mock server");
            new JsonPayload().storeActionCallsContextValues(response.jsonPath().getMap("payload.context"));
            String payload = responseObject.get("payload").toString();

            Response payloadResponse = new ResponseBuilder().clone(response).setBody(payload).build();
            JsonResponse.storeResponse(payloadResponse, action);

//            etest.info(action + ": call payload");
            Markup markup = MarkupHelper.createCodeBlock(payloadResponse.getBody().prettyPrint());
//            etest.info(markup);

            return payload;
        } catch (Exception e) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            log.error("Exception occurred in {}", methodName);
            return null;
        }
    }
}

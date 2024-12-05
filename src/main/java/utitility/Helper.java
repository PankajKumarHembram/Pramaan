package utitility;

public class Helper {

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
}

package utitility;

public class Properties {
        public static String xmlBaseUri;
        public static String gatewayUrl;
        public static String mockServerUrl;

        public static void initiateUris(String environment) {
            if (environment.equalsIgnoreCase("dev")) {
                mockServerUrl = "https://ondc-qa-api-gateway-dev.thewitslab.com";
                xmlBaseUri = "https://ondc-qa-api-gateway-dev.thewitslab.com/v1/test";
            } else if (environment.equalsIgnoreCase("prod")) {
                mockServerUrl = "https://pramaan.ondc.org/alpha/api-gateway";
                xmlBaseUri = "https://pramaan.ondc.org/alpha/qa-engine/v1/test";
            } else {
                mockServerUrl = "";
                xmlBaseUri = "";
            }

        }
}



package constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class JsonPayload {

        private static final Logger log = LogManager.getLogger(JsonPayload.class.getName());
        public static final String RET_CONTEXT_TTL = "PT30S";
        public static final String RET_CONTEXT_ACTION = "action";
        public static final String SEARCH = "search";
        public static final String LOG_SEARCH = "/search";
        public static final String ON_INIT_LOGISTICS = "on_init_logistics";
        public static final String ON_ISSUE_STATUS_LOGISTICS = "on_issue_status_logistics";
        public static final String ON_ISSUE_LOGISTICS = "on_issue_logistics";
        public static final String ON_CONFIRM_LOGISTICS = "on_confirm_logistics";
        public static final String ISSUE = "/issue";
        public static final String INIT = "init";
        public static final String ON_SEARCH = "on_search";
        public static final String ON_SELECT = "on_select";
        public static final String ON_INIT = "on_init";
        public static final String ON_CONFIRM = "on_confirm";
        public static final String LOG_ON_SEARCH = "/on_search";
        public static final String VARIANTS = "variants";
        public static final String ON_SEARCH_LOGISTICS = "on_search_logistics";
        public static final String SELECT = "select";


        public static final String CONFIRM = "confirm";
        public static final String CANCEL = "cancel";
        public static final String INFO = "info";
        public static final String ON_INFO = "on_info";
        public static final String ON_RATING = "on_rating";
        public static final String RATING = "rating";

        public static final String ON_CANCEL = "on_cancel";
        public static final String LOG_ON_CANCEL = "/on_cancel";
        public static final String SLASH_CANCEL = "/cancel";
        public static final String UPDATE = "update";
        public static final String CATALOG_ERROR = "catalog_error";


        public static final String ON_CANCEL_LOGISTICS = "on_cancel_logistics";
        public static final String ON_CANCEL_RTO_LOGISTICS = "on_cancel_rto_logistics";
        public static final String ON_ISSUE="on_issue";
        public static final String LOG_ON_ISSUE="/on_issue";
        public static final String LOG_ISSUE="/issue";
        public static final String LOG_RATING="/rating";
        public static final String ISSUE_STATUS="/issue_status";
        public static final String ON_ISSUE_STATUS="on_issue_status";
        public static final String ON_TRACK = "on_track";
        public static final String ON_TRACK_LOGISTICS = "on_track_logistics";
        public static final String TRACK = "/track";
        public static final String ON_STATUS = "on_status";
        public static final String LOG_ON_STATUS = "/on_status";
        public static final String ON_UPDATE = "on_update";
        public static final String LOG_ON_UPDATE = "/on_update";
        public static final String SLASH_UPDATE = "/update";
        public static final String ON_STATUS_LOGISTICS = "on_status_logistics";
        public static final String STATUS = "/status";
        public static final String LOG_STATUS = "/status";
        public static final String CATALOGUE_REJECTION = "/catalog_rejection";
        public static String CONTEXT_COUNTRY;
        public static String CONTEXT_CITY;
        public static String CONTEXT_ACTION;
        public static String CONTEXT_VERSION;
        public static String CONTEXT_BAP_ID;
        public static String CONTEXT_BAP_URI;
        public static String CONTEXT_BPP_ID;
        public static String CONTEXT_BPP_URI;
        public static String CONTEXT_MESSAGE_ID;
        public static String CONTEXT_DOMAIN;
        public static String CONTEXT_TRANSACTION_ID;
        public static String CONTEXT_TTL;
        public static String CONTEXT_TIMESTAMP;

        //On-Action Attributes
    public static String ON_CONTEXT_TIMESTAMP;

        public void storeActionCallsContextValues(Map<String, String> context) {
            try {
                CONTEXT_COUNTRY = context.get("country");
                CONTEXT_CITY = context.get("city");
                CONTEXT_ACTION = context.get("action");
                CONTEXT_VERSION = context.get("core_version");
                CONTEXT_BAP_ID = context.get("bap_id");
                CONTEXT_BAP_URI = context.get("bap_uri");
                CONTEXT_MESSAGE_ID = context.get("message_id");
                CONTEXT_DOMAIN = context.get("domain");
                CONTEXT_TRANSACTION_ID = context.get("transaction_id");
                CONTEXT_TTL = context.get("ttl");
                CONTEXT_TIMESTAMP = context.get("timestamp");
                log.info("Successfully added Context values");
            } catch (Exception e) {
                log.error("Error occurred while storing action call context values ");
            }
        }
    }


package constants;

import io.restassured.path.json.JsonPath;

public class JsonResponse {

        public static JsonPath onSearchJsonPath;
        public static JsonPath selectJsonPath;
        public static JsonPath onSelectJsonPath;
        public static JsonPath initJsonPath;
        public static JsonPath onInitJsonPath;
        public static JsonPath confirmJsonPath;
        public static JsonPath onConfirmJsonPath;
        public static JsonPath statusJsonPath;
        public static JsonPath onStatusJsonPath;
        public static JsonPath trackJsonPath;
        public static JsonPath onTrackJsonPath;
        public static JsonPath cancelJsonPath;
        public static JsonPath onCancelJsonPath;
        public static JsonPath updateJsonPath;
        public static JsonPath onUpdateJsonPath;
        public static JsonPath issueJsonPath;
        public static JsonPath onIssueJsonPath;
        public static JsonPath issueStatusJsonPath;
        public static JsonPath onIssueStatusJsonPath;
        public static JsonPath infoJsonPath;
        public static JsonPath onInfoJsonPath;
        public static JsonPath ratingJsonPath;
        public static JsonPath onRatingJsonPath;
        public static JsonPath searchJsonpath;


        public static JsonPath onSearchLogisticJsonPath;
        public static JsonPath selectLogisticJsonPath;
        public static JsonPath onSelectLogisticJsonPath;
        public static JsonPath initLogisticJsonPath;
        public static JsonPath onInitLogisticJsonPath;
        public static JsonPath confirmLogisticJsonPath;
        public static JsonPath onConfirmLogisticJsonPath;
        public static JsonPath statusLogisticJsonPath;
        public static JsonPath onStatusLogisticJsonPath;
        public static JsonPath trackLogisticJsonPath;
        public static JsonPath onTrackLogisticJsonPath;
        public static JsonPath cancelLogisticJsonPath;
        public static JsonPath onCancelLogisticJsonPath;
        public static JsonPath updateLogisticJsonPath;
        public static JsonPath onUpdateLogisticJsonPath;
        public static JsonPath issueLogisticJsonPath;
        public static JsonPath onIssueLogisticJsonPath;
        public static JsonPath issueStatusLogisticJsonPath;
        public static JsonPath onIssueStatusLogisticJsonPath;
        public static JsonPath infoLogisticJsonPath;
        public static JsonPath onInfoLogisticJsonPath;
        public static JsonPath ratingLogisticJsonPath;
        public static JsonPath onRatingLogisticJsonPath;
        public static JsonPath searchLogisticJsonpath;
        public static JsonPath onCancelRtoJsonPath;
        public static JsonPath acceptedOnStatus;
        public static JsonPath completedOnStatus;
        public static JsonPath inProgressOnStatus;

        public static JsonPath catalogueRejectionJsonPath;


        public static void storeResponse(io.restassured.response.Response response, String action) {
            if ("search".equals(action) || "/search".equals(action)) {
                searchJsonpath = response.jsonPath();
            } else if ("on_search".equals(action) || "/on_search".equals(action)) {
                onSearchJsonPath = response.jsonPath();
            } else if ("select".equals(action) || "/select".equals(action)) {
                selectJsonPath = response.jsonPath();
            } else if ("on_select".equals(action) || "/on_select".equals(action)) {
                onSelectJsonPath = response.jsonPath();
            } else if ("init".equals(action) || "/init".equals(action)) {
                initJsonPath = response.jsonPath();
            } else if ("on_init".equals(action) || "/on_init".equals(action)) {
                onInitJsonPath = response.jsonPath();
            } else if ("confirm".equals(action) || "/confirm".equals(action)) {
                confirmJsonPath = response.jsonPath();
            } else if ("on_confirm".equals(action) || "/on_confirm".equals(action)) {
                onConfirmJsonPath = response.jsonPath();
            } else if ("status".equals(action) || "/status".equals(action)) {
                statusJsonPath = response.jsonPath();
            } else if ("on_status".equals(action) || "/on_status".equals(action)) {
                onStatusJsonPath = response.jsonPath();
            } else if ("track".equals(action) || "/track".equals(action)) {
                trackJsonPath = response.jsonPath();
            } else if ("on_track".equals(action) || "/on_track".equals(action)) {
                onTrackJsonPath = response.jsonPath();
            } else if ("cancel".equals(action) || "/cancel".equals(action)) {
                cancelJsonPath = response.jsonPath();
            } else if ("on_cancel".equals(action) || "/on_cancel".equals(action)) {
                onCancelJsonPath = response.jsonPath();
            } else if ("update".equals(action) || "/update".equals(action)) {
                updateJsonPath = response.jsonPath();
            } else if ("on_update".equals(action) || "/on_update".equals(action)) {
                onUpdateJsonPath = response.jsonPath();
            } else if ("issue".equals(action) || "/issue".equals(action)) {
                issueJsonPath = response.jsonPath();
            } else if ("on_issue".equals(action) || "/on_issue".equals(action)) {
                onIssueJsonPath = response.jsonPath();
            } else if ("issue_status".equals(action) || "/issue_status".equals(action)) {
                issueStatusJsonPath = response.jsonPath();
            } else if ("on_issue_status".equals(action) || "/on_issue_status".equals(action)) {
                onIssueStatusJsonPath = response.jsonPath();
            } else if ("info".equals(action) || "/info".equals(action)) {
                infoJsonPath = response.jsonPath();
            } else if ("on_info".equals(action) || "/on_info".equals(action)) {
                onInfoJsonPath = response.jsonPath();
            } else if ("rating".equals(action) || "/rating".equals(action)) {
                ratingJsonPath = response.jsonPath();
            } else if ("on_rating".equals(action) || "/on_rating".equals(action)) {
                onRatingJsonPath = response.jsonPath();
            } else if ("catalog_rejection".equals(action) || "/catalog_rejection".equals(action)) {
                catalogueRejectionJsonPath = response.jsonPath();
            } else {
                System.out.println("Unknown action call");
            }

        }

        public static JsonPath getJsonPath(String action) {
            if ("search".equals(action) || "/search".equals(action)) {
                return searchJsonpath;
            } else if ("on_search".equals(action) || "/on_search".equals(action)) {
                return onSearchJsonPath;
            } else if ("select".equals(action) || "/select".equals(action)) {
                return selectJsonPath;
            } else if ("on_select".equals(action) || "/on_select".equals(action)) {
                return onSelectJsonPath;
            } else if ("init".equals(action) || "/init".equals(action)) {
                return initJsonPath;
            } else if ("on_init".equals(action) || "/on_init".equals(action)) {
                return onInitJsonPath;
            } else if ("confirm".equals(action) || "/confirm".equals(action)) {
                return confirmJsonPath;
            } else if ("on_confirm".equals(action) || "/on_confirm".equals(action)) {
                return onConfirmJsonPath;
            } else if ("status".equals(action) || "/status".equals(action)) {
                return statusJsonPath;
            } else if ("on_status".equals(action) || "/on_status".equals(action)) {
                return onStatusJsonPath;
            } else if ("track".equals(action) || "/track".equals(action)) {
                return trackJsonPath;
            } else if ("on_track".equals(action) || "/on_track".equals(action)) {
                return onTrackJsonPath;
            } else if ("cancel".equals(action) || "/cancel".equals(action)) {
                return cancelJsonPath;
            } else if ("on_cancel".equals(action) || "/on_cancel".equals(action)) {
                return onCancelJsonPath;
            } else if ("update".equals(action) || "/update".equals(action)) {
                return updateJsonPath;
            } else if ("on_update".equals(action) || "/on_update".equals(action)) {
                return onUpdateJsonPath;
            } else if ("issue".equals(action) || "/issue".equals(action)) {
                return issueJsonPath;
            } else if ("on_issue".equals(action) || "/on_issue".equals(action)) {
                return onIssueJsonPath;
            } else if ("issue_status".equals(action) || "/issue_status".equals(action)) {
                return issueStatusJsonPath;
            } else if ("on_issue_status".equals(action) || "/on_issue_status".equals(action)) {
                return onIssueStatusJsonPath;
            } else if ("info".equals(action) || "/info".equals(action)) {
                return infoJsonPath;
            } else if ("on_info".equals(action) || "/on_info".equals(action)) {
                return onInfoJsonPath;
            } else if ("rating".equals(action) || "/rating".equals(action)) {
                return ratingJsonPath;
            } else if ("on_rating".equals(action) || "/on_rating".equals(action)) {
                return onRatingJsonPath;
            } else {
                System.out.println("Unknown action call");
                return null;
            }
        }


        public static void storeResponseLogistics(io.restassured.response.Response response, String action) {
            if ("search".equals(action) || "/search".equals(action)) {
                searchLogisticJsonpath = response.jsonPath();
            } else if ("on_search".equals(action) || "/on_search".equals(action)) {
                onSearchLogisticJsonPath = response.jsonPath();
            } else if ("select".equals(action) || "/select".equals(action)) {
                selectLogisticJsonPath = response.jsonPath();
            } else if ("on_select".equals(action) || "/on_select".equals(action)) {
                onSelectLogisticJsonPath = response.jsonPath();
            } else if ("init".equals(action) || "/init".equals(action)) {
                initLogisticJsonPath = response.jsonPath();
            } else if ("on_init".equals(action) || "/on_init".equals(action)) {
                onInitLogisticJsonPath = response.jsonPath();
            } else if ("confirm".equals(action) || "/confirm".equals(action)) {
                confirmLogisticJsonPath = response.jsonPath();
            } else if ("on_confirm".equals(action) || "/on_confirm".equals(action)) {
                onConfirmLogisticJsonPath = response.jsonPath();
            } else if ("status".equals(action) || "/status".equals(action)) {
                statusLogisticJsonPath = response.jsonPath();
            } else if ("on_status".equals(action) || "/on_status".equals(action)) {
                onStatusLogisticJsonPath = response.jsonPath();
            } else if ("track".equals(action) || "/track".equals(action)) {
                trackLogisticJsonPath = response.jsonPath();
            } else if ("on_track".equals(action) || "/on_track".equals(action)) {
                onTrackLogisticJsonPath = response.jsonPath();
            } else if ("cancel".equals(action) || "/cancel".equals(action)) {
                cancelLogisticJsonPath = response.jsonPath();
            } else if ("on_cancel".equals(action) || "/on_cancel".equals(action)) {
                onCancelLogisticJsonPath = response.jsonPath();
            } else if ("update".equals(action) || "/update".equals(action)) {
                updateLogisticJsonPath = response.jsonPath();
            } else if ("on_update".equals(action) || "/on_update".equals(action)) {
                onUpdateLogisticJsonPath = response.jsonPath();
            } else if ("issue".equals(action) || "/issue".equals(action)) {
                issueLogisticJsonPath = response.jsonPath();
            } else if ("on_issue".equals(action) || "/on_issue".equals(action)) {
                onIssueLogisticJsonPath = response.jsonPath();
            } else if ("issue_status".equals(action) || "/issue_status".equals(action)) {
                issueStatusLogisticJsonPath = response.jsonPath();
            } else if ("on_issue_status".equals(action) || "/on_issue_status".equals(action)) {
                onIssueStatusLogisticJsonPath = response.jsonPath();
            } else if ("info".equals(action) || "/info".equals(action)) {
                infoLogisticJsonPath = response.jsonPath();
            } else if ("on_info".equals(action) || "/on_info".equals(action)) {
                onInfoLogisticJsonPath = response.jsonPath();
            } else if ("rating".equals(action) || "/rating".equals(action)) {
                ratingLogisticJsonPath = response.jsonPath();
            } else if ("on_rating".equals(action) || "/on_rating".equals(action)) {
                onRatingLogisticJsonPath = response.jsonPath();
            } else if ("on_status_Accepted".equalsIgnoreCase(action)) {
                acceptedOnStatus = response.jsonPath();
            } else if ("on_status_In-progress".equalsIgnoreCase(action)) {
                inProgressOnStatus = response.jsonPath();
            } else if ("on_status_Completed".equalsIgnoreCase(action)) {
                completedOnStatus = response.jsonPath();
            } else if ("on_cancel_rto".equalsIgnoreCase(action)) {
                onCancelRtoJsonPath = response.jsonPath();
            } else {
                System.out.println("Unknown action call");
            }
        }

        public static JsonPath getJsonPathLogistics(String action) {
            if ("search".equals(action) || "/search".equals(action)) {
                return searchLogisticJsonpath;
            } else if ("on_search".equals(action) || "/on_search".equals(action)) {
                return onSearchLogisticJsonPath;
            } else if ("select".equals(action) || "/select".equals(action)) {
                return selectLogisticJsonPath;
            } else if ("on_select".equals(action) || "/on_select".equals(action)) {
                return onSelectLogisticJsonPath;
            } else if ("init".equals(action) || "/init".equals(action)) {
                return initLogisticJsonPath;
            } else if ("on_init".equals(action) || "/on_init".equals(action)) {
                return onInitLogisticJsonPath;
            } else if ("confirm".equals(action) || "/confirm".equals(action)) {
                return confirmLogisticJsonPath;
            } else if ("on_confirm".equals(action) || "/on_confirm".equals(action)) {
                return onConfirmLogisticJsonPath;
            } else if ("status".equals(action) || "/status".equals(action)) {
                return statusLogisticJsonPath;
            } else if ("on_status".equals(action) || "/on_status".equals(action)) {
                return onStatusLogisticJsonPath;
            } else if ("track".equals(action) || "/track".equals(action)) {
                return trackLogisticJsonPath;
            } else if ("on_track".equals(action) || "/on_track".equals(action)) {
                return onTrackLogisticJsonPath;
            } else if ("cancel".equals(action) || "/cancel".equals(action)) {
                return cancelLogisticJsonPath;
            } else if ("on_cancel".equals(action) || "/on_cancel".equals(action)) {
                return onCancelLogisticJsonPath;
            } else if ("update".equals(action) || "/update".equals(action)) {
                return updateLogisticJsonPath;
            } else if ("on_update".equals(action) || "/on_update".equals(action)) {
                return onUpdateLogisticJsonPath;
            } else if ("issue".equals(action) || "/issue".equals(action)) {
                return issueLogisticJsonPath;
            } else if ("on_issue".equals(action) || "/on_issue".equals(action)) {
                return onIssueLogisticJsonPath;
            } else if ("issue_status".equals(action) || "/issue_status".equals(action)) {
                return issueStatusLogisticJsonPath;
            } else if ("on_issue_status".equals(action) || "/on_issue_status".equals(action)) {
                return onIssueStatusLogisticJsonPath;
            } else if ("info".equals(action) || "/info".equals(action)) {
                return infoLogisticJsonPath;
            } else if ("on_info".equals(action) || "/on_info".equals(action)) {
                return onInfoLogisticJsonPath;
            } else if ("rating".equals(action) || "/rating".equals(action)) {
                return ratingLogisticJsonPath;
            } else if ("on_rating".equals(action) || "/on_rating".equals(action)) {
                return onRatingLogisticJsonPath;
            } else {
                System.out.println("Unknown action call");
                return null;
            }
        }


}

package all;

import io.restassured.RestAssured;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;
import utils.ApplicationProperties;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    private Logger logger = Logger.getLogger(BaseTest.class);
    int runId = ApplicationProperties.INSTANCE.getRunId();

    @BeforeSuite
    public void createSuite() {

        logger.info("Initializing Suite");
        RestAssured.baseURI = ApplicationProperties.INSTANCE.getBaseUrl();
        RestAssured.port = ApplicationProperties.INSTANCE.getPort();

    }

    @AfterSuite
    public void afterTest() {

        logger.info("Terminating Suite");
    }

    @AfterMethod
    public void afterTest(ITestResult result, ITestContext ctx, Method method) throws IOException, APIException, NoSuchMethodException {

        Map data = new HashMap();
        if (result.getStatus() == 1) {
            data.put("status_id", 1);
            data.put("comment", "after method pass ");
        } else {
            data.put("status_id", 5);
            data.put("comment", result.getThrowable().toString() + "   after method update fail");
        }

        Method m = StarwarPersonTests.class.getMethod(method.getName());
        if (m.isAnnotationPresent(TestRails.class)) {
            TestRails ta = m.getAnnotation(TestRails.class);

            APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
            client.setUser("chetanya1992@gmail.com");
            client.setPassword("Chaitanya1992");

            if (ta.caseId() != 0)
            {
                JSONArray c1 = (JSONArray) client.sendGet("get_results_for_case/" + runId + "/" + ta.caseId());
                JSONObject jsonObject1 = (JSONObject) c1.get(0);
                long statusId = (long) jsonObject1.get("status_id");
                if (statusId != 1)
                {
                    JSONObject c = (JSONObject) client.sendPost("add_result_for_case/" + runId + "/" + ta.caseId(), data);
                }
            }

        }
    }
}






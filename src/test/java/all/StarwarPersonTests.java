package all;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class StarwarPersonTests extends all.BaseTest {

    private Logger logger =  Logger.getLogger(StarwarPersonTests.class);

    @Test(groups = "ch")
    @TestRails(caseId = 6)
    public void getPeopleTest() {

                when().
                request("GET","/people/1").
                then().
                statusCode(200);
    }

    @Test(groups = "ch")
    @TestRails(caseId=7)
    public void getPeopleAsJson() throws JsonProcessingException {

        JsonPath jsonPath = when().
                            request("GET","/people/1").
                            then().
                            extract().body().jsonPath();

        String name = jsonPath.getString("name");

        assertThat(name,is(notNullValue()));
    }

}

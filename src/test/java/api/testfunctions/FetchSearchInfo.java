package api.testfunctions;

import java.util.Properties;

import org.testng.Assert;

import commons.AppUtils;
import commons.GenericUtils;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FetchSearchInfo {
	
	public static Properties property = GenericUtils.AppFileReader("src/main/resources/data/App.properties");
	
	public static void getDataSearchDetails() {
		RestAssured.baseURI = property.getProperty("Base_URL");
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest.request(Method.GET, "");
		AppUtils data = new AppUtils(res.getStatusCode(), res.getBody().asString());
		System.out.println("Status detail and code : "+data.getStatusCode());
		Assert.assertEquals(res.getStatusCode(), 200, "Verify status code");
		System.out.println("Response details : "+data.getResponseData());
	}
}

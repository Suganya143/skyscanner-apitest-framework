package api.testsuites;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.testfunctions.FetchSearchInfo;

public class TestSuite_Search 
{
    @Test
    public void shouldRespondWithData()
    {
    	FetchSearchInfo.getDataSearchDetails();
    	Assert.assertTrue(true);
    }
}

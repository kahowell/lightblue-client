package com.redhat.lightblue.client.request.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.redhat.lightblue.client.request.AbstractLightblueRequestTest;

public class TestDataUpdateRequest extends AbstractLightblueRequestTest {

	DataUpdateRequest request;
	
	@Before
	public void setUp() throws Exception {
		request = new DataUpdateRequest();
	}
	
	@Test
	public void testGetOperationPathParam() {
		Assert.assertEquals(DataUpdateRequest.PATH_PARAM_UPDATE, request.getOperationPathParam());
	}

}

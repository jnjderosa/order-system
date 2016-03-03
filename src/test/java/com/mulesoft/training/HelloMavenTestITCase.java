package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTestITCase extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("helloFlow", "hello ");
    }
  
/**  @Test
    public void retrieveOrdersAddsAppropriateHeader() throws Exception {
      MuleEvent event = runFlow("processOrders");
      String contentType = event.getMessage().getOutboundProperty("Content-Type");
      assertEquals("application/json", contentType);
    }**/

    @Override
    protected String getConfigFile() {
        return "order-system.xml";
    }

}

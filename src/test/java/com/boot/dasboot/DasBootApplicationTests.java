package com.boot.dasboot;

import com.boot.dasboot.controller.HomeController;
import org.junit.Assert;
import org.junit.Test;

public class DasBootApplicationTests {

	@Test
	public void testApp() {
        HomeController hc = new HomeController();
        String result = hc.home();
        Assert.assertEquals(result, "Das Boot, reporting for duty!");
    }

}

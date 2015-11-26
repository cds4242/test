package com.kona.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.DemoGradleApplication;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoApplicationTests.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoGradleApplication.class)
@WebAppConfiguration
public class ControlTest {

	/**
	 * Context loads.
	 */
	@Test
	public void contextLoads() {
	}

}

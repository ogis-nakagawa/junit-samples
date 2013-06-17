package sample;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sample.catagory.IntegrationTests;
import sample.catagory.PerformanceTests;

@Category(IntegrationTests.class)
public class IntegrationTest {
	static Logger logger = LoggerFactory.getLogger(IntegrationTest.class);
	
		@Test
		public void testA() {
			logger.debug("IntegrationTests");
		}		

		@Test
		@Category(PerformanceTests.class)
		public void testB() {
			logger.debug("PerformanceTests");
		}		

		@Test
		public void testC() {
			logger.debug("normal testcase");
		}		
}

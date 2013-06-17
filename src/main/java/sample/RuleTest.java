package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuleTest {
	static Logger logger = LoggerFactory.getLogger(RuleTest.class);

//	@Rule
//	public ServerResource server = new ServerResource("db");
//	@Rule
//	public ServerResource server1 = new ServerResource("app");

	@Rule
	public RuleChain rules = RuleChain
		.outerRule(new ServerResource("db"))
		.around(new ServerResource("app1"))
		.around(new ServerResource("app2"));
	
	
	@BeforeClass
	static public void setupClass() {
		logger.debug("@BeforeClass");
	}

	@Before
	public void setup() {
		logger.debug("@Before");
	}

	@AfterClass
	static public void teatDownClass() {
		logger.debug("@AfterClass");
	}
	
	@After
	public void tearDown() {
		logger.debug("@After");
	}

	@Test
	public void test() {
		logger.debug("@Test");		
	}
}

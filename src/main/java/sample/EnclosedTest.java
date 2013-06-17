package sample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Enclosed.class)
public class EnclosedTest {
	static Logger logger = LoggerFactory.getLogger(CalculatorTest.class);
	
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
	public void testNormalCase() {
		logger.debug("normal case.");
	}

	public static class SuccessCase {
		@BeforeClass
		static public void setupClass() {
			logger.debug("SuccessCase - @BeforeClass");
		}

		@Before
		public void setup() {
			logger.debug("SuccessCase - @Before");
		}
		
		@AfterClass
		static public void teatDownClass() {
			logger.debug("SuccessCase - @AfterClass");
		}
		
		@After
		public void tearDown() {
			logger.debug("SuccessCase - @After");
		}
		
		@Test
		public void testAdd() {
			Calculator sut = new Calculator();
			assertThat(sut.add(1, 1), is(2));
		}

		@Test
		public void testSub() {
			Calculator sut = new Calculator();
			assertThat(sut.sub(1, 1), is(0));
		}

		@Test
		public void testMul() {
			Calculator sut = new Calculator();
			assertThat(sut.mul(1, 1), is(1));
		}

		@Test
		public void testDiv() {
			Calculator sut = new Calculator();
			assertThat(sut.div(1, 1), is(1));
		}
	}
	
	public static class ExceptionCase {
		@Test(expected=IllegalArgumentException.class)
		public void testDiv() {
			Calculator sut = new Calculator();
			sut.div(1, 0);
			fail();
		}
	}
}

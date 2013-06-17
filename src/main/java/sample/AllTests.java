package sample;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	EnclosedTest.class,
	CalculatorTest.class,
	TheoriesTest.class,
	CategoriesTests.class,
	FixMethodOrderTest.class,
	RuleTest.class
})
public class AllTests {
	public static Test suite() {
        return new JUnit4TestAdapter(AllTests.class);
    }
}

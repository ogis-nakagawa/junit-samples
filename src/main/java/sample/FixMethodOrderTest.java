package sample;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.DEFAULT)
//@FixMethodOrder(MethodSorters.JVM)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixMethodOrderTest {

	@Test
	public void testZ() {}

	@Test
	public void test9() {}

	@Test
	public void testA() {}

	@Test
	public void test1() {}
}

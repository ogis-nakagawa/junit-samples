package sample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesTest {
	static class Fixture {
		int n;
		long expected;
		Fixture(int n, long expected) {
			this.n = n;
			this.expected = expected;
		}		
	}

	@DataPoint
	public static Fixture PARAM = new Fixture(10, 55L);

	@DataPoints
	public static Fixture[] PARAMS = {
		new Fixture(1, 1L),
		new Fixture(2, 1L),
		new Fixture(3, 2L),
		new Fixture(4, 3L),
		new Fixture(5, 5L),
		new Fixture(10, 55L)
	};
	
	@Theory
	public void success(Fixture p) throws Exception {
		assertThat(Fibonacci.fib(p.n), is(p.expected));
	}	
}

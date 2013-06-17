package sample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	@Parameters(name="Fibonacci {0} -> {1}.")
	public static Iterable<Object[]> getParameters() {
        return Arrays.asList(new Object[][] {
            { 1, 1L },
            { 2, 1L },
            { 3, 2L },
            { 4, 3L },
            { 5, 5L },
            { 10, 55L }
        });
    }	 

	final int n;
	final long expected;

	public ParameterizedTest(int n, long expected) {
		this.n = n;
		this.expected = expected;
	}
	
	@Test
	public void test() throws Exception {
		assertThat(Fibonacci.fib(n), is(expected));
	}	
}

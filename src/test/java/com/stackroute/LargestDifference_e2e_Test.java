package com.stackroute;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.stackroute.LargestDifference;



@RunWith(Parameterized.class)
public class LargestDifference_e2e_Test {

	private static final String MSG_01 = "The method should return the index of larger number of the two adjacent numbers with largest difference from the input array";

	private PrintStream out;
	private ByteArrayOutputStream myOutStream;
	private InputStream in;
	private ByteArrayInputStream myInputStream;

	private String input;
	private String expected;
	private String message;

	public LargestDifference_e2e_Test(String input, String expected, String message) {
		this.input = input;
		this.expected = expected;
		this.message = message;
	}

	@Before
	public void setUp() {
		in = System.in;
		out = System.out;
		myOutStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOutStream));
	}

	@After
	public void tearDown() {
		System.setIn(in);
		System.setOut(out);
	}

	@Parameters(name = "{index}: Main Method Input ({0}) - Should display ({1})")
	public static Collection<Object[]> data() {
		Collection<Object[]> params = new ArrayList<>();
		params.add(new Object[] { "5 15 9 2 10 6", "3", MSG_01 });
		params.add(new Object[] { "5 2 -1 0 1 2", "0", MSG_01 });
		
		return params;
	}

	@Test
	public void testMaxDigitInString_e2e() {
		myInputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(myInputStream);

		LargestDifference.main(null);
		String actual = myOutStream.toString().replaceAll("\\s+", "");
		assertThat(message, actual, is(expected.replaceAll("\\s+", "")));
	}

}

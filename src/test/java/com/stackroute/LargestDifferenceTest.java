package com.stackroute;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.stackroute.LargestDifference;



@RunWith(Parameterized.class)
public class LargestDifferenceTest {

	private static final String MSG_01 = "The method should return the index of larger number of the two adjacent numbers with largest difference from the input array";
	private static final String MSG_03 = "if two adjacent numbers have the difference which is largest, Then index of larger number of the larger numbers should be returned";

	private int[] input;
	private int expected;
	private String message;

	public LargestDifferenceTest(int[] input, int expected, String message) {
		this.input = input;
		this.expected = expected;
		this.message = message;
	}

	@Parameters(name = "{index}: findLargetDifference({0}) - Should Return ({1})")
	public static Collection<Object[]> data() {
		Collection<Object[]> params = new ArrayList<>();
		params.add(new Object[] { new int[] {15,9,2,10,6}, 3, MSG_01 });
		params.add(new Object[] { new int[] {6,9,2,7,6}, 1, MSG_01 });
		params.add(new Object[] { new int[] {8,5,6,3}, 0, MSG_03 });
		params.add(new Object[] { new int[] {5,2,2,5}, 0, MSG_03 });
		
		return params;
	}

	@Test
	public void testfindLargestDifference() {
		assertThat(message, LargestDifference.findLargestDifference(input), is(expected));
	}
}

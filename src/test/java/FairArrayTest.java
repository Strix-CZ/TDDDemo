import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FairArrayTest
{
	private final Solution solution = new Solution();

	@Test
	void emptyArrayIsFair()
	{
		assertTrue(isFair());
	}

	@Test
	void singleElementArrayIsNotFair()
	{
		assertFalse(isFair(1));
	}

	@Test
	void singleZeroIsFair()
	{
		assertTrue(isFair(0));
	}

	@Test
	void twoElementsIsFairWhenEqual()
	{
		assertTrue(isFair(10, 10));
	}

	@Test
	void twoElementsAreNotFairWhenNotEqual()
	{
		assertFalse((isFair(10, 11)));
	}

	@Test
	void threeElementsAreFairWhenTheOddSumIsEqualEvenSum()
	{
		assertTrue(isFair(4, 10, 6));
	}

	@Test
	void complexTest()
	{
		assertFalse(isFair(0, 0, 0, 0, 0, 1));
		assertTrue(isFair(4, -10, 6, 20));
	}

	private boolean isFair(int... values)
	{
		return solution.isFair(values);
	}
}

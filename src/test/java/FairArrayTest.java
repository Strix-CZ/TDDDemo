import org.junit.jupiter.api.Assertions;
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

	private boolean isFair(int... values)
	{
		return solution.isFair(values);
	}
}

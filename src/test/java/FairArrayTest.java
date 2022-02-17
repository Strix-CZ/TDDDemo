import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FairArrayTest
{
	private final Solution solution = new Solution();

	@Test
	void emptyArrayIsFair()
	{
		Assertions.assertTrue(isFair());
	}

	@Test
	void singleElementArrayIsNotFair()
	{
		Assertions.assertFalse(isFair(1));
	}

	@Test
	void singleZeroIsFair()
	{
		Assertions.assertTrue(isFair(0));
	}

	private boolean isFair(int... values)
	{
		return solution.isFair(values);
	}
}

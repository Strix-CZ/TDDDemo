import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FairArrayTest
{
	private final Solution solution = new Solution();

	@Test
	void emptyArrayIsFair()
	{
		Assertions.assertTrue(solution.isFair(new int[]{ }));
	}

	@Test
	void singleElementArrayIsNotFair()
	{
		Assertions.assertFalse(solution.isFair(new int[] { 1 }));
	}
}

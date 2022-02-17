import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FairArrayTest
{
	@Test
	void emptyArrayIsFair()
	{
		Assertions.assertTrue(Solution.isFair(new int[]{ }));
	}
}

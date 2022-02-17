public class Solution
{
	public boolean isFair(int[] values)
	{
		// Stream.reduce() is not guaranteed to execute sequentially, which we need :(

		int evenMinusOddSum = 0;
		for (int value : values)
			evenMinusOddSum = value - evenMinusOddSum;

		return evenMinusOddSum == 0;
	}
}

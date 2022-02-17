public class Solution
{
	public boolean isFair(int[] values)
	{
		if (values.length == 0)
			return true;
		else if (values.length == 1)
			return values[0] == 0;
		else
			return values[0] == values[1];
	}
}

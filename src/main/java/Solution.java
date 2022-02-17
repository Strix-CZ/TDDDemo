public class Solution
{
	public boolean isFair(int[] values)
	{
		if (values.length == 0)
			return true;
		else
			return values[0] == 0;
	}
}

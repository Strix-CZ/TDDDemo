public class Solution
{
	public boolean isFair(int[] values)
	{
		if (values.length == 0)
			return true;
		else if (values.length == 1)
			return values[0] == 0;
		else if (values.length == 2)
			return values[1] - values[0] == 0;
		else
			return values[2] - (values[1] - values[0]) == 0; // I would just do the next step straight away, this is for demonstration purposes :)
	}
}

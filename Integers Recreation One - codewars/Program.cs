
Console.WriteLine(SumSquaredDivisors.ListSquared(1, 250));

public class SumSquaredDivisors
{
	public static string ListSquared(long m, long n)
	{
		var result = new List<string>();
		for (var i = m; i <= n; i++)
		{
			var sumOfSquaredDivs = SumSquaredDivisors.Divisors(i).Select(d => d * d).Sum();
			if (IsSquared(sumOfSquaredDivs))
			{
				result.Add($"[{i}, {sumOfSquaredDivs}]");
			}
		}

		return "[" + String.Join(", ", result) + "]";
	}

	private static IEnumerable<long> Divisors(long input)
	{
		for (var i = 1; i <= input; i++)
		{
			if (input % i == 0)
			{
				yield return i;
			}
		}
	}

	private static bool IsSquared(long number)
	{
		var sqrt = Math.Sqrt(number);
		return ((int)sqrt * (int)sqrt) == number;
	}
}
import java.util.*;

public class IsArraySquareOfAnother {
	public static boolean comp(int[] a, int[] b) {
		if (a == null || b == null || a.length != b.length)
			return false;
		for (int i = 0; i < a.length; i++)
			if (a[i] < 0)
				a[i] = a[i] * -1;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			if (a[i] == (int) Math.sqrt(b[i])) {
				continue;
			} else
				return false;
		}
		return true;
	}
}
import java.util.Arrays;
public class Stats {
    public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: java Max <numbers>");
			return;
		}
		int count = args.length;
		int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double ave = sum / count;
        for (String a : args){
			int x = Integer.parseInt(a);
			sum += x;
		}
		for (String b : args) {
			int y = Integer.parseInt(b);
			if (y > max) {
				max = y;
			}
		}
		for (String c : args) {
			int z = Integer.parseInt(c);
			if (z < min) {
				min = z;
			}
		}
		System.out.println("Count: " + count);
		System.out.println("Sum: " + sum);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.printf("Average: %.2f\n", ave);
    }
}

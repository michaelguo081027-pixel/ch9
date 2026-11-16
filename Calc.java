import java.util.Arrays;
public class Calc {
    public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
			return;
		}
		int add = 0;
		int mult = 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] n = new String[args.length-1];
        for(int i = 0; i<n.length; i++){
			n[i]=args[i+1];
        }
        for (int a=0; a<n.length; a++){
			int w = Integer.parseInt(n[a]);
			add += w;
		}
		for (int b=0; b<n.length; b++){
			int x = Integer.parseInt(n[b]);
			mult *= x;
		}
		for (int c=0; c<n.length; c++) {
			int y = Integer.parseInt(n[c]);
			if (y > max) {
				max = y;
			}
		}
		for (int d=0; d<n.length; d++) {
			int z = Integer.parseInt(n[d]);
			if (z < min) {
				min = z;
			}
		}
		if(args[0].equals("add"))System.out.println(add);
		else if(args[0].equals("mult"))System.out.println(mult);
		else if(args[0].equals("max"))System.out.println(max);
		else if(args[0].equals("min"))System.out.println(min);
		else{
			System.err.println("Unknown operation: "+args[0]);
			return;
		}
    }
}

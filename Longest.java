import java.util.Arrays;
public class Longest {
    public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: java Longest <Strings>");
			return;
		}
		String longest="";
		String first=args[0];
        for (String i : args){
			if(i.length()>longest.length())longest=i;
		}
		for (String j : args) {
			int diff=j.compareTo(j+1);
			if(diff>0)first=j;
		}
		System.out.println("Longest: " + longest + " (" + 
							longest.length()+" letters)");
		System.out.println("Frst alphabetically: " + first);
    }
}

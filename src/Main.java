import java.util.*;

public class Main {
public static void main (String [] args) {
	LinkedList parameters = new LinkedList<MatchCriteria>();	
	parameters.add(new matchName("Smiruthi"));
	parameters.add(new matchSize(25));
	Directory d = new Directory();
	File output = d.find(parameters);
	if(output != null)
	System.out.println(output.name);	
	
}


}

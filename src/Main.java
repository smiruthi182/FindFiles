import java.util.*;

public class Main {
public static void main (String [] args) {
	LinkedList parameters = new LinkedList<MatchCriteria>();	
	parameters.add(new matchName("Shriram"));
	parameters.add(new matchSize(30));
	LinkedList<File> newFile = new LinkedList<File>();
	File f1 = new File("Smiruthi",25,".jpg");
	File f2 = new File("Shriram",30,".angry");
	newFile.add(f1);
	newFile.add(f2);
	Directory d = new Directory(newFile);
	File output = d.find(parameters);
	if(output != null)
		System.out.println(output.getName());	
	
}


}

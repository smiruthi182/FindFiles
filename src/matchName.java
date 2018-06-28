
public class matchName implements MatchCriteria {
 String name;
	public boolean matcher(File f) {
		// TODO Auto-generated method stub
		String name = f.getName();
		if(this.name == name)
		return true;
		else
		return false;
	}
	public matchName(String name) {
		this.name = name;
	}

}

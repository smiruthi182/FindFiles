
public class matchSize implements MatchCriteria {
int size;

	public boolean matcher(File f) {
		int size = f.getSize();
	    if(this.size == size)
		return true;
		else
		return false;
	}
	public matchSize(int size) {
		this.size = size;
	}

}

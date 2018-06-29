import java.util.LinkedList;
import java.util.List;

public class Directory {
//private Directory d = new Directory[20];
private List<File> f = new LinkedList <File>();
public Directory (LinkedList<File> f) {
	for(int i=0;i<f.size();i++) {
		this.f.add(f.get(i));
	}
}

public File find(LinkedList<MatchCriteria> parameters) {
	boolean flag = false;
	for(int i=0;i<f.size();i++)
	{
		File g = f.get(i);
		for (int j=0;j<parameters.size();j++)
		{
			MatchCriteria value = parameters.get(j);
			if(value.matcher(g) ==  false)
			{
				flag = false; 
				break;
			}
			else flag = true;
		}
		if (flag)
			return g;
	}
	return null;
}
}

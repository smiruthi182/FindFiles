import java.util.LinkedList;
import java.util.List;

public class Directory {
Directory [] d = new Directory[20];
File [] f = new File [20];
public File find(LinkedList<MatchCriteria> parameters) {
	boolean flag = false;
	for(int i=0;i<f.length;i++)
	{
		File g = f[i];
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

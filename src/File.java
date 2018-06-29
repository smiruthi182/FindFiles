
public class File {
	private String name;
	private int size;
	private String ext;
	
	public File (String name,int size, String ext) {
		this.name = name;
		this.size = size;
		this.ext = ext;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}

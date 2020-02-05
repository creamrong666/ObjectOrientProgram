package ObjectOrientProgram;

public class Windows {
	    String name;
	    
	public Windows(String name) {
		this.name = name;
	}
	
	void open() {
		System.out.println(name + "打开");
	}
	
	void close() {
		System.out.println(name + "关上");
	}
}

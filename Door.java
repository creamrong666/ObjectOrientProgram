package ObjectOrientProgram;

public class Door {
	String name;
public Door(String name) {
	this.name = name;
}

void open() {
	System.out.println(name + "打开");
}

void close() {
	System.out.println(name + "关上");
}
}

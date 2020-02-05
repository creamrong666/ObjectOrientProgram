package ObjectOrientProgram;

public class House {
	public House(String name) {
		this.name = name;
		FrontDoor = new Door("前门");
		BackDoor = new Door("后门");
		FrontWindow = new Windows("前窗");
		BackWindow = new Windows("后窗");;
	}
	
	String name;
	
	Door FrontDoor;
	
	Door BackDoor;
	
	Windows FrontWindow;
	
	Windows BackWindow;
	
	
	void walkIn() {
		System.out.println( "进入"+name );
		
		FrontDoor.open();
		FrontWindow.open();
		BackWindow.open();
		BackDoor.open();
	}
	
	void walkOut() {
		System.out.println("走出"+name);
		
		BackWindow.close();
		BackDoor.close();
		FrontWindow.close();
		FrontDoor.close();
	}
	
	public static void main(String[] args) {
		
		House livingRoom= new House("起居室");
		livingRoom.walkIn();
		livingRoom.walkOut();
		
		House kitchen= new House("厨房");
		kitchen.walkIn();
		kitchen.walkOut();
		
		House toilet= new House("卫生间");
		toilet.walkIn();
		toilet.walkOut();
		
		House bedroom= new House("卧室");
		bedroom.walkIn();
		bedroom.walkOut();
		
	}

}


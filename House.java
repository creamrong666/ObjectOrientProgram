package ObjectOrientProgram;

public class House {
	public House(String name) {
		this.name = name;
		FrontDoor = new Door("ǰ��");
		BackDoor = new Door("����");
		FrontWindow = new Windows("ǰ��");
		BackWindow = new Windows("��");;
	}
	
	String name;
	
	Door FrontDoor;
	
	Door BackDoor;
	
	Windows FrontWindow;
	
	Windows BackWindow;
	
	
	void walkIn() {
		System.out.println( "����"+name );
		
		FrontDoor.open();
		FrontWindow.open();
		BackWindow.open();
		BackDoor.open();
	}
	
	void walkOut() {
		System.out.println("�߳�"+name);
		
		BackWindow.close();
		BackDoor.close();
		FrontWindow.close();
		FrontDoor.close();
	}
	
	public static void main(String[] args) {
		
		House livingRoom= new House("�����");
		livingRoom.walkIn();
		livingRoom.walkOut();
		
		House kitchen= new House("����");
		kitchen.walkIn();
		kitchen.walkOut();
		
		House toilet= new House("������");
		toilet.walkIn();
		toilet.walkOut();
		
		House bedroom= new House("����");
		bedroom.walkIn();
		bedroom.walkOut();
		
	}

}


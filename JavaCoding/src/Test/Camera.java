package Test;

public class Camera extends Machine{
	
	@Override
	void start(){
		System.out.println("Camera started");
	}
	void stop(){
		System.out.println("Camera stopped");
	}
	@Override
	void dostuff() {
		System.out.println("Do the stuff");
	}
}

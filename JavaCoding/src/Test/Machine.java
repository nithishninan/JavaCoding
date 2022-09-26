package Test;

public abstract class Machine {

	abstract void start();
	abstract void dostuff();
	abstract void stop();
	void run(){
		start();
		dostuff();
		stop();
	}
}

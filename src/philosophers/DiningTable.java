package philosophers;

import java.util.*;

public class DiningTable {
	
	public static void main(String[] args) throws InterruptedException {
	
		ArrayList<Fork> forksList = Launcher.createForks(5);
		ArrayList<Philosopher> philoList = Launcher.createPhilosophers(forksList);
		for (Thread th : philoList)
			th.start();
		
	}
	
}

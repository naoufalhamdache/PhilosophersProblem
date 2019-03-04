package philosophers;

import java.util.*;

public class Launcher {
	
	static public ArrayList<Fork> createForks (int num) {
		ArrayList<Fork> forksList= new ArrayList<>();
		for (int i = 0; i < num; i++)
			forksList.add(new Fork());
		return forksList;
	}

	
	static public ArrayList<Philosopher> createPhilosophers (ArrayList<Fork> forksList) {
		ArrayList<Philosopher> philosopherList = new ArrayList<>();
		for (int i = 0; i < forksList.size(); i++) {
			int j = i-1;
			if (j == -1) j = forksList.size()-1;
			philosopherList.add(new Philosopher(forksList.get(i), forksList.get(j)));
		}
		return philosopherList;
	}
	
}

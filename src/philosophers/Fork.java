package philosophers;

public class Fork {
	private static int total = 0;
	private long id = total;
	private boolean inuse = false;
	
	public long getId() {
		return id;
	}
	
	public Fork() {
		total++;
	}

	public synchronized void pickme () throws InterruptedException {
		while (inuse) {
			wait();
		}
		
		if (!inuse){
			inuse = true;
		}
	}
	
	public synchronized void putme () {
		//inuse = false;
		notify();
	}

	public boolean isInuse() {
		return inuse;
	}

	public void setInuse(boolean inuse) {
		this.inuse = inuse;
	}
	
}

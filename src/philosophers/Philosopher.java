package philosophers;

public class Philosopher extends Thread {
	private static int total = 0;
	private long id = total;
	private Fork fork1;
	private Fork fork2;

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep((long) (10000*Math.random()));
				
				fork1.pickme();
				System.out.println("Philosopher " + id + " pick Fork " + fork1.getId());

				fork2.pickme();
				System.out.println("Philosopher " + id + " pick Fork " + fork2.getId());
				System.out.println("Philosopher " + id + " is eating...");
				Thread.sleep(3000);
				
				System.out.println("Philosopher " + id + " put Fork " + fork1.getId());
				fork1.putme();
				System.out.println("Philosopher " + id + " put Fork " + fork2.getId());
				fork2.putme();
				System.out.println("Philosopher " + id + " return back thinking...");
			}
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	
	
	
	public Philosopher(Fork fork1, Fork fork2) {
		total++;
		this.fork1 = fork1;
		this.fork2 = fork2;
	}

	
	
	public long getId() {
		return id;
	}
	
	
	public Fork getFork1() {
		return fork1;
	}

	public void setFork1(Fork fork1) {
		this.fork1 = fork1;
	}

	public Fork getFork2() {
		return fork2;
	}

	public void setFork2(Fork fork2) {
		this.fork2 = fork2;
	}
	
}

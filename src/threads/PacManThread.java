package threads;

import model.PacMan;
import ui.PacManGameController;

public class PacManThread {
	private PacMan pacMan;
	private PacManGameController pacManGameController;
	private boolean moving;
	
	public PacManThread() {
		
	}
	public void run() {
		while(moving) {
			pacMan.move(pacManGameController.getWith());
			try {
				sleep(pacMan.getSleepTime());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}

package ejemploPantallas;

import javax.swing.JPanel;

public abstract class View extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1715080735818803646L;

	protected App appController;

	public View(App appControler) {
		this.appController = appControler;
	}
}

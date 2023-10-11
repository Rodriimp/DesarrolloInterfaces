package ej15;

import javax.swing.JPanel;

public abstract class View extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8642167290613960373L;

	protected App appController;

	public View(App appControler) {
		this.appController = appControler;
	}

	
}

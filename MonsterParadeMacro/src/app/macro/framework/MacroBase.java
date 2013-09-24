package app.macro.framework;

import java.awt.Robot;

public abstract class MacroBase {
	
	protected Robot robot;
	protected int item;
	
	public abstract void init(int item);
	public abstract void start();
	public abstract void end();
}

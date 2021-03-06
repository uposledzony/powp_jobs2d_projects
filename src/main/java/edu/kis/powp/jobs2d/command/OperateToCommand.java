package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * Implementation of Job2dDriverCommand for operateTo command functionality.
 */
public class OperateToCommand implements DriverCommand {

	private int posX, posY;

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public OperateToCommand(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	@Override
	public void execute(Job2dDriver driver) {
		driver.operateTo(posX, posY);
	}

	@Override
	public void accept(DriverCommandVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public DriverCommand clone() throws CloneNotSupportedException {
		return (DriverCommand) super.clone();
	}

	public int getX() {
		return posX;
	}

	public int getY() {
		return posY;
	}
}

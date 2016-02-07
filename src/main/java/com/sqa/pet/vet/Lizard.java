/**
 * File Name: Lizard.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 6, 2016
 */
package com.sqa.pet.vet;

/**
 * Lizard //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class Lizard extends Reptile {

	private boolean lostTail;

	private boolean changeColor;

	/**
	 * @return the changeColor
	 */
	public boolean isChangeColor() {
		return this.changeColor;
	}

	/**
	 * @return the lostTail
	 */
	public boolean isLostTail() {
		return this.lostTail;
	}

	/**
	 * @param changeColor
	 *            the changeColor to set
	 */
	public void setChangeColor(boolean changeColor) {
		this.changeColor = changeColor;
	}

	/**
	 * @param lostTail
	 *            the lostTail to set
	 */
	public void setLostTail(boolean lostTail) {
		this.lostTail = lostTail;
	}
}

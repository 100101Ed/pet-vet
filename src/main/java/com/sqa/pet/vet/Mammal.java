/**
 * File Name: Mammal.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 6, 2016
 */
package com.sqa.pet.vet;

/**
 * Mammal //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class Mammal extends Pet {

	private boolean rabiesShot;

	private boolean houseBroken;

	public boolean breastFeed() {
		// TODO implement method
		return true;
	}

	public boolean givenBirth() {
		// TODO implement method
		return true;
	}

	/**
	 * @return the houseBroken
	 */
	public boolean isHouseBroken() {
		return this.houseBroken;
	}

	/**
	 * @return the rabiesShot
	 */
	public boolean isRabiesShot() {
		return this.rabiesShot;
	}

	/**
	 * @param houseBroken
	 *            the houseBroken to set
	 */
	public void setHouseBroken(boolean houseBroken) {
		this.houseBroken = houseBroken;
	}

	/**
	 * @param rabiesShot
	 *            the rabiesShot to set
	 */
	public void setRabiesShot(boolean rabiesShot) {
		this.rabiesShot = rabiesShot;
	}
}

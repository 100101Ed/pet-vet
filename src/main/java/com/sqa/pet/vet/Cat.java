/**
 * File Name: Cat.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 6, 2016
 */
package com.sqa.pet.vet;

/**
 * Cat //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class Cat extends Mammal {

	private boolean killingMice;

	private boolean claws;

	/**
	 * @return the claws
	 */
	public boolean isClaws() {
		return this.claws;
	}

	/**
	 * @return the killingMice
	 */
	public boolean isKillingMice() {
		return this.killingMice;
	}

	/**
	 * @param claws
	 *            the claws to set
	 */
	public void setClaws(boolean claws) {
		this.claws = claws;
	}

	/**
	 * @param killingMice
	 *            the killingMice to set
	 */
	public void setKillingMice(boolean killingMice) {
		this.killingMice = killingMice;
	}
}

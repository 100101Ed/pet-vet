/**
 * File Name: Dog.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 6, 2016
 */
package com.sqa.pet.vet;

/**
 * Dog //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class Dog extends Mammal {

	private boolean performsAtShows;

	private boolean wolfBreed;

	private String servie;

	/**
	 * @return the servie
	 */
	public String getServie() {
		return this.servie;
	}

	/**
	 * @return the performsAtShows
	 */
	public boolean isPerformsAtShows() {
		return this.performsAtShows;
	}

	/**
	 * @return the wolfBreed
	 */
	public boolean isWolfBreed() {
		return this.wolfBreed;
	}

	/**
	 * @param performsAtShows
	 *            the performsAtShows to set
	 */
	public void setPerformsAtShows(boolean performsAtShows) {
		this.performsAtShows = performsAtShows;
	}

	/**
	 * @param servie
	 *            the servie to set
	 */
	public void setServie(String servie) {
		this.servie = servie;
	}

	/**
	 * @param wolfBreed
	 *            the wolfBreed to set
	 */
	public void setWolfBreed(boolean wolfBreed) {
		this.wolfBreed = wolfBreed;
	}
}

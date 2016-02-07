/**
 * File Name: Pet.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 6, 2016
 */
package com.sqa.pet.vet;

/**
 * Pet //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class Pet {

	private boolean alive;

	private String name;

	private boolean injured;

	private boolean male;

	private String breed;

	public boolean checkPet() {
		// TODO checkPet method implement
		return true;
	}

	public boolean doAction() {
		// TODO method implement is needed
		return true;
	}

	public boolean euthanize() {
		// TODO method implement is needed
		return true;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return this.breed;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	public boolean healPet() {
		// TODO method implement is needed
		return true;
	}

	/**
	 * @return the alive
	 */
	public boolean isAlive() {
		return this.alive;
	}

	/**
	 * @return the injured
	 */
	public boolean isInjured() {
		return this.injured;
	}

	/**
	 * @return the male
	 */
	public boolean isMale() {
		return this.male;
	}

	public boolean regPet() {
		// TODO method implement is needed
		return true;
	}

	/**
	 * @param alive
	 *            the alive to set
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	/**
	 * @param breed
	 *            the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @param injured
	 *            the injured to set
	 */
	public void setInjured(boolean injured) {
		this.injured = injured;
	}

	/**
	 * @param male
	 *            the male to set
	 */
	public void setMale(boolean male) {
		this.male = male;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}

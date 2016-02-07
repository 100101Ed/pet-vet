/**
 * File Name: Reptile.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 6, 2016
 */
package com.sqa.pet.vet;

/**
 * Reptile //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class Reptile extends Pet {

	private boolean scales;

	private int heatLevel;

	private boolean poinsonous;

	/**
	 * @return the heatLevel
	 */
	public int getHeatLevel() {
		return this.heatLevel;
	}

	/**
	 * @return the poinsonous
	 */
	public boolean isPoinsonous() {
		return this.poinsonous;
	}

	/**
	 * @return the scales
	 */
	public boolean isScales() {
		return this.scales;
	}

	/**
	 * @param heatLevel
	 *            the heatLevel to set
	 */
	public void setHeatLevel(int heatLevel) {
		this.heatLevel = heatLevel;
	}

	/**
	 * @param poinsonous
	 *            the poinsonous to set
	 */
	public void setPoinsonous(boolean poinsonous) {
		this.poinsonous = poinsonous;
	}

	/**
	 * @param scales
	 *            the scales to set
	 */
	public void setScales(boolean scales) {
		this.scales = scales;
	}
}

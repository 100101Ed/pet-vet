/**
 * File Name: PetTest.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 6, 2016
 */
package com.sqa.em.pet;

import org.junit.Test;

import com.sqa.pet.vet.Mammal;
import com.sqa.pet.vet.Pet;

/**
 * PetTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class PetTest {

	@Test
	public void test() {
		Pet[] pets = new Pet[] { new Pet() };
		for (int i = 0; i < pets.length; i++) {
			System.out.println("My Pet " + i + ": " + pets[i]);
		}
		// Object[] pets = new Object[] { new Pet[] { new Pet(), new Pet() },
		// new Pet(), new Mammal(), new Pet() };
		// System.out.println("My Pet:" + Arrays.toString((pets)));
		Pet pet1 = new Pet();
		System.out.println("My pet: " + pet1.getClass().getSimpleName());
		Pet petm = new Mammal();
		System.out.println("My petn: " + petm.getClass().getSimpleName());
	}
}

/**
 *   File Name: ShapeTest.java<br>
 *
 *   Antonyan, Anna<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Feb 1, 2016
 *   
 */

package com.sqa.aa.shape.project;

import org.junit.Test;

/**
 * ShapeTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class ShapeTest {

	@Test
	public void test() {
		Shape myShape1 = new Shape();
		Shape myShape2 = new Shape("Hardcoded Shape", "Square", "Blue");
		System.out.println("My Shape 1: " + myShape1);
		System.out.print("My Shape 2: " + myShape2);

	}

}

package businessObjects.SolveBusinessObjects;

import businessObjects.CalculatorBusinessObject;

public class SolveAdditionBO{
	
/**
 * Performs an addition
 * @param calcBO
 * @param a
 * @param b
 */
	public void additionResult(CalculatorBusinessObject calcBO, double a, double b){

		calcBO.setFirstResult(a + b);
		calcBO.setTextFieldContents(Double.toString(calcBO.getFirstResult()));
		System.out.println("the answer is: " + (calcBO.getFirstResult()));

	}


}
package businessObjects.SolveBusinessObjects;

import businessObjects.CalculatorBusinessObject;

public class SolvePowerBO {

	public void powerResult(CalculatorBusinessObject calcBO, double a, double b) {
		calcBO.setFirstResult(Math.pow(a, b));
		calcBO.setTextFieldContents(Double.toString(calcBO.getFirstResult()));
		System.out.println("the answer is: " + (calcBO.getFirstResult()));
		
	}

}

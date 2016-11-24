package businessObjects.SolveBusinessObjects;

import businessObjects.CalculatorBusinessObject;

public class SolveSqRtBO {

	public void sqrtResult(CalculatorBusinessObject calcBO, double a) {
		if (a >= 0){
			calcBO.setFirstResult(Math.sqrt(a));
			calcBO.setTextFieldContents(Double.toString(calcBO.getFirstResult()));
			System.out.println("The answer is: " + (calcBO.getFirstResult()));
		}else {
			calcBO.setFirstResult(Math.sqrt(a));
			calcBO.setTextFieldContents(Double.toString(calcBO.getFirstResult())+"i");
			// calcBO.setTextFieldContents("don't try to use imaginary numbers");
			System.out.println("The answer is: " + (calcBO.getFirstResult())+"i");
		}
		
	}

}

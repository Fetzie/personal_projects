package businessObjects.SolveBusinessObjects;

import businessObjects.CalculatorBusinessObject;

public class SolveMultiplyBO{
	

	public void multiplicationResult(CalculatorBusinessObject calcBO, double a, double b){
			
			calcBO.setFirstResult(a * b);
			calcBO.setTextFieldContents(Double.toString(calcBO.getFirstResult()));
			System.out.println("the answer is: " + (calcBO.getFirstResult()));

	}


}



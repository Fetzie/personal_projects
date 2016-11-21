package businessObjects.SolveBusinessObjects;

import businessObjects.CalculatorBusinessObject;



public class SolveSubtractionBO{
	

	public void subtractionResult(CalculatorBusinessObject calcBO, double a, double b){
			
			calcBO.setFirstResult(a - b);
			calcBO.setTextFieldContents(Double.toString(calcBO.getFirstResult()));
			System.out.println("the answer is: " + (calcBO.getFirstResult()));

	}


}



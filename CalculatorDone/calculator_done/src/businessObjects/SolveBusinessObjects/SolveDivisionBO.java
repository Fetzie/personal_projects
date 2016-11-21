package businessObjects.SolveBusinessObjects;

import businessObjects.CalculatorBusinessObject;

public class SolveDivisionBO {

	public void divisionResult(CalculatorBusinessObject calcBO, double a, double b) {
		if (b != 0){
			calcBO.setFirstResult(a / b);
			calcBO.setTextFieldContents(Double.toString(calcBO.getFirstResult()));
			System.out.println("the answer is: " + (calcBO.getFirstResult()));
			}else{ 
				calcBO.setTextFieldContents("you can't divide by zero");
				System.out.println("you can't divide by zero");
		
	}

}
}

package businessObjects.SolveBusinessObjects;

import businessObjects.CalculatorBusinessObject;



public class SolveQuadraticsBO{

	public void SolveQuadratic(CalculatorBusinessObject calcBO, double a, double b, double c ){
		
		calcBO.setFirstResult( (b*(-1) + Math.sqrt( ( (Math.pow(b, 2)) - (4 * a * c) ) ) ) / (2 * a) );
		System.out.println("the upper zero value is: " + calcBO.getFirstResult()+"\n");
		// if square root bit is zero, we only have one zero point (touches the x axis but doesn't cross it) so don't do the second one: 
		if (Math.sqrt ( (Math.pow(b, 2)) - (4 * a * c) ) != 0)
		{
			calcBO.setSecondResult( (b*(-1) - Math.sqrt( ( (Math.pow(b, 2)) - (4 * a * c) ) ) ) / (2 * a) );
			System.out.println("the lower zero value is: " + calcBO.getSecondResult());
			
		}
		



	}
	
	
}

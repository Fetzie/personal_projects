package businessObjects.SolveBusinessObjects;


import businessObjects.CalculatorBusinessObject;

public class SolveNumberRootBO {
	public void numberRoot(CalculatorBusinessObject calcBO, double a, double b){
		if (a >= 0){
			calcBO.setFirstResult(Math.pow(Math.exp (1/b),Math.log(a)));
			calcBO.setTextFieldContents(Double.toString(calcBO.getFirstResult()));
			if (b == 1){
				System.out.println("The "+b+"st root of "+a+" is "+calcBO.getFirstResult());
			}else if (b == 2){
				System.out.println("The square root of "+a+" is "+calcBO.getFirstResult());				
			}else if (b == 3){
				System.out.println("The "+b+"rd root of "+a+" is "+calcBO.getFirstResult());
			}else{
			System.out.println("The "+b+"th root of "+a+" is "+calcBO.getFirstResult());
			}
			
		}else{
			calcBO.setTextFieldContents("don't try to use imaginary numbers");
			System.out.println("cannot calculate imaginary numbers!");
		}
		
	}
	
}

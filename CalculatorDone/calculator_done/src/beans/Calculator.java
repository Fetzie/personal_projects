package beans;


import businessObjects.CalculatorBusinessObject;
import businessObjects.SolveBusinessObjects.SolveAdditionBO;
import businessObjects.SolveBusinessObjects.SolveDivisionBO;
import businessObjects.SolveBusinessObjects.SolveMultiplyBO;
import businessObjects.SolveBusinessObjects.SolveNumberRootBO;
import businessObjects.SolveBusinessObjects.SolvePowerBO;
import businessObjects.SolveBusinessObjects.SolveQuadraticsBO;
import businessObjects.SolveBusinessObjects.SolveSqRtBO;
import businessObjects.SolveBusinessObjects.SolveSubtractionBO;



/**
 * 
 * @author Tom
 *
 */
public class Calculator{
	
	// instantiate business objects
	private final SolveSubtractionBO subBO = new SolveSubtractionBO();
	private final SolveQuadraticsBO quad = new SolveQuadraticsBO();
	private final SolveMultiplyBO multiBO = new SolveMultiplyBO();
	private final SolveAdditionBO addBO = new SolveAdditionBO();
	private final SolveDivisionBO divBO = new SolveDivisionBO();
	private final SolvePowerBO powBO = new SolvePowerBO();
	private final SolveSqRtBO sqrtBO = new SolveSqRtBO();
	private final SolveNumberRootBO nrootBO = new SolveNumberRootBO();
	
	// start a calculator
	
	
/**
 * 
 * 
 * 
 * @param calcBO
 */
	public void calculate(CalculatorBusinessObject calcBO){
		
/*		
 * 		THIS IS THE CODE FOR THE COMMAND LINE ENTRY, NOT NEEDED
 * 			FOR DOING IT WITH A GUI BUT I LEFT IT IN ANYWAY 
 * 
 * 		System.out.println("Enter the first Operand");
		double operandOne = readOperands.nextDouble();
		calc.setOperandOne(operandOne);
		
		System.out.println("enter the operator");
		System.out.println("+ for addition");
		System.out.println("- for subtraction");
		System.out.println("x for multiplication");
		System.out.println("/ for division");
		System.out.println("^ for power");
		System.out.println("sqrt for square root");
		System.out.println("nrt for solving the nth root");
		System.out.println("quadSolve for solving a quadratic equation");

		this.operator = readOperator.next();
		calc.setOperator(operator);
		
		// this bit isn't particularly elegant, sorry
		if (this.operator.equals("sqrt")){
			System.out.println("skipping second operand because square root");
		}else{
			if (this.operator.equals("nrt")){
			System.out.println("enter the root required");
			double operandTwo = readOperands.nextDouble();
			calc.setOperandTwo(operandTwo);}
				else if (this.operator.equals("quadSolve")){
				System.out.println("Enter the second Operand");
				double operandTwo = readOperands.nextDouble();
				calc.setOperandTwo(operandTwo);
				System.out.println("Enter the third Operand");
				double operandThree = readOperands.nextDouble();
				calc.setOperandThree(operandThree);
			}
			else{
				System.out.println("Enter the second Operand");
				double operandTwo = readOperands.nextDouble();
				calc.setOperandTwo(operandTwo);
			}
	
		
		
	}*/
		
	
		// do maths!
	switch (calcBO.getOperator()) {
		case "+":
			addBO.additionResult(calcBO, calcBO.getOperandOne(), calcBO.getOperandTwo());
			break;
		case "-":
			subBO.subtractionResult(calcBO, calcBO.getOperandOne(), calcBO.getOperandTwo());
			break;
		case "x":
			multiBO.multiplicationResult(calcBO, calcBO.getOperandOne(), calcBO.getOperandTwo());
			break;
		case "/":
			divBO.divisionResult(calcBO, calcBO.getOperandOne(), calcBO.getOperandTwo());
			break;
		case "^":
			powBO.powerResult(calcBO, calcBO.getOperandOne(), calcBO.getOperandTwo());
			break;
		case "sqrt":
			sqrtBO.sqrtResult(calcBO, calcBO.getOperandOne());
			break;
		case "quadSolve":
			quad.SolveQuadratic(calcBO, calcBO.getOperandOne(), calcBO.getOperandTwo(), calcBO.getOperandThree());
			break;
		case "nrt":
			nrootBO.numberRoot(calcBO, calcBO.getOperandOne(), calcBO.getOperandTwo());
			break;
			
	}
	/*
	 * These are not needed because i don't use scanners in the GUI version
	 * // close scanners to tidy up
	 * readOperands.close();
	 * readOperator.close();
	*/

	
	
	
	}


	
}



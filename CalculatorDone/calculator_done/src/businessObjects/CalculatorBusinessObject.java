package businessObjects;



public class CalculatorBusinessObject{

	private double operandOne;
	private double operandTwo;
	private String operator;
	private double operandThree;
	private double firstResult;
	private double secondResult;
	private double thirdResult;
	private String textFieldContents = "0";
	private String ax2TextFieldContents = "0";
	private String bxTextFieldContents = "0";
	private String cTextFieldContents = "0";
 

	public String getAx2TextFieldContents() {
		return ax2TextFieldContents;
	}


	public void setAx2TextFieldContents(String ax2TextFieldContents) {
		this.ax2TextFieldContents = ax2TextFieldContents;
	}


	public String getBxTextFieldContents() {
		return bxTextFieldContents;
	}



	public void setBxTextFieldContents(String bxTextFieldContents) {
		this.bxTextFieldContents = bxTextFieldContents;
	}


	public String getcTextFieldContents() {
		return cTextFieldContents;
	}


	public void setcTextFieldContents(String cTextFieldContents) {
		this.cTextFieldContents = cTextFieldContents;
	}


	public String getTextFieldContents() {
		return textFieldContents;
	}


	public void setTextFieldContents(String textFieldContents) {
		this.textFieldContents = textFieldContents;
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public double getOperandThree() {
		return operandThree;
	}

	public void setOperandThree(double operandThree) {
		this.operandThree = operandThree;	
	}
	
	public String getOperator() {
		return operator;
	}
	
	public void setOperator(String operator2) {
		this.operator = operator2;
	}
	

	public double getFirstResult() {
		return firstResult;
	}


	public void setFirstResult(double firstResult) {
		this.firstResult = firstResult;
	}


	public double getSecondResult() {
		return secondResult;
	}


	public void setSecondResult(double secondResult) {
		this.secondResult = secondResult;
	}


	public double getThirdResult() {
		return thirdResult;
	}


	public void setThirdResult(double thirdResult) {
		this.thirdResult = thirdResult;
	}

	
	
	
}

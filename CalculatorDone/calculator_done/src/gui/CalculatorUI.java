package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import beans.Calculator;
import businessObjects.CalculatorBusinessObject;

public class CalculatorUI extends CalculatorBusinessObject implements ActionListener {

	protected CalculatorBusinessObject calcBO = new CalculatorBusinessObject();
	
	private JTextArea resultTextArea;
	private JPanel basePanel;
	private String textFieldContents = calcBO.getTextFieldContents();
	private String labelContents = "";
	private String entryTrackerTemp = "";
	private String entryTrackerTemp2 = "";

	private JButton numberButton1;
	private JButton numberButton2;
	private JButton numberButton3;
	private JButton numberButton4;
	private JButton numberButton5;
	private JButton numberButton6;
	private JButton numberButton7;
	private JButton numberButton8;
	private JButton numberButton9;
	private JButton decimalButton;
	private JButton plusMinusButton;
	private JLabel ax2Label;
	private JLabel bxLabel;
	private JLabel cLabel;
	private JTextField ax2TextField;
	private JTextField bxTextField;
	private JTextField cTextField;
	private JLabel entryTrackerLabel;
	private JLabel entryTrackerLabelDescriptor;

	

	public CalculatorUI() {
		
		entryTrackerLabelDescriptor = new JLabel("Calculation performed: ");
		entryTrackerLabelDescriptor.setBounds(20, 20, 140, 20);
		entryTrackerLabel = new JLabel("");
		entryTrackerLabel.setBounds(160, 20, 340, 20);
		
		// text field for displaying the numbers entered and the result
		resultTextArea = new JTextArea();
		resultTextArea.setBounds(20, 50, 340, 40);
		resultTextArea.setBackground(Color.WHITE);
		resultTextArea.setEnabled(true);
		resultTextArea.setEditable(false);
		resultTextArea.setSelectedTextColor(Color.BLACK);

		numberButton1 = new JButton("1");
		numberButton1.setText("1");
		numberButton1.setBounds(20, 100, 50, 50);
		numberButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (calcBO.getTextFieldContents().equals("0")) {
					textFieldContents = "1";
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(textFieldContents);
					calcBO.setTextFieldContents(resultTextArea.getText());
				} else {
					textFieldContents = (calcBO.getTextFieldContents() + "1");
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+"1");
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		});
		numberButton2 = new JButton("2");
		numberButton2.setBounds(70, 100, 50, 50);
		numberButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (calcBO.getTextFieldContents().equals("0")) {
					textFieldContents = "2";
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(textFieldContents);
					calcBO.setTextFieldContents(resultTextArea.getText());
				} else {
					textFieldContents = (calcBO.getTextFieldContents() + "2");
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+"2");
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		});
		numberButton3 = new JButton("3");
		numberButton3.setBounds(120, 100, 50, 50);
		numberButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (calcBO.getTextFieldContents().equals("0")) {
					textFieldContents = "3";
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(textFieldContents);
					calcBO.setTextFieldContents(resultTextArea.getText());
				} else {
					textFieldContents = (calcBO.getTextFieldContents() + "3");
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+"3");
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		});
		numberButton4 = new JButton("4");
		numberButton4.setBounds(20, 150, 50, 50);
		numberButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (calcBO.getTextFieldContents().equals("0")) {
					textFieldContents = "4";
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(textFieldContents);
					calcBO.setTextFieldContents(resultTextArea.getText());
				} else {
					textFieldContents = (calcBO.getTextFieldContents() + "4");
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+"4");
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		});
		numberButton5 = new JButton("5");
		numberButton5.setBounds(70, 150, 50, 50);
		numberButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (calcBO.getTextFieldContents().equals("0")) {
					textFieldContents = "5";
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(textFieldContents);
					calcBO.setTextFieldContents(resultTextArea.getText());
				} else {
					textFieldContents = (calcBO.getTextFieldContents() + "5");
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+"5");
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		});
		numberButton6 = new JButton("6");
		numberButton6.setBounds(120, 150, 50, 50);
		numberButton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (calcBO.getTextFieldContents().equals("0")) {
					textFieldContents = "6";
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(textFieldContents);
					calcBO.setTextFieldContents(resultTextArea.getText());
				} else {
					textFieldContents = (calcBO.getTextFieldContents() + "6");
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+"6");
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		});
		numberButton7 = new JButton("7");
		numberButton7.setBounds(20, 200, 50, 50);
		numberButton7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (calcBO.getTextFieldContents().equals("0")) {
					textFieldContents = "7";
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(textFieldContents);
					calcBO.setTextFieldContents(resultTextArea.getText());
				} else {
					textFieldContents = (calcBO.getTextFieldContents() + "7");
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+"7");
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		});
		numberButton8 = new JButton("8");
		numberButton8.setBounds(70, 200, 50, 50);
		numberButton8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (calcBO.getTextFieldContents().equals("0")) {
					textFieldContents = "8";
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(textFieldContents);
					calcBO.setTextFieldContents(resultTextArea.getText());
				} else {
					textFieldContents = (calcBO.getTextFieldContents() + "8");
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+"8");
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		});
		numberButton9 = new JButton("9");
		numberButton9.setBounds(120, 200, 50, 50);
		numberButton9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (calcBO.getTextFieldContents().equals("0")) {
					textFieldContents = "9";
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(textFieldContents);
					calcBO.setTextFieldContents(resultTextArea.getText());
				} else {
					textFieldContents = (calcBO.getTextFieldContents() + "9");
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+"9");
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		});

		
		JButton equalsButton = new JButton("=");
		equalsButton.setBounds(180, 200, 50, 50);
		equalsButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcBO.setOperandTwo(Double.parseDouble(calcBO.getTextFieldContents()));
				Calculator calculator = new Calculator();
				calculator.calculate(calcBO);
				textFieldContents = calcBO.getTextFieldContents(); // TODO
				// calcBO.setTextFieldContents(textFieldContents);
				resultTextArea.setText(textFieldContents);

			}
		});
		JButton cancelButton = new JButton("C");
		cancelButton.setBounds(180, 100, 50, 50);
		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcBO.setOperandOne(0);
				calcBO.setOperandTwo(0);
				calcBO.setOperandThree(0);
				calcBO.setOperator("0");
				textFieldContents = "0";
				calcBO.setTextFieldContents("0");
				resultTextArea.setText(textFieldContents);
				entryTrackerLabel.setText(textFieldContents);

			}
		});
		JButton zeroButton = new JButton("0");

		zeroButton.setBounds(70, 250, 50, 50);
		zeroButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (calcBO.getTextFieldContents().equals("")) {
					textFieldContents = "0";
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(textFieldContents);
					calcBO.setTextFieldContents(resultTextArea.getText());
				} else {
					textFieldContents = (calcBO.getTextFieldContents() + "0");
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+"0");
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		});


		decimalButton = new JButton(".");
		decimalButton.setBounds(180, 250, 50, 50);
		decimalButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// if the user presses the decimal button before typing anything, default to "0.xxxx"
				if (calcBO.getTextFieldContents().equals("")) {
					textFieldContents = "0.";
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(textFieldContents);
					calcBO.setTextFieldContents(resultTextArea.getText());
				}else if (textFieldContents.contains(".")) {
					; // i want the button to do nothing if a decimal point already exists!
				}else {
					// if there is already something in there, add a decimal point
					textFieldContents = (calcBO.getTextFieldContents() + ".");
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+".");
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		});

		// TODO: ASK DIRK HOW TO DO THIS PROPERLY
		plusMinusButton = new JButton("+/-");
		plusMinusButton.setBounds(180, 150, 50, 50);
		plusMinusButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (textFieldContents.contains("-")) {
					textFieldContents.replaceFirst("-", ""); // if the box contains a - symbol, remove it to make it positive
					entryTrackerLabel.setText(calcBO.getTextFieldContents());
				}else {
					// otherwise make the number negative
					textFieldContents = ("-"+calcBO.getTextFieldContents());
					resultTextArea.setText(textFieldContents);
					entryTrackerLabel.setText(entryTrackerLabel.getText()+calcBO.getTextFieldContents());
				}
				if (!calcBO.getOperator().equals("") && (!calcBO.getOperator().equals("sqrt") || !calcBO.getOperator().equals("nrt"))){
					int operatorIndex = entryTrackerLabel.getText().indexOf(calcBO.getOperator());
					int indexAfterSimpleOperator = operatorIndex + 1;
					int indexBeforeSimpleOperator = operatorIndex - 1;
					if (entryTrackerLabel.getText().substring(operatorIndex, indexAfterSimpleOperator).equals("-")){
						entryTrackerTemp = entryTrackerLabel.getText().substring(indexBeforeSimpleOperator);
						entryTrackerTemp2 = entryTrackerLabel.getText().substring(indexAfterSimpleOperator); 
						entryTrackerLabel.setText(entryTrackerTemp+"-"+entryTrackerTemp2);
				}
					
					
					
					
					
					
					
/*					if(!entryTrackerLabel.getText().substring(0, 1).equals("-")){
						entryTrackerLabel.setText("-"+entryTrackerLabel.getText());
					}else {
						int firstIndex = entryTrackerLabel.getText().indexOf("-");
						int secondIndex = entryTrackerLabel.getText().indexOf("-", firstIndex + 1);
						String makeSecondNumberNegativeString = entryTrackerLabel.getText();
						
						entryTrackerLabel.setText(entryTrackerLabel.getText().concat(calcBO.getTextFieldContents()));
					}*/
					
					calcBO.setTextFieldContents(resultTextArea.getText());
				}
			}
		}
		);


		// group primary function buttons
		JButton functionButtonAddition = new JButton("+");
		functionButtonAddition.setBounds(240, 100, 50, 50);
		functionButtonAddition.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcBO.setOperandOne(Double.parseDouble(calcBO.getTextFieldContents()));
				calcBO.setOperator("+");
				resultTextArea.setText("");
				entryTrackerLabel.setText(entryTrackerLabel.getText()+"+");
				calcBO.setTextFieldContents(resultTextArea.getText());

			}
		});

		JButton functionButtonSubtraction = new JButton(" -");
		functionButtonSubtraction.setBounds(240, 150, 50, 50);
		functionButtonSubtraction.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcBO.setOperandOne(Double.parseDouble(calcBO.getTextFieldContents()));
				calcBO.setOperator("-");
				resultTextArea.setText("");
				entryTrackerLabel.setText(entryTrackerLabel.getText()+"-");
				calcBO.setTextFieldContents(resultTextArea.getText());

			}
		});

		JButton functionButtonMultiplication = new JButton("x");
		functionButtonMultiplication.setBounds(240, 200, 50, 50);
		functionButtonMultiplication.putClientProperty("JComponent.sizeVariant", "large");
		functionButtonMultiplication.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcBO.setOperandOne(Double.parseDouble(calcBO.getTextFieldContents()));
				calcBO.setOperator("x");
				resultTextArea.setText("");
				entryTrackerLabel.setText(entryTrackerLabel.getText()+"x");
				calcBO.setTextFieldContents(resultTextArea.getText());

			}
		});

		JButton functionButtonDivision = new JButton(" /");
		functionButtonDivision.setBounds(240, 250, 50, 50);
		functionButtonDivision.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcBO.setOperandOne(Double.parseDouble(calcBO.getTextFieldContents()));
				calcBO.setOperator("/");
				resultTextArea.setText("");
				entryTrackerLabel.setText(entryTrackerLabel.getText()+"/");
				calcBO.setTextFieldContents(resultTextArea.getText());

			}
		});



		// group secondary function buttons
		JButton functionButtonPower = new JButton("x^y");
		functionButtonPower.setBounds(290, 100, 70, 50);
		functionButtonPower.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcBO.setOperandOne(Double.parseDouble(calcBO.getTextFieldContents()));
				calcBO.setOperator("^");
				resultTextArea.setText("");
				entryTrackerLabel.setText(entryTrackerLabel.getText()+"^");
				calcBO.setTextFieldContents(resultTextArea.getText());

			}
		});

		JButton functionButtonSqRoot = new JButton("√x");
		functionButtonSqRoot.setBounds(290, 150, 70, 50);
		functionButtonSqRoot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcBO.setOperandOne(Double.parseDouble(calcBO.getTextFieldContents()));
				calcBO.setOperator("sqrt");
				entryTrackerLabel.setText("√"+entryTrackerLabel.getText());
				Calculator calculator = new Calculator();
				calculator.calculate(calcBO);
				// TODO if stuff then give error imaginary numbers
				resultTextArea.setText(calcBO.getTextFieldContents());
				//calcBO.setTextFieldContents(resultTextField.getText());

			}
		});

		JButton functionButtonNthRoot = new JButton("n√x");
		functionButtonNthRoot.setBounds(290, 200, 70, 50);
		functionButtonNthRoot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcBO.setOperandOne(Double.parseDouble(calcBO.getTextFieldContents()));
				calcBO.setOperator("nrt");
				resultTextArea.setText("");
				entryTrackerLabel.setText(entryTrackerLabel.getText()+"√");
				calcBO.setTextFieldContents(resultTextArea.getText());
				// TODO handle imaginary numbers

			}
		});
		
		ax2Label = new JLabel("a =");
		ax2Label.setBounds(20, 345, 20, 20);
		bxLabel = new JLabel("b =");
		bxLabel.setBounds(100, 345, 20, 20);
		cLabel = new JLabel("c =");
		cLabel.setBounds(180, 345, 20, 20);
		ax2TextField = new JTextField("0");
		ax2TextField.setEnabled(true);
		ax2TextField.setBounds(40, 345, 40, 20);
		bxTextField = new JTextField("0");
		bxTextField.setEnabled(true);
		bxTextField.setBounds(120, 345, 40, 20);
		cTextField = new JTextField("0");
		cTextField.setEnabled(true);
		cTextField.setBounds(200, 345, 40, 20);
		
		JLabel labelExplainQuadSolvePart1 = new JLabel();
		labelExplainQuadSolvePart1.setText("To solve a quadratic equation, enter the \"a\", \"b\" and \"c\" ");
		labelExplainQuadSolvePart1.setBounds(20, 300, 350, 20);
		
		JLabel labelExplainQuadSolvePart2 = new JLabel();
		labelExplainQuadSolvePart2.setText("values in the boxes provided and then press the \"sQ\" button");
		labelExplainQuadSolvePart2.setBounds(20, 320, 350, 20);
		
		
		JButton functionButtonQuadSolve = new JButton("sQ");
		functionButtonQuadSolve.setBounds(290, 250, 70, 50);
		functionButtonQuadSolve.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcBO.setAx2TextFieldContents(ax2TextField.getText());
				calcBO.setOperandOne(Double.parseDouble(ax2TextField.getText()));
				calcBO.setOperandTwo(Double.parseDouble(bxTextField.getText()));
				calcBO.setOperandThree(Double.parseDouble(cTextField.getText()));
				calcBO.setOperator("quadSolve");
				if(!bxTextField.getText().substring(0, 1).equals("-") && !cTextField.getText().substring(0, 1).equals("-")){
					entryTrackerLabel.setText("Solving: "+ax2TextField.getText()+"x² +"+bxTextField.getText()+"x +"+cTextField.getText());
				}else if(bxTextField.getText().substring(0, 1).equals("-") && !cTextField.getText().substring(0, 1).equals("-")){
					entryTrackerLabel.setText("Solving: "+ax2TextField.getText()+"x² "+bxTextField.getText()+"x +"+cTextField.getText());
				}else if(!bxTextField.getText().substring(0, 1).equals("-") && cTextField.getText().substring(0, 1).equals("-")){
					entryTrackerLabel.setText("Solving: "+ax2TextField.getText()+"x² +"+bxTextField.getText()+"x "+cTextField.getText());
				}else if(bxTextField.getText().substring(0, 1).equals("-") && cTextField.getText().substring(0, 1).equals("-")){
					entryTrackerLabel.setText("Solving: "+ax2TextField.getText()+"x² "+bxTextField.getText()+"x "+cTextField.getText());
				}
				
				Calculator calculator = new Calculator();
				calculator.calculate(calcBO);
				if(calcBO.getFirstResult() != 0){
					resultTextArea.setText("Lower Zero: "+Double.toString(calcBO.getSecondResult())+"\n"+"Upper Zero: "+Double.toString(calcBO.getFirstResult()));
				}else{
					resultTextArea.setText("Only one zero: "+Double.toString(calcBO.getFirstResult()));
				}
			}
		});



		// add elements to panel
		basePanel = new JPanel();
		basePanel.setLayout(null);
		basePanel.setSize(360, 400);
		basePanel.add(entryTrackerLabelDescriptor);
		basePanel.add(entryTrackerLabel);
		basePanel.add(resultTextArea);
		basePanel.add(numberButton1);
		basePanel.add(numberButton2);
		basePanel.add(numberButton3);
		basePanel.add(numberButton4);
		basePanel.add(numberButton5);
		basePanel.add(numberButton6);
		basePanel.add(numberButton7);
		basePanel.add(numberButton8);
		basePanel.add(numberButton9);
		basePanel.add(functionButtonPower);
		basePanel.add(functionButtonSqRoot);
		basePanel.add(functionButtonNthRoot);
		basePanel.add(functionButtonQuadSolve);
		basePanel.add(ax2Label);
		basePanel.add(ax2TextField);
		basePanel.add(bxLabel);
		basePanel.add(bxTextField);
		basePanel.add(cLabel);
		basePanel.add(cTextField);
		basePanel.add(functionButtonAddition);
		basePanel.add(functionButtonSubtraction);
		basePanel.add(functionButtonMultiplication);
		basePanel.add(functionButtonDivision);
		basePanel.add(zeroButton);
		basePanel.add(decimalButton);
		basePanel.add(cancelButton);
		basePanel.add(equalsButton);
		basePanel.add(plusMinusButton);
		basePanel.add(labelExplainQuadSolvePart1);
		basePanel.add(labelExplainQuadSolvePart2);


	}

	public void CalculatorFrame(String title) {
		JFrame calculatorFrame = new JFrame();
		SwingUtilities.updateComponentTreeUI(calculatorFrame);
		calculatorFrame.setSize(390, 410);
		calculatorFrame.setAlwaysOnTop(true);
		calculatorFrame.setEnabled(true);
		calculatorFrame.setTitle(title);
		calculatorFrame.setVisible(true);
		calculatorFrame.setResizable(false);
		calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// add the panels to the frame
		calculatorFrame.add(basePanel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	
//	Declare
	private JButton But1,But2,But3,But4,But5,But6,But7,But8,But9,But0,ButPlus,ButMin,ButMulti,ButDiv,ButRep,ButSqrt,ButCom,ButDel,ButReset,ButEqu;
	JTextField TFCalc;
	JPanel P1,P2;
	
	String [] Temp = new String[10];
	int c = 0;
	double Answer = 0;
	String PrintAnswer;
	
	int AfterEqual = 0;
	int SymbolMark = 0;
	double AnswerHalf = 0;
	int AfterAnswer = 0;
	
	double Ans;
	double ButtonVal;
	String Symbol;
	String Text;
	
	public void TempNum(String Num) {
		
		Temp[c] = Num;
		System.out.println("temp[c]" + Temp[c]);
		String tmp = Temp[0];
		System.out.println("tmp" + tmp);
		for(int n=1; n<=c ;n++) {
			tmp = tmp + Temp[n];
		}
		System.out.println("after loop tmp" + tmp);
		TFCalc.setText(tmp);
		AfterEqual = 0;
		c = c + 1;
	}
	
	
	public void Calculation1(String S) {
		if(AfterEqual == 1) {
			AnswerHalf = AnswerHalf;
		}else {
			String ButtonNo = Temp[0];
			for(int n = 1 ; n < c ; n++) {
				ButtonNo = ButtonNo + Temp[n];
			}
			
			ButtonVal = Double.parseDouble(ButtonNo);
			if(SymbolMark>0) {
				if(Symbol.equals("+")){
					System.out.println("before" + AnswerHalf + "and" + ButtonVal);
					AnswerHalf = AnswerHalf + ButtonVal;
					System.out.println(AnswerHalf);
				}else if(Symbol.equals("-")) {
					System.out.println("before" + AnswerHalf + "and" + ButtonVal);
					AnswerHalf = AnswerHalf - ButtonVal;
					System.out.println(AnswerHalf);
				}else if(Symbol.equals("*")) {
					System.out.println("before" + AnswerHalf + "and" + ButtonVal);
					AnswerHalf = AnswerHalf * ButtonVal;
					System.out.println(AnswerHalf);
				}else if(Symbol.equals("/")) {
					System.out.println("before" + AnswerHalf + "and" + ButtonVal);
					AnswerHalf = AnswerHalf / ButtonVal;
					System.out.println(AnswerHalf);
				}else if(Symbol.equals("sqrt")){
					
				}
			}else{
				System.out.println("before" + AnswerHalf + "and" + ButtonVal);
				AnswerHalf = ButtonVal;
				System.out.println(AnswerHalf);
			}
			
		}
		SymbolMark++;
		Symbol = S;
		c =0;
	}
	
	public void Calculation2() {
		if(AfterAnswer == 0) {
			String ButtonNo = Temp[0];
			for(int n = 1 ; n < c ; n++) {
				ButtonNo = ButtonNo + Temp[n];
			}
			ButtonVal = Double.parseDouble(ButtonNo);
		}else {
			ButtonVal = Ans;
		}
		
		
	}
//	1901507654
	public void MainCalc() {
		if(Symbol.equals("+")){
			System.out.println("before" + AnswerHalf + "and" + ButtonVal);
			AnswerHalf = AnswerHalf + ButtonVal;
		}else if(Symbol.equals("-")) {
			System.out.println("before" + AnswerHalf + "and" + ButtonVal);
			AnswerHalf = AnswerHalf - ButtonVal;
		}else if(Symbol.equals("*")) {
			System.out.println("before" + AnswerHalf + "and" + ButtonVal);
			AnswerHalf = AnswerHalf * ButtonVal;
		}else if(Symbol.equals("/")) {
			System.out.println("before" + AnswerHalf + "and" + ButtonVal);
			AnswerHalf = AnswerHalf / ButtonVal;
		}
		
		PrintAnswer = Double.toString(AnswerHalf);
		AfterEqual = 1;
		SymbolMark = 0;
		c = 0;
		AfterAnswer = 0;
		TFCalc.setText(PrintAnswer);
	}
	
	public void ACMethod() {
		TFCalc.setText("0");
		AnswerHalf = 0;
		AfterEqual = 0;
		SymbolMark = 0;
		c= 0;
	}
	
	public void DelMethod() {
		c = c - 2;
		String tmp = Temp[0];
		for(int n = 1; n <= c ; n++) {
			tmp = tmp + Temp[n];
		}
		
		c++;
		TFCalc.setText(tmp);
	}
	
	
	public void initComponents() {
		
		P1 = new JPanel();
		P2 = new JPanel();
		
		But1 = new JButton("1");
		But2 = new JButton("2");
		But3 = new JButton("3");
		But4 = new JButton("4");
		But5 = new JButton("5");
		But6 = new JButton("6");
		But7 = new JButton("7");
		But8 = new JButton("8");
		But9 = new JButton("9");
		But0 = new JButton("0");
		
		ButPlus = new JButton("+");
		ButMin = new JButton("-");
		ButMulti = new JButton("*");
		ButDiv = new JButton("/");
		ButRep = new JButton("1/x");
		ButSqrt = new JButton("Sqrt");
		ButCom = new JButton(".");
		ButDel = new JButton("Del");
		ButReset = new JButton("AC");
		ButEqu = new JButton("=");
		
		TFCalc = new JTextField();
		
		
	}
//	Harry Ermawan
	public void setComponents() {
		
		TFCalc.setPreferredSize(new Dimension(370,50));
		
		P1.add(TFCalc);
		
		
		P2.setLayout(new GridLayout(5, 4));
		
		P2.add(ButDel);
		P2.add(ButReset);
		P2.add(ButSqrt);
		P2.add(ButRep);
		
		P2.add(But7);
		P2.add(But8);
		P2.add(But9);
		P2.add(ButDiv);
		
		P2.add(But4);
		P2.add(But5);
		P2.add(But6);
		P2.add(ButMulti);
		
		P2.add(But1);
		P2.add(But2);
		P2.add(But3);
		P2.add(ButMin);
		
		P2.add(But0);
		P2.add(ButCom);
		P2.add(ButEqu);
		P2.add(ButPlus);
		
		setTitle("Harry Calculator");
		setSize(380,450);
		setVisible(true);
		setLocation(600, 150);
		setResizable(false);
		
		add(P1,BorderLayout.NORTH);
		add(P2,BorderLayout.CENTER);
		
		
		But1.addActionListener(this);
		But2.addActionListener(this);
		But3.addActionListener(this);
		But4.addActionListener(this);
		But5.addActionListener(this);
		But6.addActionListener(this);
		But7.addActionListener(this);
		But8.addActionListener(this);
		But9.addActionListener(this);
		But0.addActionListener(this);
		
		ButPlus.addActionListener(this);
		ButMin.addActionListener(this);
		ButMulti.addActionListener(this);
		ButDiv.addActionListener(this);
		ButRep.addActionListener(this);
		ButSqrt.addActionListener(this);
		ButCom.addActionListener(this);
		ButDel.addActionListener(this);
		ButReset.addActionListener(this);
		ButEqu.addActionListener(this);
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)1901507654 - Harry Ermawan
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==But0) {
			TempNum("0");
		}else if(arg0.getSource()==But1) {
			TempNum("1");
		}else if(arg0.getSource()==But2) {
			TempNum("2");
		}else if(arg0.getSource()==But3) {
			TempNum("3");
		}else if(arg0.getSource()==But4) {
			TempNum("4");
		}else if(arg0.getSource()==But5) {
			TempNum("5");
		}else if(arg0.getSource()==But6) {
			TempNum("6");
		}else if(arg0.getSource()==But7) {
			TempNum("7");
		}else if(arg0.getSource()==But8) {
			TempNum("8");
		}else if(arg0.getSource()==But9) {
			TempNum("9");
		}else if(arg0.getSource()==ButCom) {
			TempNum(".");
		}else if(arg0.getSource()==ButDel) {
			DelMethod();
		}else if(arg0.getSource()==ButDiv) {
			TFCalc.setText("/");
			Calculation1("/");
		}else if(arg0.getSource()==ButEqu) {
			TFCalc.setText("=");
	        AfterEqual = 1;
	        SymbolMark = 0;
	        Calculation2();
	        MainCalc();
		}else if(arg0.getSource()==ButMin) {
			TFCalc.setText("-");
			Calculation1("-");
		}else if(arg0.getSource()==ButMulti) {
			TFCalc.setText("*");
			Calculation1("*");
		}else if(arg0.getSource()==ButPlus) {
			TFCalc.setText("+");
			Calculation1("+");
		}else if(arg0.getSource()==ButRep) {
			
		}else if(arg0.getSource()==ButReset) {
			ACMethod();
		}else if(arg0.getSource()==ButSqrt) {
			
		}
	}
	


	
	
	public Calculator() {
		// TODO Auto-generated constructor stub
		initComponents();
		setComponents();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
	}

}

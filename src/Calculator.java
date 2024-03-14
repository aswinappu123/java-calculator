
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean is0peratorclicked=false;
	JFrame jf;
	JLabel displaylabel;
	String oldValue;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton,clearButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton;
	JButton plusButton;
	String operator;

	public Calculator() {
		jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,150);
		
		displaylabel=new JLabel();
		displaylabel.setBounds(30, 50, 540, 40);
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.white);
		jf.add(displaylabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton=new JButton("x");
		mulButton.setBounds(330, 230, 80, 80);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("clear");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public static void main(String[] args) {
		new Calculator();
	}
	public void actionPerform(ActionEvent e) {
		displaylabel.setText("7");
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String currentValue = displaylabel.getText();

	    if (e.getSource() == sevenButton || e.getSource() == eightButton || e.getSource() == nineButton ||
	        e.getSource() == fourButton || e.getSource() == fiveButton || e.getSource() == sixButton ||
	        e.getSource() == oneButton || e.getSource() == twoButton || e.getSource() == threeButton ||
	        e.getSource() == zeroButton || e.getSource() == dotButton) {
	        
	        if (is0peratorclicked) {
	            displaylabel.setText("");
	            is0peratorclicked = false;
	        }
	        displaylabel.setText(displaylabel.getText() + ((JButton) e.getSource()).getText());
	    } else if (e.getSource() == equalButton) {
	        
	        String newValue = displaylabel.getText();
	        float oldValueF = Float.parseFloat(oldValue);
	        float newValueF = Float.parseFloat(newValue);
	        float result = 0;

	        
	        if (operator.equals("+")) {
	            result = oldValueF + newValueF;
	        } else if (operator.equals("-")) {
	            result = oldValueF - newValueF;
	        } else if (operator.equals("x")) {
	            result = oldValueF * newValueF;
	        } else if (operator.equals("/")) {
	            if (newValueF != 0) {
	                result = oldValueF / newValueF;
	            } else {
	                displaylabel.setText("Error: Division by zero");
	                return;
	            }
	        }
	        displaylabel.setText(result + "");
	        oldValue = result + "";
	    } else if (e.getSource() == plusButton || e.getSource() == minusButton || e.getSource() == mulButton || e.getSource() == divButton) {
	        
	        is0peratorclicked = true;
	        operator = ((JButton) e.getSource()).getText();
	        oldValue = currentValue;
	    } else if (e.getSource() == clearButton) {
	       
	        displaylabel.setText("");
	        oldValue = "";
	        is0peratorclicked = false;
	    }
	}
		
	}





	

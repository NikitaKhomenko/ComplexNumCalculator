import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class MainPanel extends JPanel {
	
	private JLabel lblTitle, lblResult, lblResultNum, lblComplex,  lblNumA1, lblNumA2, lblNumB1, lblNumB2;
	private JTextField txtA1, txtA2, txtB1, txtB2;
	private JButton btAdd, btSubstract, btMultiply, btDivide, btCompare, btAbs;

	public MainPanel() {
		lblTitle = new JLabel("Complex Numbers Calculator");
		lblTitle.setFont(lblTitle.getFont().deriveFont(Font.BOLD, 16f));
		lblResult = new JLabel("  Result:   ");
		lblResult.setFont(lblTitle.getFont().deriveFont(Font.BOLD, 14f));
		lblResultNum = new JLabel(" ");
		Font ResultNumFont = new Font("TimesRoman", Font.BOLD, 16);
		lblResultNum.setFont(ResultNumFont);
		lblComplex = new JLabel("    a + bi");
		lblComplex.setFont(lblTitle.getFont().deriveFont(Font.BOLD, 15f));
		lblNumA1 = new JLabel("a1");
		lblNumA2 = new JLabel("a2");
		lblNumB1 = new JLabel("b1");
		lblNumB2 = new JLabel("b2");
		
		btAdd = new JButton("Add");
		btAdd.setPreferredSize(new Dimension(85, 25));
		btSubstract = new JButton("Substract");
		btSubstract.setPreferredSize(new Dimension(90, 25));
		btMultiply = new JButton("Multiply");
		btMultiply.setPreferredSize(new Dimension(90, 25));
		btDivide = new JButton("Divide");
		btDivide.setPreferredSize(new Dimension(90, 25));
		btCompare = new JButton("Compare");
		btCompare.setPreferredSize(new Dimension(90, 25));
		btAbs = new JButton("Abs");
		btAbs.setPreferredSize(new Dimension(90, 25));
		
		txtA1 = new JTextField(5);
		txtA1.setText("0.0");
		txtA2 = new JTextField(5);
		txtA2.setText("0.0");
		txtB1 = new JTextField(5);
		txtB1.setText("0.0");
		txtB2 = new JTextField(5);
		txtB2.setText("0.0");

		arrangeComponents();
		
		final double a1, b1, a2, b2;
		final ComplexNumbers c1, c2;
		

	
        btAdd.addMouseListener(new MouseListener(){ 
        	double a1, b1, a2, b2;
    		ComplexNumbers c1, c2;
    		
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent arg0) {}
			
			public void mouseClicked(MouseEvent e) {
				try {
					a1 = new Double(txtA1.getText().trim()).doubleValue();
					b1 = new Double(txtB1.getText().trim()).doubleValue();
					a2 = new Double(txtA2.getText().trim()).doubleValue();
					b2 = new Double(txtB2.getText().trim()).doubleValue();
					c1 = new ComplexNumbers(a1, b1);
					c2 = new ComplexNumbers(a2, b2);
					
					lblResultNum.setText("(" + c1 + ") +" + "(" + c2 + ")" + "=" + c1.add(c2));
				}
					catch (Exception ex) {
						lblResultNum.setText("All values must be double.");
						return;
					}
			}
               
            public void mouseExited(MouseEvent e) {
            	btAdd.setText("Add");
            }

            public void mouseEntered(MouseEvent e) {
            	btAdd.setText("+");
            }
            
        });
        
       
        btSubstract.addMouseListener(new MouseListener(){ 
        	double a1, b1, a2, b2;
    		ComplexNumbers c1, c2;
    		
            public void mouseReleased(MouseEvent e) {}
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent e) {
				try {
					a1 = new Double(txtA1.getText().trim()).doubleValue();
					b1 = new Double(txtB1.getText().trim()).doubleValue();
					a2 = new Double(txtA2.getText().trim()).doubleValue();
					b2 = new Double(txtB2.getText().trim()).doubleValue();
					c1 = new ComplexNumbers(a1, b1);
					c2 = new ComplexNumbers(a2, b2);
					
					lblResultNum.setText("(" + c1 + ") -" + "(" + c2 + ")" + "=" + c1.substract(c2));
				}
					catch (Exception ex) {
						lblResultNum.setText("All values must be double.");
						return;
					}
			}
			
            public void mouseExited(MouseEvent e) {
            	btSubstract.setText("Substract");
            }

            public void mouseEntered(MouseEvent e) {
            	btSubstract.setText("-");
            }

        });
        
        btMultiply.addMouseListener(new MouseListener(){ 
        	double a1, b1, a2, b2;
    		ComplexNumbers c1, c2;
    		
            public void mouseReleased(MouseEvent e) {}
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent e) {
				try {
					a1 = new Double(txtA1.getText().trim()).doubleValue();
					b1 = new Double(txtB1.getText().trim()).doubleValue();
					a2 = new Double(txtA2.getText().trim()).doubleValue();
					b2 = new Double(txtB2.getText().trim()).doubleValue();
					c1 = new ComplexNumbers(a1, b1);
					c2 = new ComplexNumbers(a2, b2);
					
					lblResultNum.setText("(" + c1 + ") *" + "(" + c2 + ")" + "=" + c1.multiply(c2));
				}
					catch (Exception ex) {
						lblResultNum.setText("All values must be double.");
						return;
					}
			}
			
            public void mouseExited(MouseEvent e) {
            	btMultiply.setText("Multiply");
            }

            public void mouseEntered(MouseEvent e) {
            	btMultiply.setText("*");
            }

        });
        
        btDivide.addMouseListener(new MouseListener(){ 
        	double a1, b1, a2, b2;
    		ComplexNumbers c1, c2;
    		
            public void mouseReleased(MouseEvent e) {}
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent e) {
				try {
					a1 = new Double(txtA1.getText().trim()).doubleValue();
					b1 = new Double(txtB1.getText().trim()).doubleValue();
					a2 = new Double(txtA2.getText().trim()).doubleValue();
					b2 = new Double(txtB2.getText().trim()).doubleValue();
					c1 = new ComplexNumbers(a1, b1);
					c2 = new ComplexNumbers(a2, b2);
					
					lblResultNum.setText("(" + c1 + ") /" + "(" + c2 + ")" + "=" + c1.devide(c2));
				}
					catch (Exception ex) {
						lblResultNum.setText("All values must be double.");
						return;
					}
			}
			
            public void mouseExited(MouseEvent e) {
            	btDivide.setText("Divide");
            }

            public void mouseEntered(MouseEvent e) {
            	btDivide.setText("/");
            }

        });
        
        btCompare.addMouseListener(new MouseListener(){ 
        	double a1, b1, a2, b2;
    		ComplexNumbers c1, c2;
    		String s;
    		
            public void mouseReleased(MouseEvent e) {}
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent e) {
				try {
					a1 = new Double(txtA1.getText().trim()).doubleValue();
					b1 = new Double(txtB1.getText().trim()).doubleValue();
					a2 = new Double(txtA2.getText().trim()).doubleValue();
					b2 = new Double(txtB2.getText().trim()).doubleValue();
					c1 = new ComplexNumbers(a1, b1);
					c2 = new ComplexNumbers(a2, b2);
					
					if(c1.compareTo(c2) == 0)
						s = "abs of (" + c1 + ") is equals to abs of (" + c2 + ")";
					else if(c1.compareTo(c2) > 0)
						s = "abs of (" + c1 + ") is greater than abs of (" + c2 + ")";
					else
						s = "abs of (" + c1 + ") is less than abs of (" + c2 + ")";
					
					lblResultNum.setText(s);
				}
					catch (Exception ex) {
						lblResultNum.setText("All values must be double.");
						return;
					}
			}
			
            public void mouseExited(MouseEvent e) {
            	btCompare.setText("Compare");
            }

            public void mouseEntered(MouseEvent e) {
            	btCompare.setText("?");
            }
			
        });
        
        btAbs.addMouseListener(new MouseListener(){ 
        	double a1, b1, a2, b2;
    		ComplexNumbers c1, c2;
    		String s = "";
    		
            public void mouseReleased(MouseEvent e) {}
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent e) {
				try {
					a1 = new Double(txtA1.getText().trim()).doubleValue();
					b1 = new Double(txtB1.getText().trim()).doubleValue();
					a2 = new Double(txtA2.getText().trim()).doubleValue();
					b2 = new Double(txtB2.getText().trim()).doubleValue();
					c1 = new ComplexNumbers(a1, b1);
					c2 = new ComplexNumbers(a2, b2);
					
					s = "|" + c1 + "| = " + c1.abs();
					s = s + "      |" + c2 + "| = " + c2.abs();
					lblResultNum.setText(s);

				}
					catch (Exception ex) {
						lblResultNum.setText("All values must be double.");
						return;
					}
			}
			
            public void mouseExited(MouseEvent e) {
            	btAbs.setText("Abs");
            }

            public void mouseEntered(MouseEvent e) {
            	btAbs.setText("||");
            }
        });
        

	}
	
	
	private void arrangeComponents() {
		
        JPanel TopPnl = new JPanel();
        JPanel ButtomPnl = new JPanel();
        JPanel TxtPnl = new JPanel();
        JPanel BtnPnl = new JPanel();
	
		TxtPnl.setLayout(new FlowLayout());
		BtnPnl.setLayout(new FlowLayout());
        ButtomPnl.setLayout(new BorderLayout());
   
        TopPnl.add(lblTitle);
   
        TxtPnl.add(lblNumA1);
        TxtPnl.add(txtA1);		
        TxtPnl.add(lblNumB1);
		TxtPnl.add(txtB1);
		TxtPnl.add(lblNumA2);
		TxtPnl.add(txtA2);
		TxtPnl.add(lblNumB2);
		TxtPnl.add(txtB2);
        TxtPnl.add(lblComplex);
		
		BtnPnl.add(btAdd);
		BtnPnl.add(btSubstract);
		BtnPnl.add(btMultiply);
		BtnPnl.add(btDivide);
		BtnPnl.add(btCompare);
		BtnPnl.add(btAbs);
		
		ButtomPnl.add(lblResult, BorderLayout.WEST);
		ButtomPnl.add(lblResultNum, BorderLayout.CENTER);

        GridLayout gridLayout = new GridLayout(4,0);
        setLayout(gridLayout);
        add(TopPnl);
        add(TxtPnl);
        add(BtnPnl);
        add(ButtomPnl);


	}
}

        


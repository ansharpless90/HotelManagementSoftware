package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class Hotel {

	private JFrame frame;
	private JTextField txtDisplay;
	private JTextField txtFriedRice;
	private JTextField txtShawarma;
	private JTextField txtChicken;
	private JTextField txtChooseDrink;
	private JTextField txtEnterCurrency;

	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel.setBounds(12, 30, 507, 728);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(24, 12, 471, 704);
		panel.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_3, null);
		panel_3.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Dialog", Font.PLAIN, 60));
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(14, 12, 426, 56);
		panel_3.add(txtDisplay);
		
		JButton btnBackspace = new JButton("<");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (txtDisplay.getText().length()>0)
				{
					String backspace = null;
					
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Dialog", Font.BOLD, 60));
		btnBackspace.setBounds(12, 80, 100, 100);
		panel_3.add(btnBackspace);
		
		JButton btn7  = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue =  txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 70));
		btn7.setBounds(12, 190, 100, 100);
		panel_3.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue =  txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 70));
		btn4.setBounds(12, 300, 100, 100);
		panel_3.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue =  txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 70));
		btn1.setBounds(12, 410, 100, 100);
		panel_3.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue =  txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn0.setFont(new Font("Dialog", Font.BOLD, 70));
		btn0.setBounds(12, 520, 100, 100);
		panel_3.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue =  txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btnDot.setFont(new Font("Dialog", Font.BOLD, 70));
		btnDot.setBounds(122, 520, 100, 100);
		panel_3.add(btnDot);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue =  txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 70));
		btn2.setBounds(122, 410, 100, 100);
		panel_3.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue =  txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 70));
		btn5.setBounds(122, 300, 100, 100);
		panel_3.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue =  txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 70));
		btn8.setBounds(122, 190, 100, 100);
		panel_3.add(btn8);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtDisplay.setText(null);
				
			}
		});
		btnclear.setFont(new Font("Dialog", Font.BOLD, 70));
		btnclear.setBounds(122, 80, 100, 100);
		panel_3.add(btnclear);
		
		JButton btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
				
			}
		});
		btnModulus.setFont(new Font("Dialog", Font.BOLD, 60));
		btnModulus.setBounds(232, 80, 100, 100);
		panel_3.add(btnModulus);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue =  txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 70));
		btn9.setBounds(232, 190, 100, 100);
		panel_3.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue =  txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 70));
		btn6.setBounds(232, 300, 100, 100);
		panel_3.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue =  txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 70));
		btn3.setBounds(232, 410, 100, 100);
		panel_3.add(btn3);
		
		JButton btnPM = new JButton("±");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double plusminus = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				plusminus = plusminus*(-1);
				txtDisplay.setText(String.valueOf(plusminus));
				
			}
		});
		btnPM.setFont(new Font("Dialog", Font.BOLD, 70));
		btnPM.setBounds(232, 520, 100, 100);
		panel_3.add(btnPM);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				
				secondnum = Double.parseDouble(txtDisplay.getText());
				
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "X")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnequal.setFont(new Font("Dialog", Font.BOLD, 70));
		btnequal.setBounds(342, 520, 100, 100);
		panel_3.add(btnequal);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
				
			}
		});
		btndivide.setFont(new Font("Dialog", Font.BOLD, 70));
		btndivide.setBounds(342, 410, 100, 100);
		panel_3.add(btndivide);
		
		JButton btnx = new JButton("X");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "X";
				
			}
		});
		btnx.setFont(new Font("Dialog", Font.BOLD, 70));
		btnx.setBounds(342, 300, 100, 100);
		panel_3.add(btnx);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
				
			}
		});
		btnMinus.setFont(new Font("Dialog", Font.BOLD, 70));
		btnMinus.setBounds(342, 190, 100, 100);
		panel_3.add(btnMinus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 70));
		btnPlus.setBounds(342, 80, 100, 100);
		panel_3.add(btnPlus);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTextArea ReceiptArea = new JTextArea();
		ReceiptArea.setBounds(12, 12, 442, 653);
		panel_4.add(ReceiptArea);
		
		JPanel btnTotalCostOfDrink = new JPanel();
		btnTotalCostOfDrink.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		btnTotalCostOfDrink.setBounds(522, 439, 966, 319);
		frame.getContentPane().add(btnTotalCostOfDrink);
		btnTotalCostOfDrink.setLayout(null);
		
		JLabel btnTotalCostOfMeal = new JLabel("Total Cost of Meal");
		btnTotalCostOfMeal.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnTotalCostOfMeal.setBounds(29, 30, 232, 22);
		btnTotalCostOfDrink.add(btnTotalCostOfMeal);
		
		JLabel lblTotalCostOf = new JLabel("Total Cost of Drink");
		lblTotalCostOf.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblTotalCostOf.setBounds(29, 83, 232, 22);
		btnTotalCostOfDrink.add(lblTotalCostOf);
		
		JLabel btnCostOfDelivery = new JLabel("Cost of Delivery");
		btnCostOfDelivery.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnCostOfDelivery.setBounds(29, 133, 232, 22);
		btnTotalCostOfDrink.add(btnCostOfDelivery);
		
		JLabel btnCostOfRoom = new JLabel("Cost of Room");
		btnCostOfRoom.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnCostOfRoom.setBounds(29, 181, 232, 22);
		btnTotalCostOfDrink.add(btnCostOfRoom);
		
		JLabel txtTotalCostOfMeal = new JLabel("");
		txtTotalCostOfMeal.setFont(new Font("Dialog", Font.BOLD, 25));
		txtTotalCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalCostOfMeal.setBounds(287, 21, 280, 31);
		btnTotalCostOfDrink.add(txtTotalCostOfMeal);
		
		JLabel txtTotalCostOfDrink = new JLabel("");
		txtTotalCostOfDrink.setFont(new Font("Dialog", Font.BOLD, 25));
		txtTotalCostOfDrink.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalCostOfDrink.setBounds(287, 83, 280, 31);
		btnTotalCostOfDrink.add(txtTotalCostOfDrink);
		
		JLabel txtCostOfDelivery = new JLabel("");
		txtCostOfDelivery.setFont(new Font("Dialog", Font.BOLD, 25));
		txtCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtCostOfDelivery.setBounds(287, 133, 280, 31);
		btnTotalCostOfDrink.add(txtCostOfDelivery);
		
		JLabel txtCostOfRoom = new JLabel("");
		txtCostOfRoom.setFont(new Font("Dialog", Font.BOLD, 25));
		txtCostOfRoom.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtCostOfRoom.setBounds(287, 181, 280, 31);
		btnTotalCostOfDrink.add(txtCostOfRoom);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(592, 12, 100, 276);
		btnTotalCostOfDrink.add(separator_4);
		
		JLabel btnTax1 = new JLabel("Tax");
		btnTax1.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnTax1.setBounds(620, 44, 63, 22);
		btnTotalCostOfDrink.add(btnTax1);
		
		JLabel btnSubTotal = new JLabel("Sub Total");
		btnSubTotal.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnSubTotal.setBounds(620, 120, 132, 22);
		btnTotalCostOfDrink.add(btnSubTotal);
		
		JLabel btnTotal = new JLabel("Total");
		btnTotal.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnTotal.setBounds(620, 206, 82, 22);
		btnTotalCostOfDrink.add(btnTotal);
		
		JLabel txtTax = new JLabel("");
		txtTax.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTax.setBounds(764, 38, 177, 31);
		btnTotalCostOfDrink.add(txtTax);
		
		JLabel txtSubTotal = new JLabel("");
		txtSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtSubTotal.setBounds(764, 111, 177, 31);
		btnTotalCostOfDrink.add(txtSubTotal);
		
		JLabel txtTotal = new JLabel("");
		txtTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotal.setBounds(764, 197, 177, 31);
		btnTotalCostOfDrink.add(txtTotal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_2.setBounds(522, 86, 966, 341);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(25, 12, 100, 22);
		lblMenu.setForeground(Color.BLUE);
		lblMenu.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		panel_2.add(lblMenu);
		
		JLabel lblQty = new JLabel("QTY");
		lblQty.setBounds(249, 12, 100, 22);
		lblQty.setForeground(Color.BLUE);
		lblQty.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		panel_2.add(lblQty);
		
		JLabel lblPrice = new JLabel("Price $");
		lblPrice.setBounds(435, 12, 116, 22);
		lblPrice.setForeground(Color.BLUE);
		lblPrice.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		panel_2.add(lblPrice);
		
		JLabel btnFriedRice = new JLabel("Fried Rice");
		btnFriedRice.setBounds(12, 35, 154, 22);
		btnFriedRice.setFont(new Font("Dialog", Font.PLAIN, 25));
		panel_2.add(btnFriedRice);
		
		JLabel btnShawarma = new JLabel("Shawarma");
		btnShawarma.setBounds(12, 70, 154, 22);
		btnShawarma.setFont(new Font("Dialog", Font.PLAIN, 25));
		panel_2.add(btnShawarma);
		
		JLabel btnChicken = new JLabel("Chicken");
		btnChicken.setBounds(12, 104, 154, 22);
		btnChicken.setFont(new Font("Dialog", Font.PLAIN, 25));
		panel_2.add(btnChicken);
		
		txtFriedRice = new JTextField();
		txtFriedRice.setFont(new Font("Dialog", Font.BOLD, 20));
		txtFriedRice.setBounds(248, 41, 116, 22);
		panel_2.add(txtFriedRice);
		txtFriedRice.setColumns(10);
		
		txtShawarma = new JTextField();
		txtShawarma.setFont(new Font("Dialog", Font.BOLD, 20));
		txtShawarma.setBounds(249, 70, 116, 22);
		txtShawarma.setColumns(10);
		panel_2.add(txtShawarma);
		
		txtChicken = new JTextField();
		txtChicken.setFont(new Font("Dialog", Font.BOLD, 20));
		txtChicken.setBounds(249, 104, 116, 22);
		txtChicken.setColumns(10);
		panel_2.add(txtChicken);
		
		JLabel label = new JLabel("5.676");
		label.setBounds(435, 43, 154, 22);
		label.setFont(new Font("Dialog", Font.PLAIN, 25));
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("3.987");
		label_1.setBounds(435, 70, 154, 22);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("11.452");
		label_2.setBounds(435, 104, 154, 22);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 25));
		panel_2.add(label_2);
		
		JComboBox btnChooseDrink = new JComboBox();
		btnChooseDrink.setBounds(12, 138, 219, 31);
		btnChooseDrink.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a drink", "Coca Cola", "Heineken", "Pepsi"}));
		panel_2.add(btnChooseDrink);
		
		txtChooseDrink = new JTextField();
		txtChooseDrink.setFont(new Font("Dialog", Font.BOLD, 20));
		txtChooseDrink.setBounds(248, 138, 116, 22);
		txtChooseDrink.setColumns(10);
		panel_2.add(txtChooseDrink);
		
		JLabel label_3 = new JLabel("     -");
		label_3.setBounds(435, 142, 154, 22);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 25));
		panel_2.add(label_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(591, 12, 100, 305);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(12, 181, 555, 107);
		panel_2.add(separator_3);
		
		JComboBox btnChooseRoom = new JComboBox();
		btnChooseRoom.setBounds(12, 187, 219, 31);
		btnChooseRoom.setModel(new DefaultComboBoxModel(new String[] {"Choose a room", "101", "201", "VIP"}));
		btnChooseRoom.setFont(new Font("Dialog", Font.PLAIN, 25));
		panel_2.add(btnChooseRoom);
		
		JCheckBox btnDelivery = new JCheckBox("Delivery");
		btnDelivery.setBounds(22, 219, 209, 23);
		btnDelivery.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel_2.add(btnDelivery);
		
		JCheckBox btnTax = new JCheckBox("Tax");
		btnTax.setBounds(25, 246, 113, 31);
		btnTax.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel_2.add(btnTax);
		

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//================================Drink==============================
				
				double Drinks = Double.parseDouble(txtChooseDrink.getText());
				double CocaCola = 0.957*Drinks;
				double Heineken = 2.432*Drinks;
				double Pepsi = 1.674*Drinks;
				
				if(btnChooseDrink.getSelectedItem().equals("Coca Cola"))
				{
					String pCoca_Cola = String.format("%.3f", CocaCola);
					txtTotalCostOfDrink.setText(pCoca_Cola);
				}
				
				if(btnChooseDrink.getSelectedItem().equals("Heineken"))
				{
					String pHeineken = String.format("%.3f", Heineken);
					txtTotalCostOfDrink.setText(pHeineken);
				}
				
				if(btnChooseDrink.getSelectedItem().equals("Pepsi"))
				{
					String pPepsi = String.format("%.3f", Pepsi);
					txtTotalCostOfDrink.setText(pPepsi);
				}
				
				if(btnChooseDrink.getSelectedItem().equals("Choose a Drink"))
				{
					
					txtTotalCostOfDrink.setText("0.000");
				}
				
				
				
				//============================Meal==================================
				
				double FriedRice = Double.parseDouble(txtFriedRice.getText());
				double pFriedRice = 5.676;
				double getFriedRice;
				getFriedRice = (FriedRice * pFriedRice);
				String TotalFriedRice = String.format("%.3f", getFriedRice);
			    txtTotalCostOfMeal.setText(TotalFriedRice);
			    
				
				double Shawarma = Double.parseDouble(txtShawarma.getText());
				double pShawarma = 3.987;
				double getShawarma;
				getShawarma = (Shawarma * pShawarma);
				String TotalShawarma = String.format("%.3f", getShawarma + getFriedRice);
			    txtTotalCostOfMeal.setText(TotalShawarma);
			    
				
				double Chicken = Double.parseDouble(txtChicken.getText());
				double pChicken = 11.452;
				double getChicken;
				getChicken = (Chicken * pChicken);
				String TotalChicken = String.format("%.3f", getChicken + getShawarma + getFriedRice);
			    txtTotalCostOfMeal.setText(TotalChicken);			    
				
			    //===========================Delivery===============================
			    double cDelivery = 4.50;
			    if(btnDelivery.isSelected())
			    {
			    	String pDelivery = String.format("%.3f", cDelivery);
			    	txtCostOfDelivery.setText(pDelivery);
			    }
			    else
			    {
			    	txtCostOfDelivery.setText("0.000");
			    }
			    
			    
			    //=========================Tax=====================================
			    
			    double pTotal1 = Double.parseDouble(txtTotalCostOfMeal.getText());
			    double pTotal2 = Double.parseDouble(txtTotalCostOfDrink.getText());
			    double pTotal3 = Double.parseDouble(txtCostOfDelivery.getText());
			    double cTotal = (pTotal1 + pTotal2 + pTotal3)/100;
			    
			    if(btnTax.isSelected())
			    {
			    	String xTotal = String.format("%.3f", cTotal);
			    	txtTax.setText(xTotal);
			    }
				
			    
			    //=====================Total===================================
			    double pTotal4 = Double.parseDouble(txtTax.getText());
			    
			    String zTaxTotal = String.format("%.3f", pTotal4);
			    txtTax.setText(zTaxTotal);
			    
			    double SubTotal = (pTotal1 + pTotal2 + pTotal3);
			    String pSubTotal = String.format("%.3f", SubTotal);
			    txtSubTotal.setText(pSubTotal);
			    
			    double xTotal = (pTotal1 + pTotal2 + pTotal3 + pTotal4);
			    String yTotal = String.format("%.3f", xTotal);
			    txtTotal.setText(yTotal);
			}
		});
		btnSubmit.setFont(new Font("Dialog", Font.BOLD, 25));
		btnSubmit.setBounds(266, 233, 154, 25);
		panel_2.add(btnSubmit);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setForeground(Color.BLUE);
		lblCurrencyConverter.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		lblCurrencyConverter.setBounds(614, 8, 364, 31);
		panel_2.add(lblCurrencyConverter);
		
		JComboBox btnSelectCountry = new JComboBox();
		btnSelectCountry.setModel(new DefaultComboBoxModel(new String[] {"Country", "Nigeria", "Kenya", "China", "India"}));
		btnSelectCountry.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnSelectCountry.setBounds(607, 50, 318, 31);
		panel_2.add(btnSelectCountry);
		
		txtEnterCurrency = new JTextField();
		txtEnterCurrency.setFont(new Font("Dialog", Font.PLAIN, 30));
		txtEnterCurrency.setColumns(10);
		txtEnterCurrency.setBounds(614, 110, 311, 38);
		panel_2.add(txtEnterCurrency);
		
		JLabel txtCurrencyOutput = new JLabel("");
		txtCurrencyOutput.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	
		txtCurrencyOutput.setBounds(611, 172, 314, 31);
		panel_2.add(txtCurrencyOutput);
		JButton btnReset1 = new JButton("Reset");
		btnReset1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtFriedRice.setText(null);
				txtShawarma.setText(null);
				txtChicken.setText(null);
				txtChooseDrink.setText(null);
				txtTotalCostOfMeal.setText(null);
				txtTotalCostOfDrink.setText(null);
				txtCostOfDelivery.setText(null);
				txtCostOfRoom.setText(null);
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				txtEnterCurrency.setText(null);
				txtCurrencyOutput.setText(null);
				txtDisplay.setText(null);
				btnChooseDrink.setSelectedItem("Choose a Drink");
				btnChooseRoom.setSelectedItem("Choose a Room");
				btnSelectCountry.setSelectedItem("Country");
				ReceiptArea.setText(null);
				
				
			}
		}
				
				
				
				);
		btnReset1.setBounds(421, 233, 146, 25);
		btnReset1.setFont(new Font("Dialog", Font.BOLD, 25));
		panel_2.add(btnReset1);
		
		
		JButton btnReset2 = new JButton("Reset");
		btnReset2.setFont(new Font("Dialog", Font.BOLD, 25));
		btnReset2.setBounds(766, 233, 159, 31);
		panel_2.add(btnReset2);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Dialog", Font.BOLD, 25));
		btnConvert.setBounds(611, 233, 154, 31);
		panel_2.add(btnConvert);
		
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 56));
		lblNewLabel.setBounds(572, 12, 916, 68);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1301, 28);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Dialog", Font.BOLD, 20));
		menuBar.add(mnFile);
		
		JMenu mnNew = new JMenu("New");
		mnNew.setFont(new Font("Dialog", Font.BOLD, 20));
		mnFile.add(mnNew);
		
		JMenuItem mntmReceipt = new JMenuItem("Receipt");
		mntmReceipt.setFont(new Font("Dialog", Font.BOLD, 20));
		mnNew.add(mntmReceipt);
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtFriedRice.setText(null);
				txtShawarma.setText(null);
				txtChicken.setText(null);
				txtChooseDrink.setText(null);
				txtTotalCostOfMeal.setText(null);
				txtTotalCostOfDrink.setText(null);
				txtCostOfDelivery.setText(null);
				txtCostOfRoom.setText(null);
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				txtEnterCurrency.setText(null);
				txtCurrencyOutput.setText(null);
				txtDisplay.setText(null);
				btnChooseDrink.setSelectedItem("Choose a Drink");
				btnChooseRoom.setSelectedItem("Choose a Room");
				btnSelectCountry.setSelectedItem("Country");
				ReceiptArea.setText(null);
				
			}
		});
		mntmReset.setFont(new Font("Dialog", Font.BOLD, 20));
		mnNew.add(mntmReset);
		
		JMenuItem mntmConvert = new JMenuItem("Convert");
		mntmConvert.setFont(new Font("Dialog", Font.BOLD, 20));
		mnFile.add(mntmConvert);
		
		JMenuItem mntmTotal = new JMenuItem("Total");
		mntmTotal.setFont(new Font("Dialog", Font.BOLD, 20));
		mnFile.add(mntmTotal);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmRefresh = new JMenuItem("Refresh");
		mntmRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtFriedRice.setText(null);
				txtShawarma.setText(null);
				txtChicken.setText(null);
				txtChooseDrink.setText(null);
				txtTotalCostOfMeal.setText(null);
				txtTotalCostOfDrink.setText(null);
				txtCostOfDelivery.setText(null);
				txtCostOfRoom.setText(null);
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				txtEnterCurrency.setText(null);
				txtCurrencyOutput.setText(null);
				txtDisplay.setText(null);
				btnChooseDrink.setSelectedItem("Choose a Drink");
				btnChooseRoom.setSelectedItem("Choose a Room");
				btnSelectCountry.setSelectedItem("Country");
				ReceiptArea.setText(null);
				
			}
		});
		mntmRefresh.setFont(new Font("Dialog", Font.BOLD, 20));
		mnFile.add(mntmRefresh);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mntmExit.setForeground(Color.RED);
		mntmExit.setFont(new Font("Dialog", Font.BOLD, 20));
		mnFile.add(mntmExit);
		
		JMenu mnConvert = new JMenu("Convert");
		mnConvert.setFont(new Font("Dialog", Font.BOLD, 20));
		menuBar.add(mnConvert);
		
		JMenu mnTotal = new JMenu("Total");
		mnTotal.setFont(new Font("Dialog", Font.BOLD, 20));
		menuBar.add(mnTotal);
		
		JMenu mnReset = new JMenu("Reset");
		mnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtFriedRice.setText(null);
				txtShawarma.setText(null);
				txtChicken.setText(null);
				txtChooseDrink.setText(null);
				txtTotalCostOfMeal.setText(null);
				txtTotalCostOfDrink.setText(null);
				txtCostOfDelivery.setText(null);
				txtCostOfRoom.setText(null);
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				txtEnterCurrency.setText(null);
				txtCurrencyOutput.setText(null);
				txtDisplay.setText(null);
				btnChooseDrink.setSelectedItem("Choose a Drink");
				btnChooseRoom.setSelectedItem("Choose a Room");
				btnSelectCountry.setSelectedItem("Country");
				ReceiptArea.setText(null);
				
			}
		});
		mnReset.setFont(new Font("Dialog", Font.BOLD, 20));
		menuBar.add(mnReset);
		
		JMenu mnReceipt = new JMenu("Receipt");
		mnReceipt.setFont(new Font("Dialog", Font.BOLD, 20));
		menuBar.add(mnReceipt);
		
		JMenu mnExit = new JMenu("Exit");
		mnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnExit.setFont(new Font("Dialog", Font.BOLD, 20));
		menuBar.add(mnExit);
	}
}

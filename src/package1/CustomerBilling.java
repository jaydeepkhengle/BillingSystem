package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JScrollPane;

public class CustomerBilling {

	private JFrame frmMymartCustomerBilling;
	private JTextField txtCustomerName;
	private JTextField txtPhoneNo;
	private JTextField txtBillNo;
	private JTextField txtEmailId;
	private JTextField txtBathSoap;
	private JTextField txtFaceCream;
	private JTextField txtFaceWash;
	private JTextField txtHairSpray;
	private JTextField txtBodyLotion;
	private JTextField txtHairOil;
	private JTextField txtShampoo;
	private JTextField txtHairConditioner;
	private JTextField txtRice;
	private JTextField txtFoodOil;
	private JTextField txtDaal;
	private JTextField txtPohe;
	private JTextField txtSugar;
	private JTextField txtWheat;
	private JTextField txtTomato;
	private JTextField txtShezwanSauce;
	private JTextField txtCoke;
	private JTextField txtMaza;
	private JTextField txtTrimmer;
	private JTextField txtHairDryer;
	private JTextField txtWaterBottle;
	private JTextField txtAirPurifier;
	private JTextField txtPen;
	private JTextField txtNotebook;
	private JTextField txtSubtotal;
	private JTextField txtSGST;
	private JTextField txtCGST;
	private JTextField txtTotalTax;
	private JTextField txtTotalAmout;
	private JTextArea txtReceipt;
	private double subtotalAmount;
	private double bathSoapPrice = 45.00;
	private double faceCreamPrice = 115.00;
	private double faceWashPrice = 165.00;
	private double hairSprayPrice = 99.00;
	private double bodyLotionPrice = 199.00;
	private double hairOilPrice = 59.00;
	private double shampooPrice = 120.00;
	private double hairConditionerPrice = 120.00;
	private double ricePrice = 46.00;
	private double foodOilPrice = 116.00;
	private double daalPrice = 56.00;
	private double sugarPrice = 32.00;
	private double PohePrice = 41.00;
	private double wheatPrice = 28.00;
	private double tomatoKetchupPrice = 119.00;
	private double shezwanSaucePrice = 60.00;
	private double cokePrice = 59.00;
	private double mazaPrice = 45.00;
	private double trimmerPrice = 889.00;
	private double hairDryerPrice = 1299.00;
	private double waterBottlePrice = 112.00;
	private double airPurifierPrice = 4599.00;
	private double penPrice = 12.00;
	private double noteBookPrice = 65.00;
	int billNo = (int)(Math.random()*1000);
	private DecimalFormat decimalFormat;
	private String totalTaxStr="0", taxStr="0", totalAmountStr="0", subtotalAmountStr="0";
	
	
	private JCheckBox chckbxBathSoap, chckbxTomatoKetchup, chckbxNotebook, chckbxMaza,chckbxPen, chckbxHairDryer, chckbxAirPurifier,chckbxWaterBottle,chckbxTrimmer, chckbxCoke, chckbxRice, chckbxShezwanSauce, chckbxSugar, chckbxWheat, chckbxFaceCream,chckbxDaal, chckbxFaceWash, chckbxHairSpray, chckbxBodyLotion, chckbxHairOil, chckbxShampoo, chckbxHairConditioner, chckbxFoodOil, chckbxPohe;
	private JScrollPane scrollPane;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					CustomerBilling window = new CustomerBilling();
					window.frmMymartCustomerBilling.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerBilling() {
		initialize();
	}

	public void billNumberGenerator() {

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMymartCustomerBilling = new JFrame();
		frmMymartCustomerBilling.setResizable(false);
		frmMymartCustomerBilling.setTitle("My Mart Bill Ease System");
		frmMymartCustomerBilling.setIconImage(Toolkit.getDefaultToolkit().getImage(CustomerBilling.class.getResource("/Images/BIllingSystemLogo.png")));
		frmMymartCustomerBilling.getContentPane().setBackground(new Color(131, 162, 177));

		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int height = dim.height;
		int width = dim.width;


		frmMymartCustomerBilling.setSize(width, height);
		frmMymartCustomerBilling.setLocationRelativeTo(null);
		frmMymartCustomerBilling.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMymartCustomerBilling.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(7, 68, 99));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(11, 46, 64)));
		panel.setBounds(10, 4, 1502, 62);
		frmMymartCustomerBilling.getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("Super Market Bill Ease System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(12, 6, 6, 6, (Color) new Color(11, 46, 64)));
		panel_1.setBackground(new Color(7, 68, 99));
		panel_1.setBounds(10, 69, 1502, 82);
		frmMymartCustomerBilling.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblCustomerDetails = new JLabel("Customer Details");
		lblCustomerDetails.setBounds(32, 0, 156, 23);
		panel_1.add(lblCustomerDetails);
		lblCustomerDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerDetails.setForeground(new Color(255, 255, 0));
		lblCustomerDetails.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));

		JLabel lblNewLabel_1 = new JLabel("Customer Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(302, 33, 180, 30);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		txtCustomerName = new JTextField();
		txtCustomerName.setBounds(514, 35, 173, 29);
		panel_1.add(txtCustomerName);
		txtCustomerName.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Phone No");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(712, 33, 156, 30);
		panel_1.add(lblNewLabel_1_1);

		txtPhoneNo = new JTextField();
		txtPhoneNo.setColumns(10);
		txtPhoneNo.setBounds(878, 35, 173, 29);
		panel_1.add(txtPhoneNo);

		JLabel lblBill = new JLabel("Bill No");
		lblBill.setHorizontalAlignment(SwingConstants.CENTER);
		lblBill.setForeground(Color.WHITE);
		lblBill.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblBill.setBounds(20, 33, 100, 30);
		panel_1.add(lblBill);

		txtBillNo = new JTextField();
		txtBillNo.setEditable(false);
		txtBillNo.setColumns(10);
		txtBillNo.setBounds(130, 35, 127, 29);
		panel_1.add(txtBillNo);
		txtBillNo.setText(Integer.toString(billNo));

		JLabel lblNewLabel_1_1_1 = new JLabel("Email Id");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblNewLabel_1_1_1.setBounds(1067, 33, 156, 30);
		panel_1.add(lblNewLabel_1_1_1);

		txtEmailId = new JTextField();
		txtEmailId.setColumns(10);
		txtEmailId.setBounds(1226, 35, 216, 29);
		panel_1.add(txtEmailId);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(12, 6, 6, 6, (Color) new Color(11, 46, 64)));
		panel_2.setBackground(new Color(7, 68, 99));
		panel_2.setBounds(10, 155, 375, 510);
		frmMymartCustomerBilling.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblCosmetics = new JLabel("Cosmetics");
		lblCosmetics.setHorizontalAlignment(SwingConstants.LEFT);
		lblCosmetics.setForeground(Color.YELLOW);
		lblCosmetics.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		lblCosmetics.setBounds(32, 0, 108, 23);
		panel_2.add(lblCosmetics);

		chckbxBathSoap = new JCheckBox("Bath Soap");
		chckbxBathSoap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBathSoap.isSelected()) {
					txtBathSoap.setEnabled(true);
					txtBathSoap.setText("1");
					calculateTotalAmount();
					liveBillPrint();

				}
				else {
					txtBathSoap.setText("0");
					txtBathSoap.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}

			}
		});
		chckbxBathSoap.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxBathSoap.setForeground(new Color(255, 255, 255));
		chckbxBathSoap.setBackground(new Color(7, 68, 99));
		chckbxBathSoap.setBounds(32, 39, 125, 35);
		panel_2.add(chckbxBathSoap);
		

		txtBathSoap = new JTextField();
		txtBathSoap.addFocusListener(new FocusAdapter() {
			@Override
			
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();			
			}
		});
		txtBathSoap.setEnabled(false);
		txtBathSoap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBathSoap.setHorizontalAlignment(SwingConstants.LEFT);
		txtBathSoap.setText("0");
		txtBathSoap.setColumns(10);
		txtBathSoap.setBounds(239, 46, 96, 29);
		panel_2.add(txtBathSoap);

		chckbxFaceCream = new JCheckBox("Face Cream");
		chckbxFaceCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFaceCream.isSelected()) {
					txtFaceCream.setEnabled(true);
					txtFaceCream.setText("1");
					calculateTotalAmount();
					liveBillPrint();
					
				}
				else {
					txtFaceCream.setText("0");
					txtFaceCream.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();

				}
			}
		});
		chckbxFaceCream.setForeground(Color.WHITE);
		chckbxFaceCream.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxFaceCream.setBackground(new Color(7, 68, 99));
		chckbxFaceCream.setBounds(32, 100, 143, 35);
		panel_2.add(chckbxFaceCream);

		chckbxFaceWash = new JCheckBox("Face Wash");
		chckbxFaceWash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFaceWash.isSelected()) {
					txtFaceWash.setEnabled(true);
					txtFaceWash.setText("1");
					calculateTotalAmount();
					liveBillPrint();

				}
				else {
					txtFaceWash.setText("0");
					txtFaceWash.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();

				}
			}
		});
		chckbxFaceWash.setForeground(Color.WHITE);
		chckbxFaceWash.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxFaceWash.setBackground(new Color(7, 68, 99));
		chckbxFaceWash.setBounds(32, 161, 125, 35);
		panel_2.add(chckbxFaceWash);

		chckbxHairSpray = new JCheckBox("Hair Spray");
		chckbxHairSpray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHairSpray.isSelected()) {
					txtHairSpray.setEnabled(true);
					txtHairSpray.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtHairSpray.setText("0");
					txtHairSpray.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxHairSpray.setForeground(Color.WHITE);
		chckbxHairSpray.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxHairSpray.setBackground(new Color(7, 68, 99));
		chckbxHairSpray.setBounds(32, 222, 125, 35);
		panel_2.add(chckbxHairSpray);

		chckbxBodyLotion = new JCheckBox("Body Lotion");
		chckbxBodyLotion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBodyLotion.isSelected()) {
					txtBodyLotion.setEnabled(true);
					txtBodyLotion.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtBodyLotion.setText("0");
					txtBodyLotion.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxBodyLotion.setForeground(Color.WHITE);
		chckbxBodyLotion.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxBodyLotion.setBackground(new Color(7, 68, 99));
		chckbxBodyLotion.setBounds(32, 283, 143, 35);
		panel_2.add(chckbxBodyLotion);

		chckbxHairOil = new JCheckBox("Hair Oil");
		chckbxHairOil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHairOil.isSelected()) {
					txtHairOil.setEnabled(true);
					txtHairOil.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtHairOil.setText("0");
					txtHairOil.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxHairOil.setForeground(Color.WHITE);
		chckbxHairOil.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxHairOil.setBackground(new Color(7, 68, 99));
		chckbxHairOil.setBounds(32, 344, 125, 35);
		panel_2.add(chckbxHairOil);

		chckbxShampoo = new JCheckBox("Shampoo");
		chckbxShampoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShampoo.isSelected()) {
					txtShampoo.setEnabled(true);
					txtShampoo.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtShampoo.setText("0");
					txtShampoo.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxShampoo.setForeground(Color.WHITE);
		chckbxShampoo.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxShampoo.setBackground(new Color(7, 68, 99));
		chckbxShampoo.setBounds(32, 405, 125, 35);
		panel_2.add(chckbxShampoo);

		chckbxHairConditioner = new JCheckBox("Hair Conditioner");
		chckbxHairConditioner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHairConditioner.isSelected()) {
					txtHairConditioner.setEnabled(true);
					txtHairConditioner.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtHairConditioner.setText("0");
					txtHairConditioner.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxHairConditioner.setForeground(Color.WHITE);
		chckbxHairConditioner.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxHairConditioner.setBackground(new Color(7, 68, 99));
		chckbxHairConditioner.setBounds(32, 466, 183, 35);
		panel_2.add(chckbxHairConditioner);

		txtFaceCream = new JTextField();
		txtFaceCream.addFocusListener(new FocusAdapter() {
			@Override
			
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtFaceCream.setEnabled(false);
		txtFaceCream.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFaceCream.setText("0");
		txtFaceCream.setColumns(10);
		txtFaceCream.setBounds(239, 100, 96, 29);
		panel_2.add(txtFaceCream);

		txtFaceWash = new JTextField();
		txtFaceWash.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtFaceWash.setEnabled(false);
		txtFaceWash.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFaceWash.setText("0");
		txtFaceWash.setColumns(10);
		txtFaceWash.setBounds(239, 161, 96, 29);
		panel_2.add(txtFaceWash);

		txtHairSpray = new JTextField();
		txtHairSpray.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtHairSpray.setEnabled(false);
		txtHairSpray.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHairSpray.setText("0");
		txtHairSpray.setColumns(10);
		txtHairSpray.setBounds(239, 222, 96, 29);
		panel_2.add(txtHairSpray);

		txtBodyLotion = new JTextField();
		txtBodyLotion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtBodyLotion.setEnabled(false);
		txtBodyLotion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBodyLotion.setText("0");
		txtBodyLotion.setColumns(10);
		txtBodyLotion.setBounds(239, 283, 96, 29);
		panel_2.add(txtBodyLotion);

		txtHairOil = new JTextField();
		txtHairOil.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtHairOil.setEnabled(false);
		txtHairOil.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHairOil.setText("0");
		txtHairOil.setColumns(10);
		txtHairOil.setBounds(239, 344, 96, 29);
		panel_2.add(txtHairOil);

		txtShampoo = new JTextField();
		txtShampoo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtShampoo.setEnabled(false);
		txtShampoo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtShampoo.setText("0");
		txtShampoo.setColumns(10);
		txtShampoo.setBounds(239, 405, 96, 29);
		panel_2.add(txtShampoo);

		txtHairConditioner = new JTextField();
		txtHairConditioner.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtHairConditioner.setEnabled(false);
		txtHairConditioner.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHairConditioner.setText("0");
		txtHairConditioner.setColumns(10);
		txtHairConditioner.setBounds(239, 466, 96, 29);
		panel_2.add(txtHairConditioner);

		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBorder(new MatteBorder(12, 6, 6, 6, (Color) new Color(11, 46, 64)));
		panel_2_3.setBackground(new Color(7, 68, 99));
		panel_2_3.setBounds(10, 667, 1131, 116);
		frmMymartCustomerBilling.getContentPane().add(panel_2_3);
		panel_2_3.setLayout(null);

		JLabel lblBillMenu = new JLabel("Bill Menu");
		lblBillMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblBillMenu.setForeground(Color.YELLOW);
		lblBillMenu.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		lblBillMenu.setBounds(32, 0, 129, 23);
		panel_2_3.add(lblBillMenu);

		JLabel lblSgst = new JLabel("Price");
		lblSgst.setHorizontalAlignment(SwingConstants.LEFT);
		lblSgst.setForeground(Color.WHITE);
		lblSgst.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSgst.setBounds(32, 28, 79, 30);
		panel_2_3.add(lblSgst);

		txtSubtotal = new JTextField();
		txtSubtotal.setEditable(false);
		txtSubtotal.setText("0.00");
		txtSubtotal.setColumns(10);
		txtSubtotal.setBounds(126, 30, 127, 29);
		panel_2_3.add(txtSubtotal);

		JLabel lblSgst_2 = new JLabel("SGST");
		lblSgst_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblSgst_2.setForeground(Color.WHITE);
		lblSgst_2.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSgst_2.setBounds(32, 68, 79, 30);
		panel_2_3.add(lblSgst_2);

		txtSGST = new JTextField();
		txtSGST.setEditable(false);
		txtSGST.setText("0.00");
		txtSGST.setColumns(10);
		txtSGST.setBounds(126, 69, 127, 29);
		panel_2_3.add(txtSGST);

		JLabel lblSgst_2_1 = new JLabel("CGST");
		lblSgst_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSgst_2_1.setForeground(Color.WHITE);
		lblSgst_2_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSgst_2_1.setBounds(281, 28, 79, 30);
		panel_2_3.add(lblSgst_2_1);

		txtCGST = new JTextField();
		txtCGST.setEditable(false);
		txtCGST.setText("0.00");
		txtCGST.setColumns(10);
		txtCGST.setBounds(397, 28, 127, 29);
		panel_2_3.add(txtCGST);

		JLabel lblSgst_2_1_1 = new JLabel("Total Tax");
		lblSgst_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSgst_2_1_1.setForeground(Color.WHITE);
		lblSgst_2_1_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSgst_2_1_1.setBounds(281, 68, 93, 30);
		panel_2_3.add(lblSgst_2_1_1);

		txtTotalTax = new JTextField();
		txtTotalTax.setEditable(false);
		txtTotalTax.setText("0.00");
		txtTotalTax.setColumns(10);
		txtTotalTax.setBounds(397, 68, 127, 29);
		panel_2_3.add(txtTotalTax);

		JLabel lblSgst_2_1_1_1 = new JLabel("Total Amount");
		lblSgst_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSgst_2_1_1_1.setForeground(Color.WHITE);
		lblSgst_2_1_1_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSgst_2_1_1_1.setBounds(601, 23, 134, 30);
		panel_2_3.add(lblSgst_2_1_1_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(594, 60, 175, 41);
		panel_2_3.add(panel_3);
		panel_3.setLayout(null);

		txtTotalAmout = new JTextField();
		txtTotalAmout.setEditable(false);
		txtTotalAmout.setText("0.00 Rs");
		txtTotalAmout.setForeground(new Color(255, 255, 0));
		txtTotalAmout.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 20));
		txtTotalAmout.setBounds(1, 2, 173, 37);
		panel_3.add(txtTotalAmout); 
		txtTotalAmout.setBackground(new Color(0, 0, 0));
		txtTotalAmout.setColumns(10);

		JButton btnNewButton = new JButton("Generate Bill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liveBillPrint();
				txtReceipt.setText(null);
				LocalDate date = LocalDate.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
				LocalTime time = LocalTime.now();
				String formattedTime = time.format(formatter);
				System.out.println(date);
				System.out.println(formattedTime);
				

				txtReceipt.append("\t      MyMart Customer Billing System" +
				        "\n      S No 50/A, MyMart, Renuka Nagri, Vadgaon Bk, Sinhagad Rd,\n                                            Pune - 411041" + 
						"\n   ===============================================" +
						"\n   Bill No : " + billNo +
						"\n   Customer Name : " + txtCustomerName.getText() +
						"\n   Emaild Id     : " + txtEmailId.getText() + 
						"\n   -------------------------------------------------------------------------------------" +
						"\n   Item Name                                                          Qty         Price " +
						"\n   -------------------------------------------------------------------------------------"); 

				
				if(chckbxBathSoap.isSelected()) {
					txtReceipt.append("\n   " + chckbxBathSoap.getLabel() + "                                                            " + txtBathSoap.getText() + "            " + bathSoapPrice);
				}
				if(chckbxFaceCream.isSelected()) {
					txtReceipt.append("\n   " + chckbxFaceCream.getLabel() + "                                                         " + txtFaceCream.getText() + "            " + faceCreamPrice);
				}
				if(chckbxFaceWash.isSelected()) {
					txtReceipt.append("\n   " + chckbxFaceWash.getLabel() + "                                                          " + txtFaceWash.getText() + "            " + faceWashPrice);
				}
				if(chckbxHairSpray.isSelected()) {
					txtReceipt.append("\n   " + chckbxHairSpray.getLabel() + "                                                            " + txtHairSpray.getText() + "             " + hairSprayPrice);
				}
				if(chckbxBodyLotion.isSelected()) {
					txtReceipt.append("\n   " + chckbxBodyLotion.getLabel() + "                                                          " + txtBodyLotion.getText() + "             " + bodyLotionPrice);
				}
				if(chckbxHairOil.isSelected()) {
					txtReceipt.append("\n   " + chckbxHairOil.getLabel() + "                                                                 " + txtHairOil.getText() + "             " + hairOilPrice);
				}
				if(chckbxShampoo.isSelected()) {
					txtReceipt.append("\n   " + chckbxShampoo.getLabel() + "                                                              " + txtShampoo.getText() + "            " + shampooPrice);
				}
				if(chckbxHairConditioner.isSelected()) {
					txtReceipt.append("\n   " + chckbxHairConditioner.getLabel() + "                                                   " + txtHairConditioner.getText() + "             " + hairConditionerPrice);
				}
				if(chckbxRice.isSelected()) {
					txtReceipt.append("\n   " + chckbxRice.getLabel() + "                                                               " + txtRice.getText() + "             " + ricePrice);
				}
				if(chckbxFoodOil.isSelected()) {
					txtReceipt.append("\n   " + chckbxFoodOil.getLabel() + "                                                           " + txtFoodOil.getText() + "             " + foodOilPrice);
				}
				if(chckbxDaal.isSelected()) {
					txtReceipt.append("\n   " + chckbxDaal.getLabel() + "                                                               " + txtDaal.getText() + "             " + daalPrice);
				}
				if(chckbxPohe.isSelected()) {
					txtReceipt.append("\n   " + chckbxPohe.getLabel() + "                                                              " + txtPohe.getText() + "             " + PohePrice);
				}
				if(chckbxSugar.isSelected()) {
					txtReceipt.append("\n   " + chckbxSugar.getLabel() + "                                                             " + txtSugar.getText() + "             " + sugarPrice);
				}
				if(chckbxWheat.isSelected()) {
					txtReceipt.append("\n   " + chckbxWheat.getLabel() + "                                                                   " + txtWheat.getText() + "             " + wheatPrice);
				}
				if(chckbxTomatoKetchup.isSelected()) {
					txtReceipt.append("\n   " + chckbxTomatoKetchup.getLabel() + "                                                   " + txtTomato.getText() + "             " + tomatoKetchupPrice);
				}
				if(chckbxShezwanSauce.isSelected()) {
					txtReceipt.append("\n   " + chckbxShezwanSauce.getLabel() + "                                                   " + txtShezwanSauce.getText() + "             " + shezwanSaucePrice);
				}
				if(chckbxCoke.isSelected()) {
					txtReceipt.append("\n   " + chckbxCoke.getLabel() + "                                                                     " + txtCoke.getText() + "             " + cokePrice);
				}
				if(chckbxMaza.isSelected()) {
					txtReceipt.append("\n   " + chckbxMaza.getLabel() + "                                                                     " + txtMaza.getText() + "             " + mazaPrice);
				}
				if(chckbxTrimmer.isSelected()) {
					txtReceipt.append("\n   " + chckbxTrimmer.getLabel() + "                                                                " + txtTrimmer.getText() + "             " + trimmerPrice);
				}
				if(chckbxHairDryer.isSelected()) {
					txtReceipt.append("\n   " + chckbxHairDryer.getLabel() + "                                                             " + txtHairDryer.getText() + "             " + hairDryerPrice);
				}
				if(chckbxWaterBottle.isSelected()) {
					txtReceipt.append("\n   " + chckbxWaterBottle.getLabel() + "                                                          " + txtWaterBottle.getText() + "             " + waterBottlePrice);
				}
				if(chckbxAirPurifier.isSelected()) {
					txtReceipt.append("\n   " + chckbxAirPurifier.getLabel() + "                                                             " + txtAirPurifier.getText() + "              " + airPurifierPrice);
				}
				if(chckbxPen.isSelected()) {
					txtReceipt.append("\n   " + chckbxPen.getLabel() + "                                                                        " + txtPen.getText() + "              " + penPrice);
				}
				if(chckbxNotebook.isSelected()) {
					txtReceipt.append("\n   " + chckbxNotebook.getLabel() + "                                                               " + txtNotebook.getText() + "              " + noteBookPrice);
				}
				
				txtReceipt.append("\n   @SGST                                                                                ");
				txtReceipt.append("\n   @CGST                                                                                ");
				txtReceipt.append("\n   -------------------------------------------------------------------------------------");
				txtReceipt.append("\n   Date & Time : " + date + " / " + formattedTime);
				txtReceipt.append("\n   -------------------------------------------------------------------------------------");
				txtReceipt.append("\n   Subtotal :                                                                       " + subtotalAmountStr + " Rs/-");
				txtReceipt.append("\n   @SGST :                                                                      " + (taxStr) + " Rs/-");
				txtReceipt.append("\n   @CGST :                                                                      " + (taxStr) + " Rs/-");
				txtReceipt.append("\n   Total Amount :                                                              " + totalAmountStr + "Rs/-");
				txtReceipt.append("\n   -------------------------------------------------------------------------------------");
				txtReceipt.append("\n                                  Thank You !! Plese Visit Again");
			}
		});
		btnNewButton.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		btnNewButton.setBounds(853, 28, 141, 30);
		panel_2_3.add(btnNewButton);

		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					txtReceipt.print();
				}
				catch(PrinterException a) {
					System.err.format("No Printer Found", a.getMessage());
				}
			}
		});
		btnPrint.setBackground(new Color(0, 223, 56));
		btnPrint.setForeground(new Color(255, 255, 255));
		btnPrint.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		btnPrint.setBounds(1004, 28, 79, 30);
		panel_2_3.add(btnPrint);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do You Really Want To Exit ?", "Exit", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		btnExit.setBounds(1004, 71, 79, 30);
		panel_2_3.add(btnExit);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(12, 6, 6, 6, (Color) new Color(11, 46, 64)));
		panel_2_1.setBackground(new Color(7, 68, 99));
		panel_2_1.setBounds(389, 155, 375, 510);
		frmMymartCustomerBilling.getContentPane().add(panel_2_1);

		JLabel lblGrocery = new JLabel("Grocery");
		lblGrocery.setHorizontalAlignment(SwingConstants.LEFT);
		lblGrocery.setForeground(Color.YELLOW);
		lblGrocery.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		lblGrocery.setBounds(32, 0, 108, 23);
		panel_2_1.add(lblGrocery);

		txtRice = new JTextField();
		txtRice.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtRice.setEnabled(false);
		txtRice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRice.setText("0");
		txtRice.setColumns(10);
		txtRice.setBounds(239, 46, 96, 29);
		panel_2_1.add(txtRice);

		chckbxFoodOil = new JCheckBox("Food Oil(L)");
		chckbxFoodOil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFoodOil.isSelected()) {
					txtFoodOil.setEnabled(true);
					txtFoodOil.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtFoodOil.setText("0");
					txtFoodOil.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxFoodOil.setForeground(Color.WHITE);
		chckbxFoodOil.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxFoodOil.setBackground(new Color(7, 68, 99));
		chckbxFoodOil.setBounds(32, 100, 143, 35);
		panel_2_1.add(chckbxFoodOil);

		chckbxDaal = new JCheckBox("Daal(Kg)");
		chckbxDaal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDaal.isSelected()) {
					txtDaal.setEnabled(true);
					txtDaal.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtDaal.setText("0");
					txtDaal.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxDaal.setForeground(Color.WHITE);
		chckbxDaal.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxDaal.setBackground(new Color(7, 68, 99));
		chckbxDaal.setBounds(32, 161, 125, 35);
		panel_2_1.add(chckbxDaal);

		chckbxPohe = new JCheckBox("Pohe(Kg)");
		chckbxPohe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPohe.isSelected()) {
					txtPohe.setEnabled(true);
					txtPohe.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtPohe.setText("0");
					txtPohe.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxPohe.setForeground(Color.WHITE);
		chckbxPohe.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxPohe.setBackground(new Color(7, 68, 99));
		chckbxPohe.setBounds(32, 222, 125, 35);
		panel_2_1.add(chckbxPohe);

		chckbxSugar = new JCheckBox("Sugar(Kg)");
		chckbxSugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSugar.isSelected()) {
					txtSugar.setEnabled(true);
					txtSugar.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtSugar.setText("0");
					txtSugar.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxSugar.setForeground(Color.WHITE);
		chckbxSugar.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxSugar.setBackground(new Color(7, 68, 99));
		chckbxSugar.setBounds(32, 283, 143, 35);
		panel_2_1.add(chckbxSugar);

		chckbxWheat = new JCheckBox("Wheat");
		chckbxWheat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxWheat.isSelected()) {
					txtWheat.setEnabled(true);
					txtWheat.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtWheat.setText("0");
					txtWheat.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxWheat.setForeground(Color.WHITE);
		chckbxWheat.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxWheat.setBackground(new Color(7, 68, 99));
		chckbxWheat.setBounds(32, 344, 125, 35);
		panel_2_1.add(chckbxWheat);

		chckbxTomatoKetchup = new JCheckBox("Tomato Ketchup");
		chckbxTomatoKetchup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTomatoKetchup.isSelected()) {
					txtTomato.setEnabled(true);
					txtTomato.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtTomato.setText("0");
					txtTomato.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxTomatoKetchup.setForeground(Color.WHITE);
		chckbxTomatoKetchup.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxTomatoKetchup.setBackground(new Color(7, 68, 99));
		chckbxTomatoKetchup.setBounds(32, 405, 183, 35);
		panel_2_1.add(chckbxTomatoKetchup);

		chckbxShezwanSauce = new JCheckBox("Shezwan Sauce");
		chckbxShezwanSauce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShezwanSauce.isSelected()) {
					txtShezwanSauce.setEnabled(true);
					txtShezwanSauce.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtShezwanSauce.setText("0");
					txtShezwanSauce.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxShezwanSauce.setForeground(Color.WHITE);
		chckbxShezwanSauce.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxShezwanSauce.setBackground(new Color(7, 68, 99));
		chckbxShezwanSauce.setBounds(32, 466, 183, 35);
		panel_2_1.add(chckbxShezwanSauce);

		txtFoodOil = new JTextField();
		txtFoodOil.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtFoodOil.setEnabled(false);
		txtFoodOil.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFoodOil.setText("0");
		txtFoodOil.setColumns(10);
		txtFoodOil.setBounds(239, 100, 96, 29);
		panel_2_1.add(txtFoodOil);

		txtDaal = new JTextField();
		txtDaal.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtDaal.setEnabled(false);
		txtDaal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDaal.setText("0");
		txtDaal.setColumns(10);
		txtDaal.setBounds(239, 161, 96, 29);
		panel_2_1.add(txtDaal);

		txtPohe = new JTextField();
		txtPohe.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtPohe.setEnabled(false);
		txtPohe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPohe.setText("0");
		txtPohe.setColumns(10);
		txtPohe.setBounds(239, 222, 96, 29);
		panel_2_1.add(txtPohe);

		txtSugar = new JTextField();
		txtSugar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtSugar.setEnabled(false);
		txtSugar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSugar.setText("0");
		txtSugar.setColumns(10);
		txtSugar.setBounds(239, 283, 96, 29);
		panel_2_1.add(txtSugar);

		txtWheat = new JTextField();
		txtWheat.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtWheat.setEnabled(false);
		txtWheat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtWheat.setText("0");
		txtWheat.setColumns(10);
		txtWheat.setBounds(239, 344, 96, 29);
		panel_2_1.add(txtWheat);

		txtTomato = new JTextField();
		txtTomato.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtTomato.setEnabled(false);
		txtTomato.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTomato.setText("0");
		txtTomato.setColumns(10);
		txtTomato.setBounds(239, 405, 96, 29);
		panel_2_1.add(txtTomato);

		txtShezwanSauce = new JTextField();
		txtShezwanSauce.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtShezwanSauce.setEnabled(false);
		txtShezwanSauce.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtShezwanSauce.setText("0");
		txtShezwanSauce.setColumns(10);
		txtShezwanSauce.setBounds(239, 466, 96, 29);
		panel_2_1.add(txtShezwanSauce);

		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new MatteBorder(12, 6, 6, 6, (Color) new Color(11, 46, 64)));
		panel_2_2.setBackground(new Color(7, 68, 99));
		panel_2_2.setBounds(768, 155, 375, 510);
		frmMymartCustomerBilling.getContentPane().add(panel_2_2);

		JLabel lblCosmetics_2 = new JLabel("Others");
		lblCosmetics_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCosmetics_2.setForeground(Color.YELLOW);
		lblCosmetics_2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		lblCosmetics_2.setBounds(32, 0, 108, 23);
		panel_2_2.add(lblCosmetics_2);

		chckbxRice = new JCheckBox("Rice(Kg)");
		chckbxRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRice.isSelected()) {
					txtRice.setEnabled(true);
					txtRice.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtRice.setText("0");
					txtRice.setEnabled(false);
				}
			}
		});
		chckbxRice.setForeground(Color.WHITE);
		chckbxRice.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxRice.setBackground(new Color(7, 68, 99));
		chckbxRice.setBounds(32, 39, 125, 35);
		panel_2_1.add(chckbxRice);

		chckbxCoke = new JCheckBox("Coke");
		chckbxCoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCoke.isSelected()) {
					txtCoke.setEnabled(true);
					txtCoke.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtCoke.setText("0");
					txtCoke.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxCoke.setForeground(Color.WHITE);
		chckbxCoke.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxCoke.setBackground(new Color(7, 68, 99));
		chckbxCoke.setBounds(32, 39, 125, 35);
		panel_2_2.add(chckbxCoke);

		txtCoke = new JTextField();
		txtCoke.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtCoke.setEnabled(false);
		txtCoke.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCoke.setText("0");
		txtCoke.setColumns(10);
		txtCoke.setBounds(239, 46, 96, 29);
		panel_2_2.add(txtCoke);

		chckbxMaza = new JCheckBox("Maza");
		chckbxMaza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMaza.isSelected()) {
					txtMaza.setEnabled(true);
					txtMaza.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtMaza.setText("0");
					txtMaza.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxMaza.setForeground(Color.WHITE);
		chckbxMaza.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxMaza.setBackground(new Color(7, 68, 99));
		chckbxMaza.setBounds(32, 100, 143, 35);
		panel_2_2.add(chckbxMaza);

		chckbxTrimmer = new JCheckBox("Trimmer");
		chckbxTrimmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTrimmer.isSelected()) {
					txtTrimmer.setEnabled(true);
					txtTrimmer.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtTrimmer.setText("0");
					txtTrimmer.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxTrimmer.setForeground(Color.WHITE);
		chckbxTrimmer.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxTrimmer.setBackground(new Color(7, 68, 99));
		chckbxTrimmer.setBounds(32, 161, 125, 35);
		panel_2_2.add(chckbxTrimmer);

		chckbxHairDryer = new JCheckBox("Hair Dryer");
		chckbxHairDryer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHairDryer.isSelected()) {
					txtHairDryer.setEnabled(true);
					txtHairDryer.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtHairDryer.setText("0");
					txtHairDryer.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxHairDryer.setForeground(Color.WHITE);
		chckbxHairDryer.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxHairDryer.setBackground(new Color(7, 68, 99));
		chckbxHairDryer.setBounds(32, 222, 125, 35);
		panel_2_2.add(chckbxHairDryer);

		chckbxWaterBottle = new JCheckBox("Water Bottle");
		chckbxWaterBottle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxWaterBottle.isSelected()) {
					txtWaterBottle.setEnabled(true);
					txtWaterBottle.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtWaterBottle.setText("0");
					txtWaterBottle.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxWaterBottle.setForeground(Color.WHITE);
		chckbxWaterBottle.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxWaterBottle.setBackground(new Color(7, 68, 99));
		chckbxWaterBottle.setBounds(32, 283, 143, 35);
		panel_2_2.add(chckbxWaterBottle);

		chckbxAirPurifier = new JCheckBox("Air Purifier");
		chckbxAirPurifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAirPurifier.isSelected()) {
					txtAirPurifier.setEnabled(true);
					txtAirPurifier.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtAirPurifier.setText("0");
					txtAirPurifier.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxAirPurifier.setForeground(Color.WHITE);
		chckbxAirPurifier.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxAirPurifier.setBackground(new Color(7, 68, 99));
		chckbxAirPurifier.setBounds(32, 344, 125, 35);
		panel_2_2.add(chckbxAirPurifier);

		chckbxPen = new JCheckBox("Pen");
		chckbxPen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPen.isSelected()) {
					txtPen.setEnabled(true);
					txtPen.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtPen.setText("0");
					txtPen.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxPen.setForeground(Color.WHITE);
		chckbxPen.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxPen.setBackground(new Color(7, 68, 99));
		chckbxPen.setBounds(32, 405, 125, 35);
		panel_2_2.add(chckbxPen);

		chckbxNotebook = new JCheckBox("Notebook");
		chckbxNotebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNotebook.isSelected()) {
					txtNotebook.setEnabled(true);
					txtNotebook.setText("1");
					calculateTotalAmount();
					liveBillPrint();
				}
				else {
					txtNotebook.setText("0");
					txtNotebook.setEnabled(false);
					calculateTotalAmount();
					liveBillPrint();
				}
			}
		});
		chckbxNotebook.setForeground(Color.WHITE);
		chckbxNotebook.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		chckbxNotebook.setBackground(new Color(7, 68, 99));
		chckbxNotebook.setBounds(32, 466, 183, 35);
		panel_2_2.add(chckbxNotebook);

		txtMaza = new JTextField();
		txtMaza.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtMaza.setEnabled(false);
		txtMaza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMaza.setText("0");
		txtMaza.setColumns(10);
		txtMaza.setBounds(239, 100, 96, 29);
		panel_2_2.add(txtMaza);

		txtTrimmer = new JTextField();
		txtTrimmer.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtTrimmer.setEnabled(false);
		txtTrimmer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTrimmer.setText("0");
		txtTrimmer.setColumns(10);
		txtTrimmer.setBounds(239, 161, 96, 29);
		panel_2_2.add(txtTrimmer);

		txtHairDryer = new JTextField();
		txtHairDryer.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtHairDryer.setEnabled(false);
		txtHairDryer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHairDryer.setText("0");
		txtHairDryer.setColumns(10);
		txtHairDryer.setBounds(239, 222, 96, 29);
		panel_2_2.add(txtHairDryer);

		txtWaterBottle = new JTextField();
		txtWaterBottle.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtWaterBottle.setEnabled(false);
		txtWaterBottle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtWaterBottle.setText("0");
		txtWaterBottle.setColumns(10);
		txtWaterBottle.setBounds(239, 283, 96, 29);
		panel_2_2.add(txtWaterBottle);

		txtAirPurifier = new JTextField();
		txtAirPurifier.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtAirPurifier.setEnabled(false);
		txtAirPurifier.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAirPurifier.setText("0");
		txtAirPurifier.setColumns(10);
		txtAirPurifier.setBounds(239, 344, 96, 29);
		panel_2_2.add(txtAirPurifier);

		txtPen = new JTextField();
		txtPen.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtPen.setEnabled(false);
		txtPen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPen.setText("0");
		txtPen.setColumns(10);
		txtPen.setBounds(239, 405, 96, 29);
		panel_2_2.add(txtPen);

		txtNotebook = new JTextField();
		txtNotebook.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateTotalAmount();
				liveBillPrint();
			}
		});
		txtNotebook.setEnabled(false);
		txtNotebook.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNotebook.setText("0");
		txtNotebook.setColumns(10);
		txtNotebook.setBounds(239, 466, 96, 29);
		panel_2_2.add(txtNotebook);

		JButton btnClear = new JButton("Clear Bill");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do You Want To Clear ?","Clear/Reset",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					txtCustomerName.setText(null);
					txtPhoneNo.setText(null);
					txtEmailId.setText(null);

					txtBathSoap.setText("0");
					txtFaceCream.setText("0");
					txtFaceWash.setText("0");
					txtHairSpray.setText("0");
					txtBodyLotion.setText("0");
					txtHairOil.setText("0");
					txtHairConditioner.setText("0");
					txtShampoo.setText("0");

					txtRice.setText("0");
					txtFoodOil.setText("0");
					txtDaal.setText("0");
					txtPohe.setText("0");
					txtSugar.setText("0");
					txtWheat.setText("0");
					txtTomato.setText("0");
					txtShezwanSauce.setText("0");

					txtCoke.setText("0");
					txtMaza.setText("0");
					txtTrimmer.setText("0");
					txtHairDryer.setText("0");
					txtWaterBottle.setText("0");
					txtAirPurifier.setText("0");
					txtPen.setText("0");
					txtNotebook.setText("0");

					txtSubtotal.setText("0.00");
					txtSGST.setText("0.00");
					txtCGST.setText("0.00");
					txtTotalTax.setText("0.00");
					txtTotalAmout.setText("0.00 Rs");

					chckbxBathSoap.setSelected(false);
					chckbxFaceCream.setSelected(false);
					chckbxFaceWash.setSelected(false);
					chckbxHairSpray.setSelected(false);
					chckbxBodyLotion.setSelected(false);
					chckbxHairOil.setSelected(false);
					chckbxShampoo.setSelected(false);
					chckbxHairConditioner.setSelected(false);

					chckbxRice.setSelected(false);
					chckbxFoodOil.setSelected(false);
					chckbxDaal.setSelected(false);
					chckbxPohe.setSelected(false);
					chckbxSugar.setSelected(false);
					chckbxWheat.setSelected(false);
					chckbxTomatoKetchup.setSelected(false);
					chckbxShezwanSauce.setSelected(false);

					chckbxCoke.setSelected(false);
					chckbxMaza.setSelected(false);
					chckbxTrimmer.setSelected(false);
					chckbxHairDryer.setSelected(false);
					chckbxWaterBottle.setSelected(false);
					chckbxAirPurifier.setSelected(false);
					chckbxPen.setSelected(false);
					chckbxNotebook.setSelected(false);	
					//		
					txtBathSoap.setEditable(false);
					txtFaceCream.setEditable(false);
					txtFaceWash.setEditable(false);
					txtHairSpray.setEditable(false);
					txtBodyLotion.setEditable(false);
					txtHairOil.setEditable(false);
					txtHairConditioner.setEditable(false);
					txtShampoo.setEditable(false);

					txtRice.setEditable(false);
					txtFoodOil.setEditable(false);
					txtDaal.setEditable(false);
					txtPohe.setEditable(false);
					txtSugar.setEditable(false);
					txtWheat.setEditable(false);
					txtTomato.setEditable(false);
					txtShezwanSauce.setEditable(false);

					txtCoke.setEditable(false);
					txtMaza.setEditable(false);
					txtTrimmer.setEditable(false);
					txtHairDryer.setEditable(false);
					txtWaterBottle.setEditable(false);
					txtAirPurifier.setEditable(false);
					txtPen.setEditable(false);
					txtNotebook.setEditable(false);

					//
					txtBathSoap.setEnabled(false);
					txtFaceCream.setEnabled(false);
					txtFaceWash.setEnabled(false);
					txtHairSpray.setEnabled(false);
					txtBodyLotion.setEnabled(false);
					txtHairOil.setEnabled(false);
					txtHairConditioner.setEnabled(false);
					txtShampoo.setEnabled(false);

					txtRice.setEnabled(false);
					txtFoodOil.setEnabled(false);
					txtPohe.setEnabled(false);
					txtDaal.setEnabled(false);
					txtSugar.setEnabled(false);
					txtWheat.setEnabled(false);
					txtTomato.setEnabled(false);
					txtShezwanSauce.setEnabled(false);

					txtCoke.setEnabled(false);
					txtMaza.setEnabled(false);
					txtTrimmer.setEnabled(false);
					txtHairDryer.setEnabled(false);
					txtWaterBottle.setEnabled(false);
					txtAirPurifier.setEnabled(false);
					txtPen.setEnabled(false);
					txtNotebook.setEnabled(false);

					txtSubtotal.setText("0.00");
					txtTotalTax.setText("0.00");
					txtTotalAmout.setText("0.00");
					txtCGST.setText("0.00");
					txtSGST.setText("0.00");
					txtReceipt.setText(null);


				}
			}
		});

		btnClear.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		btnClear.setBounds(853, 71, 141, 30);
		panel_2_3.add(btnClear);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(1149, 154, 362, 628);
		frmMymartCustomerBilling.getContentPane().add(scrollPane);

		txtReceipt = new JTextArea();
		txtReceipt.setEditable(false);
		scrollPane.setViewportView(txtReceipt);
		txtReceipt.setEnabled(true);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(11, 46, 64)));
		panel_4.setBackground(new Color(7, 68, 99));
		panel_4.setBounds(10, 786, 1502, 36);
		frmMymartCustomerBilling.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblCopyrights = new JLabel("Copyrights 2023 @ CUSTOMER BILLING SYSTEM");
		lblCopyrights.setBounds(560, 0, 381, 36);
		lblCopyrights.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopyrights.setForeground(Color.WHITE);
		lblCopyrights.setFont(new Font("Arial Black", Font.PLAIN, 14));
		panel_4.add(lblCopyrights);
	}
	public void calculateTotalAmount() {
		subtotalAmount=0;
		if(chckbxBathSoap.isSelected()) {
			subtotalAmount += (bathSoapPrice*Double.parseDouble(txtBathSoap.getText()));
		}
		if(chckbxFaceCream.isSelected()) {
			subtotalAmount += (faceCreamPrice*Double.parseDouble(txtFaceCream.getText()));
		}
		if(chckbxFaceWash.isSelected()) {
			subtotalAmount += (faceWashPrice*Double.parseDouble(txtFaceWash.getText()));
		}
		if(chckbxHairSpray.isSelected()) {
			subtotalAmount += (hairSprayPrice*Double.parseDouble(txtHairSpray.getText()));
		}
		if(chckbxBodyLotion.isSelected()) {
			subtotalAmount += (bodyLotionPrice*Double.parseDouble(txtBodyLotion.getText()));
		}
		if(chckbxHairOil.isSelected()) {
			subtotalAmount += (hairOilPrice*Double.parseDouble(txtHairOil.getText()));
		}
		if(chckbxShampoo.isSelected()) {
			subtotalAmount += (shampooPrice*Double.parseDouble(txtShampoo.getText()));
		}
		if(chckbxHairConditioner.isSelected()) {
			subtotalAmount += (hairConditionerPrice*Double.parseDouble(txtHairConditioner.getText()));
		}
		if(chckbxRice.isSelected()) {
			subtotalAmount += (ricePrice*Double.parseDouble(txtRice.getText()));
		}
		if(chckbxFoodOil.isSelected()) {
			subtotalAmount += (foodOilPrice*Double.parseDouble(txtFoodOil.getText()));
		}
		if(chckbxDaal.isSelected()) {
			subtotalAmount += (daalPrice*Double.parseDouble(txtDaal.getText()));
		}
		if(chckbxPohe.isSelected()) {
			subtotalAmount += (PohePrice*Double.parseDouble(txtPohe.getText()));
		}
		if(chckbxSugar.isSelected()) {
			subtotalAmount += (sugarPrice*Double.parseDouble(txtSugar.getText()));
		}
		if(chckbxWheat.isSelected()) {
			subtotalAmount += (wheatPrice*Double.parseDouble(txtWheat.getText()));
		}
		if(chckbxTomatoKetchup.isSelected()) {
			subtotalAmount += (tomatoKetchupPrice*Double.parseDouble(txtTomato.getText()));
		}
		if(chckbxShezwanSauce.isSelected()) {
			subtotalAmount += (shezwanSaucePrice*Double.parseDouble(txtShezwanSauce.getText()));
		}
		if(chckbxCoke.isSelected()) {
			subtotalAmount += (cokePrice*Double.parseDouble(txtCoke.getText()));
		}
		if(chckbxMaza.isSelected()) {
			subtotalAmount += (mazaPrice*Double.parseDouble(txtMaza.getText()));
		}
		if(chckbxTrimmer.isSelected()) {
			subtotalAmount += (trimmerPrice*Double.parseDouble(txtTrimmer.getText()));
		}
		if(chckbxHairDryer.isSelected()) {
			subtotalAmount += (hairDryerPrice*Double.parseDouble(txtHairDryer.getText()));
		}
		if(chckbxWaterBottle.isSelected()) {
			subtotalAmount += (waterBottlePrice*Double.parseDouble(txtWaterBottle.getText()));
		}
		if(chckbxAirPurifier.isSelected()) {
			subtotalAmount += (airPurifierPrice*Double.parseDouble(txtAirPurifier.getText()));
		}
		if(chckbxPen.isSelected()) {
			subtotalAmount += (penPrice*Double.parseDouble(txtPen.getText()));
		}
		if(chckbxNotebook.isSelected()) {
			subtotalAmount += (noteBookPrice*Double.parseDouble(txtNotebook.getText()));
		}
	}
	public void liveBillPrint() {
		if(subtotalAmount==0) {
			subtotalAmountStr="0.00";
			totalAmountStr="0.00";
			taxStr="0.00";
			totalTaxStr="0.00";	
		}
		else {
			decimalFormat = new DecimalFormat("#.00");
			subtotalAmountStr = decimalFormat.format(subtotalAmount);
			totalAmountStr = decimalFormat.format((subtotalAmount) + subtotalAmount*0.18);
			taxStr = decimalFormat.format(subtotalAmount*0.09);
			totalTaxStr = decimalFormat.format(subtotalAmount*0.18);
		}
		
		txtReceipt.setText(null);
		txtSubtotal.setText(subtotalAmountStr);
		txtCGST.setText(taxStr);
		txtSGST.setText(taxStr);
		txtTotalAmout.setText(totalAmountStr + " Rs");
		txtTotalTax.setText(totalTaxStr);
	}
}

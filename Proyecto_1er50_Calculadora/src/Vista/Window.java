package Vista;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Logica.Calculadora;
import Logica.Caracter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Window {

	private JFrame frame;
	private JPanel contentPane,panel1,nums,ops;
	private JTextArea textArea;
	public JButton num0,num00,num1,num2,num3,num4,num5,num6,num7,num8,num9,p,sum,res,mul,div,igual,ac,p1,p2;
	Calculadora cal;
	String numero1 = "";

	public Window() {
		cal = new Calculadora();
		frame = new JFrame();
		textArea = new JTextArea();
		initialize();
		frame.setVisible(true);
		actionsButtons();
		keyTiped();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		textArea.setText("");
		frame.setTitle("ejemplo Swing");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.lightGray);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		panel1 = new JPanel();
		panel1.setBounds(10,150,465,200);
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);
		contentPane.add(panel1);

		nums = new JPanel();
		nums.setBackground(Color.gray);
		nums.setBounds(10,10,250,180);
		nums.setLayout(new GridLayout(4,3));
		panel1.add(nums);

		ops=new JPanel();
		ops.setBackground(Color.cyan);
		ops.setBounds(280,10,165,180);
		ops.setLayout(null);
		panel1.add(ops);


		textArea.setText("");
		textArea.setBounds(10, 10, 460, 100);
		contentPane.add(textArea);

		num0 = new JButton("0");
		num00= new JButton("00");
		num1 = new JButton("1");
		num2 = new JButton("2");
		num3 = new JButton("3");
		num4 = new JButton("4");
		num5 = new JButton("5");
		num6 = new JButton("6");
		num7 = new JButton("7");
		num8 = new JButton("8");
		num9 = new JButton("9");
		p= new JButton(".");

		nums.add(num7);
		nums.add(num8);
		nums.add(num9);
		nums.add(num4);
		nums.add(num5);
		nums.add(num6);
		nums.add(num1);
		nums.add(num2);
		nums.add(num3);
		nums.add(num0);
		nums.add(num00);
		nums.add(p);

		sum = new JButton("+");
		sum.setBounds(0,0,55,60);
		res = new JButton("-");
		res.setBounds(55,0,55,60);
		mul = new JButton("*");
		mul.setBounds(110,0,55,60);
		div = new JButton("/");
		div.setBounds(0,60,55,60);
		p1 = new JButton("(");
		p1.setBounds(55,60,55,60);
		p2 =new JButton(")");
		p2.setBounds(110,60,55,60);
		igual = new JButton("=");
		igual.setBounds(55,120,110,60);
		ac = new JButton("AC");
		ac.setBounds(0,120,55,60);


		ops.add(sum);
		ops.add(res);
		ops.add(mul);
		ops.add(div);
		ops.add(p1);
		ops.add(p2);
		ops.add(igual);
		ops.add(ac);

	}

	public void actionsButtons() {
		num1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				numero1 += "1";
				textArea.setText(numero1);
			}
		});

		num2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "2";
				textArea.setText(numero1);

			}
		});

		num3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "3";
				textArea.setText(numero1);
			}
		});
		num4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "4";
				textArea.setText(numero1);

			}
		});

		num5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "5";
				textArea.setText(numero1);

			}
		});

		num6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "6";
				textArea.setText(numero1);

			}
		});

		num7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "7";
				textArea.setText(numero1);

			}
		});
		num8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "8";
				textArea.setText(numero1);

			}
		});
		num9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "9";
				textArea.setText(numero1);

			}
		});

		num0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "0";
				textArea.setText(numero1);

			}
		});

		num00.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "00";
				textArea.setText(numero1);
			}
		});

		ac.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				numero1 = " ";
				textArea.setText(" ");
			}
		});

		sum.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "+";
				textArea.setText(numero1);

			}
		});

		res.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "-";
				textArea.setText(numero1);

			}
		});
		mul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "*";
				textArea.setText(numero1);

			}
		});
		div.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "/";
				textArea.setText(numero1);

			}
		});
		p1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += "(";
				textArea.setText(numero1);
			}
		});
		p2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += ")";
				textArea.setText(numero1);
			}
		});
		p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 += ".";
				textArea.setText(numero1);
			}
		});
		
		igual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String op = textArea.getText();
				Caracter ex = new Caracter(op);
				String cadena;
				try {
					cadena = String.valueOf(cal.calcular(op));
					textArea.setText(cadena);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				
				}
				numero1 = "";
			}
		});
	}
	public void keyTiped(){
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();


				if(((caracter < '0') || (caracter > '9')) && (caracter != '\b') && (caracter != '+')&&(caracter!='-')&&(caracter != '*')&&(caracter != '/')&&(caracter!='.')&&(caracter!='(')&&(caracter!=')'))
				{
					e.consume();  
				}
			}
		});
	}
}

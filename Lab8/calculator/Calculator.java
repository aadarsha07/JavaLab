import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener
{
	int result,c;
	Panel p;
	GridLayout g;
	String s1,s2,s3,s4,s5;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,dot,plus,minus,div,mul,equal;
	TextField tfResult;
	Calculator(){
		super("Asmit Calculator");
		p = new Panel();
		setLayout(new FlowLayout());
		b1 = new Button("1");
		b1.addActionListener(this);
		b2 = new Button("2");
		b2.addActionListener(this);
		b3 = new Button("3");
		b3.addActionListener(this);
		b4 = new Button("4");
		b4.addActionListener(this);
		b5 = new Button("5");
		b5.addActionListener(this);
		b6 = new Button("6");
		b6.addActionListener(this);
		b7 = new Button("7");
		b7.addActionListener(this);
		b8 = new Button("8");
		b8.addActionListener(this);
		b9 = new Button("9");
		b9.addActionListener(this);
		b0 = new Button("0");
		b0.addActionListener(this);
		dot = new Button(".");
		dot.addActionListener(this);
		div = new Button("/");
		div.addActionListener(this);
		plus = new Button("+");
		plus.addActionListener(this);
		minus = new Button("-");
		minus.addActionListener(this);
		equal = new Button("=");
		equal.addActionListener(this);
		mul = new Button("*");
		mul.addActionListener(this);
		tfResult = new TextField(20);
		add(tfResult);
		g = new GridLayout(4,4,10,20);
        p.setLayout(g);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(plus);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(minus);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(mul);
		p.add(b0);
		p.add(dot);
		p.add(div);
		p.add(equal);

		add(p);
        setSize(400,400);
        setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			s3 = tfResult.getText();
			s4 = "1";
			s5 = s3 + s4;
			tfResult.setText(s5);
		}

		 if(e.getSource()==b2)
        {
            s3 = tfResult.getText();
            s4 = "2";
            s5 = s3+s4;
            tfResult.setText(s5);
        }
        if(e.getSource()==b3)
        {
            s3 = tfResult.getText();
            s4 = "3";
            s5 = s3+s4;
            tfResult.setText(s5);
        }if(e.getSource()==b4)
        {
            s3 = tfResult.getText();
            s4 = "4";
            s5 = s3+s4;
            tfResult.setText(s5);
        }
        if(e.getSource()==b5)
        {
            s3 = tfResult.getText();
            s4 = "5";
            s5 = s3+s4;
            tfResult.setText(s5);
        }
        if(e.getSource()==b6)
        {
            s3 = tfResult.getText();
            s4 = "6";
            s5 = s3+s4;
            tfResult.setText(s5);
        }
        if(e.getSource()==b7)
        {
            s3 = tfResult.getText();
            s4 = "7";
            s5 = s3+s4;
            tfResult.setText(s5);
        }
        if(e.getSource()==b8)
        {
            s3 = tfResult.getText();
            s4 = "8";
            s5 = s3+s4;
            tfResult.setText(s5);
        }
        if(e.getSource()==b9)
        {
            s3 = tfResult.getText();
            s4 = "9";
            s5 = s3+s4;
            tfResult.setText(s5);
        }
        if(e.getSource()==b0)
        {
            s3 = tfResult.getText();
            s4 = "0";
            s5 = s3+s4;
            tfResult.setText(s5);
        }

        if(e.getSource() == plus)
        {
        	s1 = tfResult.getText();
            tfResult.setText("");
            c=1;
        }

        if(e.getSource() == equal)
        {
        	s2 = tfResult.getText();
            if(c==1)
            {
                result = Integer.parseInt(s1)+Integer.parseInt(s2);
                tfResult.setText(String.valueOf(result));
            }
        }
	}
	public static void main(String[] args)
	{
		new Calculator();
	}
}


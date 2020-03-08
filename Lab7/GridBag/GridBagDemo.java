import java.awt.*;
// import java.awt.GridBagConstraints;

class GridBagDemo
{
	GridBagDemo()
	{
		Frame f = new Frame("Form");
		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		f.setLayout(new GridBagLayout());
		gbc.insets = new Insets(2, 2, 2, 2); 

		Label name = new Label("Names:");
		Label bio = new Label("Bio:");

		TextField nameF = new TextField();
		TextArea bioA = new TextArea();

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.PAGE_START;
		gbc.gridx = 1;
		gbc.gridx = 0;
		gbc.gridy = 0;
    	name.setBounds(10,10,120,100);
    	nameF.setBounds(50,50,120,120);
		f.add(name, gbc);
		gbc.gridx = 1;
		f.add(nameF, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;  
    	gbc.gridy = 1;
    	bio.setBounds(10,10,120,100);
    	bioA.setBounds(50,50,120,120);
		f.add(bio, gbc);
		gbc.gridx = 1;
		f.add(bioA, gbc);


		f.setSize(600,600);
		f.setVisible(true);
	}

	public static void main(String[] args)
	{
		new GridBagDemo();
	}
}
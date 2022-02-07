import javax.swing.JOptionPane;

public class Triangle {
	
	public static void main(String[] args) {
		String s1, s2, s3;
		s1 = JOptionPane.showInputDialog("Enter the first side of the triangle");
		s2 = JOptionPane.showInputDialog("Enter the second side of the triangle");
		s3 = JOptionPane.showInputDialog("Enter the third side of the triangle");
		System.out.println();
		
		Float s1num = Float.parseFloat(s1);
		Float s2num = Float.parseFloat(s2);
		Float s3num = Float.parseFloat(s3);
		
		if (s1num > s2num && s1num > s3num)
		{
			if (s2num + s3num > s1num) 
			{
				JOptionPane.showMessageDialog(null, "These 3 sides make a triangle!", "Result",JOptionPane.OK_OPTION);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "These 3 sides cannot make a triangle!", "Result",JOptionPane.OK_OPTION);
			}
		}
		else if (s2num > s3num && s2num > s1num)
		{
			if (s1num + s3num > s2num) 
			{
				JOptionPane.showMessageDialog(null, "These 3 sides make a triangle!", "Result",JOptionPane.OK_OPTION);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "These 3 sides cannot make a triangle!", "Result",JOptionPane.OK_OPTION);
			}
		}
		else if (s3num > s2num && s3num > s1num)
		{
			if (s2num + s1num > s3num) 
			{
				JOptionPane.showMessageDialog(null, "These 3 sides make a triangle!", "Result",JOptionPane.OK_OPTION);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "These 3 sides cannot make a triangle!", "Result",JOptionPane.OK_OPTION);
			}
		}

	}

}

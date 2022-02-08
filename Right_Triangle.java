import javax.swing.JOptionPane;

public class Right_Triangle {
	public static void main(String[] args) {
		String s1, s2, s3;
		s1 = JOptionPane.showInputDialog("Enter the first side of the triangle");
		s2 = JOptionPane.showInputDialog("Enter the second side of the triangle");
		s3 = JOptionPane.showInputDialog("Enter the third side of the triangle");
		System.out.println();
		
		Float s1num = Float.parseFloat(s1);
		Float s2num = Float.parseFloat(s2);
		Float s3num = Float.parseFloat(s3);
		
		Float sideSquared1 = s1num*s1num;
		Float sideSquared2 = s2num*s2num;
		Float sideSquared3 = s3num*s3num;
		
		if (s1num > s2num && s1num > s3num)
		{
			if (sideSquared2 + sideSquared3 == sideSquared1) 
			{
				
				JOptionPane.showMessageDialog(null, "These 3 sides make a Right triangle!", "Result",JOptionPane.OK_OPTION);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "These 3 sides cannot make a Right triangle!", "Result",JOptionPane.OK_OPTION);
			}
		}
		else if (s2num > s3num && s2num > s1num)
		{
			if (sideSquared1 + sideSquared3 == sideSquared2) 
			{
				JOptionPane.showMessageDialog(null, "These 3 sides make a Right triangle!", "Result",JOptionPane.OK_OPTION);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "These 3 sides cannot make a Right triangle!", "Result",JOptionPane.OK_OPTION);
			}
		}
		else if (s3num > s2num && s3num > s1num)
		{
			if (sideSquared2 + sideSquared1 == sideSquared3) 
			{
				JOptionPane.showMessageDialog(null, "These 3 sides make a Right triangle!", "Result",JOptionPane.OK_OPTION);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "These 3 sides cannot make a Right triangle!", "Result",JOptionPane.OK_OPTION);
			}
		}
		else//in case 2 or more of the biggest sides are the same
		{
			JOptionPane.showMessageDialog(null, "These 3 sides cannot make a Right triangle!", "Result",JOptionPane.OK_OPTION);
		}

	}

}
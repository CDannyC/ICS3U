import javax.swing.JOptionPane;

public class BMI_Calc {
	public static void main(String[] args) {
			Float BMI;
			int impOrMet = Integer.parseInt(JOptionPane.showInputDialog("Type 1 for imperial or 2 for metric to select the units of mesurement."));

			if (impOrMet == 1)
			{
				Float impWeight = Float.parseFloat(JOptionPane.showInputDialog("Please enter your weight(lbs)."));
				impWeight = impWeight*703;
				Float impHeight = Float.parseFloat(JOptionPane.showInputDialog("Please enter your height(in)."));
				impHeight = impHeight*impHeight;
				BMI = impWeight/impHeight;				
			}
			else
			{
				Float metWeight = Float.parseFloat(JOptionPane.showInputDialog("Please enter your weight(kg)."));
				Float metHeight = Float.parseFloat(JOptionPane.showInputDialog("Please enter your height(m)."));
				metHeight = metHeight*metHeight;
				BMI = metWeight/metHeight;
			}
			
			if (BMI < 15)
			{
				JOptionPane.showMessageDialog(null, "Your BMI is: " +  BMI + ". You Are starving yourself!", "Result",JOptionPane.OK_OPTION);
			}
			else if(BMI < 18)
			{
				JOptionPane.showMessageDialog(null, "Your BMI is: " +  BMI + ". You are underweight!", "Result",JOptionPane.OK_OPTION);
			}
			else if(BMI <= 25)
			{
				JOptionPane.showMessageDialog(null, "Your BMI is: " +  BMI + ". You are ideal!", "Result",JOptionPane.OK_OPTION);
			}
			else if(BMI <= 30)
			{
				JOptionPane.showMessageDialog(null, "Your BMI is: " +  BMI + ". You are overweight!", "Result",JOptionPane.OK_OPTION);
			}
			else if(BMI <= 40)
			{
				JOptionPane.showMessageDialog(null, "Your BMI is: " +  BMI + ". You are obese!", "Result",JOptionPane.OK_OPTION);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Your BMI is: " +  BMI + ". You are morbidly obese!", "Result",JOptionPane.OK_OPTION);
			}

	}
}

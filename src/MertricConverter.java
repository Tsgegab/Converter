
import javax.swing.JOptionPane;

public class MertricConverter{
    public static void main(String[] args){
        String inputValue = JOptionPane.showInputDialog(" Enter your height in centimeters ");
        double heightCm = Double.parseDouble(inputValue);
        double heightInInches = heightCm*0.39;
        int heightInFeet =(int) heightInInches/12;
        int heightRemainderInInches = (int) heightInInches%12;
        JOptionPane.showMessageDialog(null, " Your height is " + heightInInches + ' ' + "feet" + ' ' + heightRemainderInInches + "inches.");
    }
}




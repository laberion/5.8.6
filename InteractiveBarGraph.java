/** InteractiveBarGraph helps the user display six bar graphs of his own */
import javax.swing.*;
import java.awt.*;
public class InteractiveBarGraph{
   public static void main(String[] args){
      String title = JOptionPane.showInputDialog("Please type the title of your graph : ");
      
      String yAxisMax = JOptionPane.showInputDialog("Please type the value of the largest bar you will draw: ");
      int yAxisMaxValue = Integer.parseInt(yAxisMax);
      
      int bar1Value = Integer.parseInt(JOptionPane.showInputDialog("Please type the value of the first bar: "));
      String bar1Title = JOptionPane.showInputDialog("Please type the name of the first bar: ");
      
      int bar2Value = Integer.parseInt(JOptionPane.showInputDialog("Please type the value of the second bar: "));      
      String bar2Title = JOptionPane.showInputDialog("Please type the name of the second bar: ");
      
      int bar3Value = Integer.parseInt(JOptionPane.showInputDialog("Please type the value of the third bar: "));
      String bar3Title = JOptionPane.showInputDialog("Please type the name of the third bar: ");
           
      int bar4Value = Integer.parseInt(JOptionPane.showInputDialog("Please type the value of the fourth bar: "));
      String bar4Title = JOptionPane.showInputDialog("Please type the name of the fourth bar: ");

      int bar5Value = Integer.parseInt(JOptionPane.showInputDialog("Please type the value of the fifth bar: "));      
      String bar5Title = JOptionPane.showInputDialog("Please type the name of the fifth bar: ");

      int bar6Value = Integer.parseInt(JOptionPane.showInputDialog("Please type the value of the sixth bar: "));      
      String bar6Title = JOptionPane.showInputDialog("Please type the name of the sixth bar: ");
      
      BarGraphPlotter obj = new BarGraphPlotter(title);
      obj.yAxisMax(45 , 375 , yAxisMax , yAxisMaxValue);
      obj.setBar1(bar1Title , bar1Value , Color.red);
      obj.setBar2(bar2Title , bar2Value , Color.blue);
      obj.setBar3(bar3Title , bar3Value , Color.gray);
      obj.setBar4(bar4Title , bar4Value , Color.orange);
      obj.setBar5(bar5Title , bar5Value , Color.yellow);
      obj.setBar6(bar6Title , bar6Value , Color.green);   
   }
}
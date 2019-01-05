/** MakeChange makes change for a given amount of money 
  * and displays it as a stack of coins (bar graphs) */
import javax.swing.*;
import java.awt.*;
public class MakeChange {
 public static void main(String[] args){
 
 String userInput = JOptionPane.showInputDialog("How much money do you have?");
  double userMoney = (Double.parseDouble(userInput)) * 100;
  int money = (int)userMoney;
  int quarters = money / 25;
  money = money % 25;
  int dimes = money / 10;
  money = money % 10;
  int nickels = money / 5;
  money = money % 5;
  int pennies = money / 1;
  
  int yAxisMaxValue = Math.max(Math.max(quarters , dimes) , Math.max(nickels , pennies));
  String yAxisMax = yAxisMaxValue + "" ;
 
 BarGraphPlotter obj = new BarGraphPlotter("Change for " + userInput + " $");
      obj.yAxisMax(45 , 375 , yAxisMax , yAxisMaxValue);
      obj.setBar1("Quarters" , quarters , Color.red);
      obj.setBar2("Dimes" , dimes , Color.blue);
      obj.setBar3("Nickels" , nickels , Color.gray);
      obj.setBar4("pennies" , pennies , Color.orange);
      obj.setBar5("" , 0 , Color.yellow);
      obj.setBar6("" , 0 , Color.green); 
 }
}
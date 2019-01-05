/** BarGraphPlotter displays six bar graphs in a graphics windows */
import javax.swing.*;
import java.awt.*;
public class BarGraphPlotter extends JPanel {

   private String yAxisMax = ""; 
   private String bar1Title = "";
   private String bar2Title = "";
   private String bar3Title = "";
   private String bar4Title = "";
   private String bar5Title = "";
   private String bar6Title  = "";

   private int yAxisMaxValue , bar1Value , bar2Value , bar3Value , bar4Value , bar5Value , bar6Value ;
   private int pointX , pointY ;

   private int scale ;
   private int width = 600;
   private int height = 400; 
   
   private Color c1 ;
   private Color c2 ;
   private Color c3 ;
   private Color c4 ;
   private Color c5 ;
   private Color c6 ;

   public BarGraphPlotter(String title){
      JFrame frame = new JFrame();
      frame.getContentPane().add(this);
      frame.setSize(width,height);
      frame.setTitle(title);
      frame.setVisible(true);
   }
 
   public void yAxisMax(int x_pos , int y_pos ,String yAxisMax , int yAxisMaxValue){
      pointX = x_pos;
      pointY = y_pos;
      this.yAxisMax = yAxisMax;
      this.yAxisMaxValue = yAxisMaxValue ;
      scale = ( height - 35 ) / yAxisMaxValue;
   }
 
   public void setBar1 (String bar1Title , int bar1Value , Color c){
      this.bar1Title = bar1Title;
      this.bar1Value = bar1Value;
      c1 = c;
   }
 
   public void setBar2 (String bar2Title , int bar2Value , Color c){
      this.bar2Title = bar2Title;
      this.bar2Value = bar2Value;
      c2 = c ; 
   }
 
   public void setBar3 (String bar3Title , int bar3Value , Color c){
      this.bar3Title = bar3Title;
      this.bar3Value = bar3Value;
      c3 = c ; 
   }
 
   public void setBar4 (String bar4Title , int bar4Value , Color c){
      this.bar4Title = bar4Title;
      this.bar4Value = bar4Value; 
      c4 = c ;
   }
 
   public void setBar5 (String bar5Title , int bar5Value , Color c){
      this.bar5Title = bar5Title;
      this.bar5Value = bar5Value; 
      c5 = c ;
   }
 
   public void setBar6 (String bar6Title , int bar6Value , Color c){
      this.bar6Title = bar6Title;
      this.bar6Value = bar6Value; 
      c6 = c ;
   } 
 
   public void paintComponent(Graphics g){
      int barWidth = 75;
      int space = 15;
   
      g.setColor(Color.white);
      g.fillRect(0,0,width,height);
   
      g.setColor(Color.black);
      g.drawLine(pointX - 10 , pointY , pointX + 6*barWidth + 6*space , pointY);
      g.drawLine(pointX - 10 , pointY , pointX - 10 , pointY - (scale * yAxisMaxValue) - 10);
      
      g.drawRect(pointX , pointY - (bar1Value * scale) , barWidth , bar1Value * scale );
      g.drawRect(pointX + barWidth + space , pointY - (bar2Value * scale) , barWidth , bar2Value * scale );
      g.drawRect(pointX + 2*barWidth + 2*space , pointY - (bar3Value * scale) , barWidth , bar3Value * scale );
      g.drawRect(pointX + 3*barWidth + 3*space , pointY - (bar4Value * scale) , barWidth , bar4Value * scale );
      g.drawRect(pointX + 4*barWidth + 4*space , pointY - (bar5Value * scale) , barWidth , bar5Value * scale );
      g.drawRect(pointX + 5*barWidth + 5*space , pointY - (bar6Value * scale) , barWidth , bar6Value * scale );
   
      g.drawLine(pointX - 13 , pointY - (yAxisMaxValue * scale) , pointX - 7 , pointY - (yAxisMaxValue * scale));  
      g.drawLine(pointX - 13 , pointY - (bar1Value * scale) , pointX - 7 , pointY - (bar1Value * scale));  
      g.drawLine(pointX - 13 , pointY - (bar2Value * scale) , pointX - 7 , pointY - (bar2Value * scale));
      g.drawLine(pointX - 13 , pointY - (bar3Value * scale) , pointX - 7 , pointY - (bar3Value * scale));
      g.drawLine(pointX - 13 , pointY - (bar4Value * scale) , pointX - 7 , pointY - (bar4Value * scale));
      g.drawLine(pointX - 13 , pointY - (bar5Value * scale) , pointX - 7 , pointY - (bar5Value * scale));
      g.drawLine(pointX - 13 , pointY - (bar6Value * scale) , pointX - 7 , pointY - (bar6Value * scale));
   
      g.drawString( bar1Title , pointX + barWidth/5 , pointY + 15);
      g.drawString ( bar2Title , pointX + space + barWidth +  barWidth/5 , pointY + 15);   
      g.drawString ( bar3Title , pointX + 2*space + 2*barWidth +  barWidth/5 , pointY + 15);   
      g.drawString ( bar4Title , pointX + 3*space + 3*barWidth +  barWidth/5 , pointY + 15);
      g.drawString ( bar5Title , pointX + 4*space + 4*barWidth +  barWidth/5 , pointY + 15);   
      g.drawString ( bar6Title , pointX + 5*space + 5*barWidth +  barWidth/5 , pointY + 15);
      
      g.setFont(new Font("Arial", Font.PLAIN, 11));
      g.drawString("0", pointX - 30 , pointY + 5 );
      g.drawString(yAxisMaxValue + "" , pointX - 30 , pointY - (yAxisMaxValue * scale) + 7);
      g.drawString(bar1Value + "" , pointX - 30 , pointY - (bar1Value * scale) + 7); 
      g.drawString(bar2Value + "" , pointX - 30 , pointY - (bar2Value * scale) + 7); 
      g.drawString(bar3Value + "" , pointX - 30 , pointY - (bar3Value * scale) + 7); 
      g.drawString(bar4Value + "" , pointX - 30 , pointY - (bar4Value * scale) + 7);
      g.drawString(bar5Value + "" , pointX - 30 , pointY - (bar5Value * scale) + 7); 
      g.drawString(bar6Value + "" , pointX - 30 , pointY - (bar6Value * scale) + 7);
   
      g.setColor(c1);
      g.fillRect(pointX , pointY - (bar1Value * scale) , barWidth , bar1Value * scale );
   
      g.setColor(c2);
      g.fillRect(pointX + barWidth + space , pointY - (bar2Value * scale) , barWidth , bar2Value * scale );
   
      g.setColor(c3);
      g.fillRect(pointX + 2*barWidth + 2*space , pointY - (bar3Value * scale) , barWidth , bar3Value * scale );
   
      g.setColor(c4);
      g.fillRect(pointX + 3*barWidth + 3*space , pointY - (bar4Value * scale) , barWidth , bar4Value * scale ); 
      
      g.setColor(c5);
      g.fillRect(pointX + 4*barWidth + 4*space , pointY - (bar5Value * scale) , barWidth , bar5Value * scale ); 
      
      g.setColor(c6);
      g.fillRect(pointX + 5*barWidth + 5*space , pointY - (bar6Value * scale) , barWidth , bar6Value * scale ); 
   }
}
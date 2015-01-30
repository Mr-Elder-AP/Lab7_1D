/**
 * @(#)Commission.java
 *
 *
 * @author 
 * @version 1.00 2014/12/15
 */
import java.text.*;

public class Commission extends Hourly{

    public double totalSales = 0, commissionRate;
    
    private NumberFormat format = DecimalFormat.getCurrencyInstance();
    
    public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate)
   	{
      	super (eName, eAddress, ePhone, socSecNumber, rate);
    	
    	this.commissionRate = commissionRate;
  	}
    
    public void addSales(double sales){
    	this.totalSales += sales;
    }
    
    public double pay(){
    	double payment = super.pay();
    	
    	payment += totalSales * commissionRate;
    	
    	return payment;
    }
    
    public String toString(){
    	return super.toString() + "\nTotal Sales: " + format.format(totalSales);
    }
}
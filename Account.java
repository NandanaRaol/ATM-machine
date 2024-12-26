package project1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Account 
{
  private int CustomerNumber;
  private int pinNumber;
  private double checkingBalance=0;
  private double savingBalance=0;
  Scanner input =new Scanner(System.in);
  DecimalFormat moneyFormat=new DecimalFormat(" '$' ###,##0.00" );
  public int setCustomerNumber(int CustomerNumber)
  {
	  this.CustomerNumber=CustomerNumber;
	  return CustomerNumber;
  }
  public int getCustomerNumber()
  {
	  return CustomerNumber;
  }
  public int  setPinNumber(int pinNumber)
  {
	  this.pinNumber=pinNumber;
	  return pinNumber;
  }
  public int getPinNumber()
  {
	  return pinNumber;
  }
  public double getCheckingBalance()
  {
	  return checkingBalance;
  }
  public double getSavingBalance()
  {
	  return savingBalance;
  }
  public double calcCheckingWithdraw(double amount)
  {
	  checkingBalance=(checkingBalance-amount);
	  return checkingBalance;
  }
  public double calcSavingWithdraw(double amount)
  {
	  savingBalance=(savingBalance-amount);
	  return savingBalance;
  }
  public double calcCheckingDeposit(double amount)
  {
	  checkingBalance=(checkingBalance+amount);
	  return checkingBalance;
  }
  public double calSavingDeposit(double amount)
  {
	  savingBalance=(savingBalance+amount);
	  return savingBalance;
  }
  public void getCheckingWithdrawInput()
  { 
	  System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
	  System.out.println("Amount you want to withdraw from checking account");
	  double amount=input.nextDouble();
	  if((checkingBalance-amount)>=0)
	  {
		  calcCheckingWithdraw(amount);
		  System.out.println("New checking balance: "+moneyFormat.format(checkingBalance));
	  }
	  else
	  {
		  System.out.println("No sufficient amount"+"\n");
	  }
  }
  public void getCheckingDepositInput()
  {
	  System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
	  System.out.println("Amount you want to withdraw from checking account");
	  double amount=input.nextDouble();
	  if((checkingBalance+amount)>=0)
	  {
		  calcCheckingDeposit(amount);
		  System.out.println("New checking balance: "+moneyFormat.format(checkingBalance));
	  }
	  else
	  {
		  System.out.println("No sufficient amount"+"\n");
	  }
  }
  public void getsavingWithdrawInput()
  { 
	  System.out.println("Checking Account Balance: "+moneyFormat.format(savingBalance));
	  System.out.println("Amount you want to withdraw from savings account");
	  double amount=input.nextDouble();
	  if((savingBalance-amount)>=0)
	  {
		  calcSavingWithdraw(amount);
		  System.out.println("New checking balance: "+moneyFormat.format(savingBalance));
	  }
	  else
	  {
		  System.out.println("No sufficient amount"+"\n");
	  }
  }
  public void getsavingDepositInput()
  {
	  System.out.println("Checking Account Balance: "+moneyFormat.format(savingBalance));
	  System.out.println("Amount you want to withdraw from savings account");
	  double amount=input.nextDouble();
	  if((savingBalance+amount)>=0)
	  {
		  calSavingDeposit(amount);
		  System.out.println("New checking balance: "+moneyFormat.format(savingBalance));
	  }
	  else
	  {
		  System.out.println("No sufficient amount"+"\n");
	  } 
  }
}

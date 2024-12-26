package project1;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
public class OptionMenu extends Account
{
  Scanner menuInput =new Scanner(System.in);
  DecimalFormat moneyFormat=new DecimalFormat(" '$' ###,##0.00" );
  HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
  public void getLogin() throws IOException
  {
	  int x=1;
	  do{
		  try {
			  data.put(952141,191904);
			  data.put(989947,71976);
			  System.out.println("Welcome");
			  System.out.println("Enter customer Number");
			  setCustomerNumber(menuInput.nextInt());
			  System.out.print("Enter your PIN number:");
			  setPinNumber(menuInput.nextInt());
		  }
		  catch(Exception e)
		  {
			  System.out.println("\n"+"Invalid characher().only numbers"+"\n");
			  x=2;
		  }
		  int cn=getCustomerNumber();
		  int pn=getPinNumber();
		  if(data.containsKey(cn) && data.get(cn)==pn)
		  {
	        getAccountType();  
		  }
		  else
		  {
			  System.out.println("\n"+"Wrong customer number or pin number"+"\n");
		  }
	  }
		  while(x==1);  
  }
  public void getAccountType() 
  {
	System.out.println("Select the account type you want to access");
	System.out.println("(1) Checking account");
	System.out.println("(2) Saving account");
	System.out.println("(3) Exit");
	int selection=menuInput.nextInt();
	switch(selection)
	{
	case 1:
	   getChecking();
	   break;
	case 2:
		getSaving();
		break;
	case 3:
		System.out.println("Thankyou");
		break;
	default:
		System.out.println("Invalid choice");
		getAccountType();
	}
	
  }
public void getSaving() 
{
	System.out.println("(1) view balance");
	System.out.println("(2) withdraw amount");
	System.out.println("(3) deposit amount");
	System.out.println("(4) Exit");
	int selection=menuInput.nextInt();
	switch(selection)
	{
	case 1:
		System.out.println("saving account balance"+moneyFormat.format(getSavingBalance()));
		getAccountType();
		break;
	case 2:
		getsavingWithdrawInput();
		getAccountType();
		break;
	case 3:
		getsavingDepositInput();
		getAccountType();
		break;
	case 4:
		System.out.println("Thankyou");
		break;
	default:
		System.out.println("Invalid choice");
		getSaving();
	}
}
public void getChecking() 
{
	System.out.println("(1) view balance");
	System.out.println("(2) withdraw amount");
	System.out.println("(3) deposit amount");
	System.out.println("(4) Exit");
	int selection=menuInput.nextInt();
	switch(selection)
	{
	case 1:
		System.out.println("Checking account balance"+ moneyFormat.format(getCheckingBalance()));
		getAccountType();
		break;
	case 2:
		getCheckingWithdrawInput();
		getAccountType();
		break;
	case 3:
		getCheckingDepositInput();
		getAccountType();
		break;
	case 4:
		System.out.println("Thankyou");
		break;
	default:
		System.out.println("Invalid choice");
		getChecking();
	}
}
}

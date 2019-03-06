import java.io.*;  
class atm18
{
double currentBal =30000;     // amount available on account.
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
public void mainMenu()        //menu creation.
{
try
{
int selection;
System.out.print("\n\t\t********Welcome to the Automated Teller Machine!********\n");
System.out.println("\nSelect from the following menu options below:\n");
System.out.println("========================");
System.out.println("| [1]  Check Balance   |");
System.out.println("| [2]  Withdrawal      |");
System.out.println("| [3]  Deposit         |");
System.out.println("| [4]  Exit            |");
System.out.println("========================");
System.out.print("\nPlease select your option now: ");     
selection =Integer.parseInt(stdin.readLine());
switch (selection)    // case for election of any option from the menu.
{
case 1:
viewBalance();   // checking available balance
break;
case 2:
withdrawFunds();   //withdraw amount.
break;
case 3:
depositFunds();     //deposit amount.
break;
case 4:
System.out.println("Thank you for using ATM! \nGoodbye! \n");  //for exit.
}      //switch
}     //try
catch(Exception e){}
}    //main menu
public void viewBalance()    //checking available balance return to main menu.
{
int selection1;
System.out.println("You have selected Balance.\n");
System.out.println("\t-- Your Current Balance is:$ " + currentBal);
System.out.println("Return to main menu? \n [1] for YES \n");
System.out.println("If you are pressing any other key the you will exit from the * ATM * process!!!!\nSo press 1 to go to the Main Menu...");
try
{
selection1=Integer.parseInt(stdin.readLine());
switch (selection1)
{
case 1:
mainMenu();
break;
}     //switch
}    //try
catch(Exception e){}
}    //viewBalance
public void withdrawFunds()      //withdraw amount.
{
int withdrawSelection;
System.out.println("[1] -withdrawAmount");
System.out.println("[2] - MAIN MENU");
System.out.print("Please select your option now: ");
try
{
withdrawSelection =Integer.parseInt(stdin.readLine());
switch (withdrawSelection) 
{
case 1:
System.out.println("Amount to withdraw: ");
int wa=Integer.parseInt(stdin.readLine());
if(wa >=500)
accountWithdraw(wa);
mainMenu();
break;
case 2:
mainMenu();
break;
}      //switch
}      //try
catch(Exception e){}
}      //withdrawFunds
public void accountWithdraw(int withdrawFunds)     
{
currentBal = currentBal-withdrawFunds;
System.out.println("Please take your funds.");
System.out.println("Now your current Balance is:"+currentBal);    // to see the ciurrent balance.
}      //accountWithdraw
public void depositFunds()          //deposit amount.
{
int addSelection;
System.out.println("[1] -AddAmount");
System.out.println("[2] - MAIN MENU");
System.out.print("Please select your option now: ");
try
{
addSelection=Integer.parseInt(stdin.readLine());
switch (addSelection) 
{
case 1:
System.out.println("Amount to Deposite: ");
int da=Integer.parseInt(stdin.readLine());
if(da >=500)
accountAdd(da);
mainMenu();
break;
case 2:
mainMenu();
break;
}        //switch 
}        //try
catch(Exception e){}
}        //depositFunds
public void accountAdd (int depositFunds)
{
currentBal = (currentBal)+(depositFunds);
System.out.println("Thank you.");
System.out.println("Now your current Balance is:"+currentBal); 
}         //accountAdd
}        //atm18

class ATM                   //main class
{
public static void main(String[] args) 
{
atm18 m=new atm18();
m.mainMenu();
}
}

package implementation;

import Utility.Helper;

public class Implementation extends Helper{
	
	public void launchBrowser(String Browser){
		println("User Launches : " + Browser);		
	}
	
	public void enterCredentials(String UserName, String Password){
		println("User enters UserName : " + UserName + " & Password : " + Password);		
	}
	
	public void clicksLoginButton(){
		println("User clicks on Login Button");
	}
	
	public void viewDashboard(){
		println("User is able to view Dashboard Successfully :-) ");
	}

}

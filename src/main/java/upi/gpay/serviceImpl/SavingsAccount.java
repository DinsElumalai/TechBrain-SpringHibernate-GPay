package upi.gpay.serviceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import upi.gpay.service.Account;

@Component
@Scope("singleton")
public class SavingsAccount implements Account
{

	@Value("Savings")
	private String accountType;

	@Override
	public String toString() {
		return "Account [accountType=" + accountType + "]";
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void showAccountType() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

	public void addAccount() {
		// TODO Auto-generated method stub
		System.out.println("Savings Account Added");
	}

	public String removeAccount() {
		// TODO Auto-generated method stub
		return "Savings Account Removed";
	}
	
	
}

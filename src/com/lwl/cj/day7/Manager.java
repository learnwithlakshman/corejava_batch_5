package com.lwl.cj.day7;

public class Manager {
		public static void main(String[] args) {
			Account acc1 = new SavingsAccount(1001, "Tanvi", 100000);
			Account acc2 = new CurrentAccount(1002, "Dhatri", 1000000);
			Account ac_2= new SavingsAccount(1091, "Manoj", 600000);
			Account acc4 = new CurrentAccount(1092, "Sai", 7000000);
			Account ac_1 = new SavingsAccount(1113, "Rama Krishna", 300000);
			Account acc6 = new CurrentAccount(1122, "Rani", 4000000);
			
			
			Account[] arr = {acc4,ac_1,acc6,acc1,acc2,ac_2};
			
			for(Account acc:arr) {
				acc.showInfo();
				System.out.println("---------------------------------");
			}
			// Count the number of Saving accounts and Current accounts
			int s_count = 0;
			int c_count = 0;
			double s_t_amount = 0;
			double c_t_amount = 0;
			
			for(Account acc:arr) {
				if(acc instanceof SavingsAccount) {
					s_count++;
					s_t_amount += acc.balance;
				}else if(acc instanceof CurrentAccount) {
					c_count++;
					c_t_amount += acc.balance;
				}
			}
			
			System.out.println("Total Savings account count:"+s_count+" and balance :"+s_t_amount);
			System.out.println("Total Current account count:"+c_count+" and balance :"+c_t_amount);
		}
}

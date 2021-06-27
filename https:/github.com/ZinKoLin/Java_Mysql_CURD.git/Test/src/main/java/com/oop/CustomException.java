package com.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Product{
	
	private int id;
	private String name;
	private double price;
}

@Getter
@Setter
class CreditCard{
	private double balance;
}


class Person{
	
	private CreditCard crd;
	
	public Person(CreditCard crd) {
		
		this.crd = crd;
		
	};
	
	public void buy(Product product) throws BalancenotEnoughExcetpion{
		
		
		
		if(crd.getBalance()<product.getPrice()) {
			
			throw new BalancenotEnoughExcetpion("Ypur balance is not Enough");
		}
		
		else {
			System.out.println("You bought"+product.getName());
		}
		
	}
	
}

class BalancenotEnoughExcetpion extends Exception{
	

	public BalancenotEnoughExcetpion(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}


public class CustomException {

	public static void main(String[] args) {
		
		Product pd = new Product();
		pd.setId(1);
		pd.setName("Mouse");
		pd.setPrice(30);
		
		
		CreditCard crd = new CreditCard();
		crd.setBalance(50);
		
		Person p = new Person(crd);
		try {
			p.buy(pd);
		}catch(BalancenotEnoughExcetpion e) {
			e.printStackTrace();
		}
		
		

	}

}
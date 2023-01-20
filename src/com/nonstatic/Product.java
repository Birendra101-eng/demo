package com.nonstatic;

public class Product {

	
		// non-static variable
		int pno;
		String pname;
		int qty;
		int price;
		//non-static Method
		void display()
		{
			pno=100;
			pname="tv";
			qty=10;
			price=2500;
			System.out.println("pno+\t"+pname+"qty+\t"+price);
		}
     public static void main(String[]args) {
    	 
Product pro=new Product();
System.out.println(pro.pno+"\t"+pro.pname+"\t"+pro.qty+"\t"+pro.price);
     }
	}


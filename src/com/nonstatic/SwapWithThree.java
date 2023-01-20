package com.nonstatic;

public class SwapWithThree {

	int fno = 100;
	int sno = 200;

	void swap() {
		System.out.println("Before Swapping : ");

		System.out.println("Fno : " + fno + "\t" + "Sno : " + sno);

		// swapping(Interchanging)

		fno = fno + sno;// 100+200=300
		sno = fno - sno;// 300-200=100
		fno = fno - sno;// 300-100=200

		System.out.println("After Swapping : ");

		System.out.println("Fno : " + fno + "\t" + "Sno : " + sno);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwapWithThree s = new SwapWithThree();
		s.swap();

	}

}
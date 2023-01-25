package demo;

public class LeapYearEx {

	public static void main(String[] args) {
		 LeapYearEx l=new LeapYearEx();
		 l.leapYear();
	}

	public static void leapYear() {
		
		int year=2016;
		boolean leap=false;
		if((year%4==0) && (year%100!=0)|| (year%400==0))
		leap=true;
		if(leap)
		System.out.println("Given Year is leap year : "+year);
		else
		System.out.println("Given Year is Not leap year : "+year);
	}

}

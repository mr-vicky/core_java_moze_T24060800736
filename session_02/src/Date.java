
public class Date {
	private int dd, mm, yy; 
	public void initDate() {
		dd = mm = yy = 1;
	}
	
	
	public void setDate() {
		dd = 28;
		mm = 2;
		yy = 2024;
	}
	
	public void displayDate() {
		System.out.println("Date = [ " + dd + "/" + mm + "/" + yy + "]");
	}
	public static void  main(String[] args) {
//		Date d; //reference variable
//		d = new Date(); // Object creation
		Date d = new Date();
		//.(dot) operator
		d.initDate();
		d.displayDate();
		d.setDate();
		d.displayDate();	}
}

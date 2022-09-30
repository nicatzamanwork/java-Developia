package operatorlar;

public class MentiqiOperatorlar {

	public static void main(String[] args) {
		boolean intervuyaIcaze=false;
		boolean hasCar=false;
		boolean hasHome=true;
		
		if(hasCar && hasHome) {
			intervuyaIcaze=true;
		}
		if(intervuyaIcaze){
			System.out.println("Enter");		
		}else {
			System.out.println("Out");
		}
		
	}
}

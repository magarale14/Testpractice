
public class StaticMain {
	public static void main(String args[]){
		
		Staticclass member1 = new Staticclass("Tina","Subba");
		Staticclass member2 = new Staticclass("Tina","Limbu");
				
		System.out.println(Staticclass.getMembers());
	}
}

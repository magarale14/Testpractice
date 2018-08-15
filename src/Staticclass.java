/* This program is to create objects and learn why static is used for.
 * Two classes Static and MainStatic are created to call firstname, lastname and static members.
 * Author: Reeta
 * Date: 8/14/18
 */
public class Staticclass{
	
	private String firstname;
	private String lastname;
	private static int members = 0;
	
	//constructing Constructors
	public Staticclass (String firstname, String lastname){
	this.firstname = firstname;
	this.lastname = lastname;
	members++;
	
	System.out.println("Costructors for %s %s, members in the club: %d\n");
	}
	
	public String getFirstname(){
		return firstname;
	}
	
    public String getLastname(){
		return firstname;
    }
    
    public static int getMembers(){
		return members;
    }
}


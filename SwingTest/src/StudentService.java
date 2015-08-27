
public class StudentService {
	
	
	public boolean saveUser(String unsme,String password){
		boolean chk=false;
		if(unsme.equalsIgnoreCase("Admin")&&password.equalsIgnoreCase("123"))
			chk=true;
		return chk;
	}
	

}

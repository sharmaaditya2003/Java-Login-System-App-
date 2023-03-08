import java.util.*;
public class IdandPass {
	HashMap<String,String> logininfo= new HashMap<String,String>();
	IdandPass(){
		logininfo.put("Aditya", "sharma2003");
		logininfo.put("Prasad", "prasad2003");
		logininfo.put("Harshit", "harsh2190");
		logininfo.put("Patro","patro,");
		
	}
		protected HashMap getLoginInfo(){
			return logininfo;
		}
	
}

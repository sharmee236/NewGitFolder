package firstFolder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CodeForGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());
		
		//format mm/dd/yyyy HH:MM:SS
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy HH:mm:SS");
		System.out.println(sdf.format(d));
		System.out.println("checkin test for git");
		
		//www.tutorialspoint.com/java/java_date_time.htm
		
		


	}

}

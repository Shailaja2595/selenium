package selenium_programming;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ToString_Demo {

	public static void main(String[] args) {
		
       Date d = new Date();
       System.out.println(d);
       
       SimpleDateFormat s =new SimpleDateFormat();
     String k = s.format(d);
     System.out.println(k);

	}

}

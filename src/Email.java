import java.util.Date;

public class Email {
	public String from, subject, text;
	public Date date;
	public Priority priority;
	
	public Email(String f, String s, String t, Date d, Priority p) {
		from =f; subject = s; text = t; date = d; priority = p;
	}
}



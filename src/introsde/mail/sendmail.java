package introsde.mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class sendmail {
	public static void main(String[] args) {
		SendMail.sendmail("kingokongo46@hotmail.it", "Oggetto","contenuto");
	}
}

package introsde.mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
public class SendMail{

		final static String username = "noreplyhcs@gmail.com";
		final static String senderName = "Health Care Service";
		final static String sec = "healthcaresystem99";
		static InternetAddress address = null;

		public static int sendmail(String dest, String mailObject, String mailContent){
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			
			Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, sec);
			}
		  });

		try {
			Message message = new MimeMessage(session);
			try{
				address = new InternetAddress(username,senderName);
			} catch (UnsupportedEncodingException e) {
					throw new RuntimeException();
			}
			message.setFrom(address);
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(dest));
			message.setSubject(mailObject);
			message.setText(mailContent);
			Transport.send(message);
			System.out.println("Mail Sent to " + dest);
			return 0;
		} catch (MessagingException e) {
			System.out.println("[ !!!ERROR!!! ] MAIL NOT SENT ");
			return 1;
			//	throw new RuntimeException(e);
			}
		}
	}

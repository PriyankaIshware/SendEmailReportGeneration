import java.text.SimpleDateFormat;
import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class sendEmail {

public static void main(String [] args) {    
 
   String to = "akash.shivhare@adp.com";
   String from = "noreply@adp.com";
   String host = "mailrelay.nj.adp.com";
   Properties properties = System.getProperties();
   properties.setProperty("mail.smtp.host", host);
   Session session = Session.getDefaultInstance(properties);

   try {
 
      MimeMessage message = new MimeMessage(session);
      message.setFrom(new InternetAddress(from));
      message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        Date d1=new Date();
      SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");

  //  System.out.println("Current Date: " + ft.format(dNow));
    	      
  //  message.setSubject("Smoke Test Date:" + d1.toString());
      message.setSubject("Smoke Test Result:" + ft.format(d1));

  
    message.setText("This is actual message");
  //    message.setContent("<h1>HTML Message</h1>", "text/html");

      // Send message
      Transport.send(message);
      System.out.println("Sent message successfully....");
   }catch (MessagingException mex) {
      mex.printStackTrace();
   }
   

}

public void addRecipients(Message.RecipientType type, Address[] addresses) throws MessagingException
{
	
	}
}

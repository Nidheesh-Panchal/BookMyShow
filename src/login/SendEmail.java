package login;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.activation.*;


public class SendEmail 
{    

public void registered(String receiver,String use) {   

    final String username = "cineclick@yahoo.com"; //ur email
    final String password = "Cineklik2018";
    //final String receiver = "2016ucp1008@mnit.ac.in";

    Properties props = new Properties();
    /*props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");*/
                
                props.put("mail.smtp.host", "plus.smtp.mail.yahoo.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");




    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }                            
});

    try {
        
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));//ur email
        message.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse(receiver));//u will send to
        message.setSubject("Welcome to CineClick!");    
        message.setText("\n Welcome to CineClick- the easiest way to discover the universe of movies. CineClick strives to provide a seamless movie booking experience so that you never miss out on your favorite movies. \n\n Now all the latest movies are just a click away! \n Your username is /username/ \n Thank you for registering");
       Transport.send(message);
        
        /*MimeBodyPart messageBodyPart = new MimeBodyPart();
        Multipart multipart = new MimeMultipart();*/


     
     
    //attached 1 --------------------------------------------
//        String file = "path of file";
//        String fileName = "AnyName1";
//    messageBodyPart = new MimeBodyPart();   
//    DataSource source = new FileDataSource(file);      
//    messageBodyPart.setDataHandler(new DataHandler(source));
//    messageBodyPart.setFileName(fileName);
//    multipart.addBodyPart(messageBodyPart);
    
    //>>>>>>>>    
       // message.setContent(multipart);      
        //System.out.println("sending");
        
       // System.out.println("Done");  

            
}

    catch (MessagingException e) 
    {
        JOptionPane.showMessageDialog(null,e);
    }
  }
public void booking(String receiver) {   

    final String username = " cineclick@yahoo.com "; //ur email
    final String password = " Cineklik2018";
    //final String receiver = "2016ucp1008@mnit.ac.in";

    Properties props = new Properties();
    
                
                props.put("mail.smtp.host", "plus.smtp.mail.yahoo.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");




    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }                            
});

    try {
        
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));//ur email
        message.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse(receiver));//u will send to
        message.setSubject("Movie booking confirmed");    
        message.setText("Dear /username/, your movie booking was successful. Your movie details are as follows \n /moviename/ at /time/ on /date/ at /cinemahall/."
                + " We hope you enjoy your movie.\n ");
       Transport.send(message);
        
         

            
}

    catch (MessagingException e) 
    {
        JOptionPane.showMessageDialog(null,e);
    }
  }
public void cancelled(String receiver) {   

    final String username = " cineclick@yahoo.com "; //ur email
    final String password = " Cineklik2018";
    //final String receiver = "2016ucp1008@mnit.ac.in";

    Properties props = new Properties();
    
                
                props.put("mail.smtp.host", "plus.smtp.mail.yahoo.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");




    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }                            
});

    try {
        
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));//ur email
        message.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse(receiver));//u will send to
        message.setSubject("Movie booking cancellation");    
        message.setText("Dear /username/, your booking cancellation has been processed for /moviename/ at /time/ on /date/ at /cinemahall/. "
                + "The refund will reflect in your account shortly .\n ");
       Transport.send(message);
        
        

            
}

    catch (MessagingException e) 
    {
        JOptionPane.showMessageDialog(null,e);
    }
  }
public void alert(String receiver) {   

    final String username = " cineclick@yahoo.com "; //ur email
    final String password = " Cineklik2018";
    //final String receiver = "2016ucp1008@mnit.ac.in";

    Properties props = new Properties();
                
                props.put("mail.smtp.host", "plus.smtp.mail.yahoo.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");




    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }                            
});

    try {
        
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));//ur email
        message.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse(receiver));//u will send to
        message.setSubject("Clash in movie bookings");    
        message.setText("Dear /username/, \n \n  This is an auto generated email from CineClick. /n We have noticed that you’ve made bookings for different movies at the same time. You have made bookings for /moviename/ at /time/ on /date/ at /cinemahall/. \n If you wish to change your booking kindly log in to your account. If you do not wish to make any changes, kindly ignore this email. Thank you.");
       Transport.send(message);
        
         

            
}

    catch (MessagingException e) 
    {
        JOptionPane.showMessageDialog(null,e);
    }
  }
public void forgetpassword(String receiver) {   

    final String username = " cineclick@yahoo.com "; //ur email
    final String password = " Cineklik2018";
    //final String receiver = "2016ucp1008@mnit.ac.in";

    Properties props = new Properties();
                
                props.put("mail.smtp.host", "plus.smtp.mail.yahoo.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");




    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }                            
});

    try {
        
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));//ur email
        message.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse(receiver));//u will send to
        message.setSubject("Reset password");    
        message.setText("Dear /username/, \n \n "
                + " This is an auto generated email from CineClick. /n"
                + " We have logged a request to change your account password."
                + " If this request was not made by you,then kindly secure your account by updating your account settings");
       Transport.send(message);
         
         

            
}

    catch (MessagingException e) 
    {
        JOptionPane.showMessageDialog(null,e);
    }
  }
}

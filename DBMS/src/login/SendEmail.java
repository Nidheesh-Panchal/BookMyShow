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

public void registered(String receiver) {   

    final String username = "nilu.1999@yahoo.com"; //ur email
    final String password = "942902446013";
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
        message.setSubject("Welcome to \"whatever the name is\"");    
        message.setText("Hi,\n Get ready to get spam emails now. We are always closed to any feedback that you give.\nThank you");
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
}
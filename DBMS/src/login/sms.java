///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package login;
//
//import com.twilio.sdk.TwilioRestClient;
//import com.twilio.sdk.TwilioRestException;
//import com.twilio.sdk.resource.factory.SmsFactory;
//import com.twilio.sdk.resource.instance.Account;
//import java.util.*;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author nilu1
// */
//public class sms {
//    //SMS sms=new SMS();
//    //sms.SendSMS("nilu_1999","942902446013","This is what spam feels like","919983908530","https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0")
//    public void send() { 
//        try{
//            TwilioRestClient sms= new TwilioRestClient(System.getenv("TWILIO_ACCOUNT_SID"),System.getenv("TWILIO_AUTH_TOKEN"));
//    Account account=sms.getAccount();
//    SmsFactory factory=account.getSmsFactory();
//    HashMap<String,String> message=new HashMap<>();
//    message.put("To","+917874390520");
//    message.put("From","+918239049138");
//    message.put("Body","Hello");
//    
//    factory.create(message);
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null,e);
//        }
//    
//    }
//}

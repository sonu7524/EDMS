import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMail {
    public static void main(String[] args) {
        String recipent = "sonudaryani135@gmail.com";
        String msg = OTP.generateOTP(6);
        final String sender = "sonudaryani4@gmail.com";
        final String password = "yvdcbtpuiegyngeu";


        String host="smtp.gmail.com";

        Properties properties = System.getProperties();
        System.out.println("PROPERTIES "+properties);

        //host set
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.socketFactory.port", "587");
        properties.put("mail.smtp.auth","true");


        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender,password);
            }
        });
        session.setDebug(true);
        MimeMessage message = new MimeMessage(session);
        try{
            message.setFrom();
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(recipent));
            message.setSubject("OTP FOR LOGIN");
            message.setText("Dear User, \nYour one time password for login: "+msg);
            Transport.send(message);

        }
        catch (Exception e) {e.printStackTrace();}
    }
}

//    public static void main(String[] args) {
//        String message="Dear User, your one-time password is mentioned below:";
//        String subject = "OTP for login";
//        String sender = "sonudaryani4@gmail.com";
//        sendEmail("sonudaryani135@gmail.com", sender, subject, message);
//    }
//    // Include below 4 references in your program;
//
//
//}

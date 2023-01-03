import java.util.Properties;

import javax.mail.*;

import javax.mail.internet.*;

import javax.activation.*;

public class SendMail {

    public static void sendEmail(String recipient,String sender, String subject, String msg) {

        String host = "smtp.gmail.com";
        //get system properties
        Properties properties = System.getProperties();

        //host set
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
        // strp 1: to get the session pbject...
        Session session =  Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("******","******");
            }
        });

        session.setDebug(true);
        //step 2: compose the message[text, media]
        MimeMessage m = new MimeMessage(session);
        try {
            //from email
            m.setFrom(sender);
            //adding recipent to message
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            //adding subject
            m.setSubject(subject);
            //adding text to message
            m.setText(msg);
            //send the message using transport class
            Transport.send(m);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String message="Dear User, your one-time password is mentioned below:";
        String subject = "OTP for login";
        String sender = "sonudaryani4@gmail.com";
        sendEmail("sonudaryani135@gmail.com", sender, subject, message);
    }

}

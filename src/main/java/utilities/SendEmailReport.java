package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailReport {

	public static void main(String[] args) throws MalformedURLException, EmailException {

		
		
		  HtmlEmail email = new HtmlEmail();
		  
		  email.setHostName("smtp.gmail.com");
		  email.setAuthenticator(new DefaultAuthenticator("rahilshaikh20@gmail.com", "Rehana@22"));
		  
		  email.addTo("rahilshaikh20@gmail.com","Rahil Ashraf");
		  email.addTo("rahilshaikh595@yahoo.com","Rahil AS");
		  email.addTo("rahil.shaikh@dieboldnixdorf.com","Rahil Shaikh");
		  
		  email.setSSLOnConnect(true);
		  email.setFrom("Report@rahiloptics.org", "System Email ");
		  email.setSubject("Test email with inline image");
		  
		  // embed the image and get the content id
		  URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif"); String cid =
		  email.embed(url, "Apache logo");
		  
		  // set the html message
		  email.setHtmlMsg("<html>The apache logo - <img src=\"cid:"+cid+"\"></html>");
		  
		  // set the alternative message
		  email.setTextMsg("Your email client does not support HTML messages");
		  
		  // send the email 
		  email.send();
		  
		  System.out.println("****Email sent******");
		 
		  
		 /*
		
		  System.out.println("****Test Started******");
		  
		  Email email = new SimpleEmail(); email.setHostName("smtp.gmail.com");
		  email.setSmtpPort(465); 
		  email.setAuthenticator(new DefaultAuthenticator("rahilshaikh20@gmail.com", "Rehana@22"));
		  email.setSSLOnConnect(true);
		  email.setFrom("system@rahiloptiks.com");
		  email.setSubject("Hello Rahil"); 
		  email.setMsg("This is a test mail ... :-)");
		  email.addTo("rahilshaikh20@gmail.com");
		  email.addTo("rahilshaikh595@yahoo.com"); 
		  email.send();
		  
		  System.out.println("****Email sent******");
		 */
	}

}

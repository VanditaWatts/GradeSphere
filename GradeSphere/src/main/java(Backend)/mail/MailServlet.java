package mail;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/MailServlet")
public class MailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MailServlet() {
        super();
    }
    
    
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String text = "hello admin";
		SendMail obj = new SendMail();
//		boolean success = obj.send("jjj", text);
//		if(success) System.out.println("mail sent successfully.");
//		else System.out.println("Mail not sent.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

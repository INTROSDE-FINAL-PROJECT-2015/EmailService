package introsde.mail.ws;
import javax.jws.WebService;
import introsde.mail.SendMail;

//Service Implementation
@WebService(endpointInterface = "introsde.mail.ws.MailService")
public class MailServiceImpl implements MailService{
    @Override
    public int sendMail(String dest, String mailObject, String mailContent) {
        return SendMail.sendmail(dest,mailObject,mailContent);
    }
}

package pl.macbabicki.email;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService implements EmailSender{
    private final JavaMailSender mailSender;
    private final static Logger LOGGER= LoggerFactory.getLogger(EmailService.class);


    @Override
    @Async
    public void send(String to, String email) {
        try{
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
            helper.setText(email, true);
            helper.setTo(to);
            helper.setSubject("confirm your email");
            helper.setFrom("macbabicki@gmail.com");
        }catch (MessagingException e){
            LOGGER.error("failed to send email", e);
            throw new IllegalStateException("fialed to send email");
        }
    }
}

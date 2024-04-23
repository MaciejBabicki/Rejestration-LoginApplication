package pl.macbabicki.security;

import com.password4j.Password;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class PasswordEncoder {
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Value("example")
    private String pepper;


    public String encode(String text) {
        return Password
                .hash(text)
                .addPepper(pepper)
                .withBcrypt()
                .getResult();
    }
}

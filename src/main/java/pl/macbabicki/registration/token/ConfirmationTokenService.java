package pl.macbabicki.registration.token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {
    private final ConfigurationTokenRepository configurationTokenRepository;

    public void saveConfirmationToken(ConfirmationToken confirmationToken){
        configurationTokenRepository.save(confirmationToken);
    }
    public Optional<ConfirmationToken> getToken(String token){
        return configurationTokenRepository.findByToken(token);
    }

    public void setConfirmedAt(String token) {
        configurationTokenRepository.updateConfirmedAt(
                token, LocalDateTime.now());

    }
}

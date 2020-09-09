package br.com.campingfire.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@Getter
@Setter
public class LoginRequest {

    private String email;
    private String password;

    public UsernamePasswordAuthenticationToken generateAuthenticationToken() {

        return new UsernamePasswordAuthenticationToken(this.email, this.password);

    }

}

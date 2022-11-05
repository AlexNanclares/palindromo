package co.com.service.palindromo.security.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UsuarioDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Map<String, String> usuarios = Map.of(
                "myuserone", "USER",
                "myusertwo", "USER"
        );
        var rol = usuarios.get(username);
        if (rol != null) {
            User.UserBuilder userBuilder = User.withUsername(username);

            String encryptedPassword = "$2a$10$cQ5HDVrhkS9LPrKoo6i8wel/fWYz10K4WBSkK1rGCVeB5OSwcZkGm";
            userBuilder.password(encryptedPassword).roles(rol);
            return userBuilder.build();
        } else {
            throw new UsernameNotFoundException(username);
        }

    }
}

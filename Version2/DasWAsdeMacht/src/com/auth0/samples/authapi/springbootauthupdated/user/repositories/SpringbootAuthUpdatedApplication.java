package com.auth0.samples.authapi.springbootauthupdated.user.repositories;
import com.auth0.samples.authapi.springbootauthupdated.user.mainly.*;

// ... other imports
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringbootAuthUpdatedApplication {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // ... main method definition
}

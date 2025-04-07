package com.Bcript.sesi.services.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig 
{

    @Bean
    public PasswordEncoder passwordEncoder()  
    {
        return new BCryptPasswordEncoder(); // encoder
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        http.csrf(csrf -> csrf.disable()); // desliga CSRF
        http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll()); // libera tudo
        return http.build(); // finaliza
    }
    
}


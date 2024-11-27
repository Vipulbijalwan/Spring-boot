package com.example.Spring2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    private static final String[] WHITELIST = {

            "/",

            "/logIn",

            "/register",

            "/css/**",

            "/scss/**",

            "/vendor/**",

            "/img/**",

            "/js/**"

    };
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {


                http
                .authorizeHttpRequests((authz) -> authz
                        .requestMatchers(WHITELIST)
                        .permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/logIn")
                        .loginProcessingUrl("/logIn")
                        .usernameParameter("email")
                        .passwordParameter("password")
                        .defaultSuccessUrl("/", true)
                        .failureUrl("/logIn?error")
                ).logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/logout?success")
                );

        return http.build();
    }
//
//    @Bean
//    public UserDetailsService userDetailsService(){
//        return new InMemoryUserDetailsManager(){
//
//        }
//    }
}

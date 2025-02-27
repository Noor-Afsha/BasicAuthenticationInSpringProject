package com.example.practiceauthentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private UserDetailsService userDetailsService;
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("Noor").password("Password@123").roles("ADMIN");
//        auth.inMemoryAuthentication().withUser("Sangeetha").password("Password").roles("USER");
//    }
//security for all api
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
//    }


    //security based on url
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/with-auth/**").fullyAuthenticated().and().httpBasic();
//    }

    //security based on the role
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/with-auth/**").hasRole("ADMIN").and().httpBasic();
//    }
//    @Bean
//    public static NoOpPasswordEncoder noEncode() {
//        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable();
    }

    @Bean
    public BCryptPasswordEncoder encodePWD() {
        return new BCryptPasswordEncoder();
    }
}

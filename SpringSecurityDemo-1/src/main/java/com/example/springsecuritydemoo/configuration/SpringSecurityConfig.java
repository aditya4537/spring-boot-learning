package com.example.springsecuritydemoo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		UserDetails adminUser = User.withUsername("admin").password(passwordEncoder.encode("1234")).roles("Admin", "User").build();
		
		UserDetails user = User.withUsername("user").password(passwordEncoder.encode("1234")).roles("User").build();
	
		return new InMemoryUserDetailsManager(adminUser, user);
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception{
		return http.authorizeHttpRequests(
				auth -> auth
						.antMatchers("/")
						.permitAll()
						.antMatchers("/user/**")
						.hasAnyRole("Admin", "User")
						.antMatchers("/admin/**")
						.hasRole("Admin")
				
				).formLogin(
						formLogin -> formLogin.permitAll().defaultSuccessUrl("/")
                        .successHandler(new CustomAuthenticationSuccessHandler())
						).build();
				
	}

}

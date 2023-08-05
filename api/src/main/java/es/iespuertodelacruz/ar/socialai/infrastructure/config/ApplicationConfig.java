package es.iespuertodelacruz.ar.socialai.infrastructure.config;

import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.secondary.jpa.entity.UserEntity;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.secondary.jpa.repository.UserEntityJPARepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import es.iespuertodelacruz.ar.socialai.infrastructure.security.UserDetailsLogin;

import java.util.Optional;
import java.util.Properties;


@Configuration
public class ApplicationConfig {


	private final UserEntityJPARepository repository;

	public ApplicationConfig(UserEntityJPARepository repository) {
		super();
		this.repository = repository;
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		
//		return username -> {
//			Optional<UserEntity> optUserEntity = repository.findByNickname(username);
//			if(optUserEntity.isPresent()){
//				UserEntity userEntity = optUserEntity.get();
//				UserDetailsLogin user = new UserDetailsLogin();
//				user.setUsername(userEntity.getNickname());
//				user.setPassword(userEntity.getPassword());
//				user.setRole(userEntity.getRole().getName());
//				user.setEmail(userEntity.getEmail());
//				user.setBiography(userEntity.getBiography());
//				user.setProfilePicture(userEntity.getProfilePicture());
//				return user;
//			}else{
//				throw new UsernameNotFoundException("User not found");
//			}
//		};

		return username -> {
			UserDetailsLogin user = new UserDetailsLogin();
			user.setUsername("Alvaro");
			user.setPassword("1234");
			return user;
		};
	}

	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);

		mailSender.setUsername("socialaiverify@gmail.com");
		mailSender.setPassword("gwdjpfolscwldcdu");

		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true");

		return mailSender;
	}

}

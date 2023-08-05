package es.iespuertodelacruz.ar.socialai.infrastructure.adapter.primary.jpa.resource;

import es.iespuertodelacruz.ar.socialai.domain.port.primary.UserService;
import es.iespuertodelacruz.ar.socialai.infrastructure.security.JwtService;
import es.iespuertodelacruz.ar.socialai.infrastructure.security.UserDetailsLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/register")
public class RegisterController {

	@Autowired
	private UserService userService;

	@Autowired
	private JwtService jwtService;

	@Autowired
	private JavaMailSender mailSender;

	@PostMapping
	public ResponseEntity<String> register(@RequestBody UserDetailsLogin request) {

//		String nickname = request.getUsername();
//		String plainPassword = request.getPassword();
//		String email = request.getEmail();
//		String biography = "";
//		byte[] profilePicture = null;
//		String role = "ROLE_USER";
//		Integer countFollowers = 0;
//		Integer countFollowing = 0;
//		Date creationDate = new Date();
//		String verificationCode = "";
//		do {
//			verificationCode = RandomString.make(64);
//		} while (userService.findByVerificationCode(verificationCode).isPresent());
//
//		boolean enabled = false;
//
//		String token = null;
//		User user = userService.create(nickname, plainPassword, email, biography, profilePicture, role, countFollowers,
//				countFollowing, verificationCode, enabled, creationDate);
//		if (user != null) {
//			token = jwtService.generateToken(user.getNickname(), user.getRole().getName());
//			sendVerificationEmail(user);
//			if (token != null) {
//				return ResponseEntity.ok(token);
//			} else {
//				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//						.body("usuario creado, pero no posible obtener token");
//			}
//		} else {
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No se pudo registrar en la DDBB");
//		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No se pudo registrar en la DDBB");
	}

//	private void sendVerificationEmail(User user) {
//		String toAddress = user.getEmail();
//		String fromAddress = "socialaiverify@gmail.com";
//		String senderName = "SocialAI";
//		String subject = "Please, verify your registration";
//		String content = "Dear [[name]],<br>" + "Please click the link below to verify your registration:<br>"
//				+ "<h3><a href=\"[[URL]]\" target=\"_self\">VERIFY</a></h3>" + "Thank you,<br>" + "SocialAI.";
//
//		MimeMessage message = mailSender.createMimeMessage();
//		MimeMessageHelper helper = new MimeMessageHelper(message);
//
//		try {
//			helper.setFrom(fromAddress);
//			helper.setTo(toAddress);
//			helper.setSubject(subject);
//			content = content.replace("[[name]]", user.getNickname());
//			String verifyURL = "http://localhost:8080/api/register/verify?code=" + user.getVerificationCode();
//			content = content.replace("[[URL]]", verifyURL);
//			helper.setText(content, true);
//			mailSender.send(message);
//		} catch (MessagingException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	@GetMapping("/verify")
//	public String verifyUser(@Param("code") String code) {
//		if (verify(code)) {
//			return "verify_success";
//		} else {
//			return "verify_fail";
//		}
//	}
//
//	private boolean verify(String verificationCode) {
//		Optional<User> optUser = userService.findByVerificationCode(verificationCode);
//		if (optUser.isPresent()) {
//			User user = optUser.get();
//			if (!user.isEnabled()) {
//				user.setVerificationCode(null);
//				user.setEnabled(true);
//				userService.save(user);
//
//				return true;
//			}
//		}
//		return false;
//	}
}

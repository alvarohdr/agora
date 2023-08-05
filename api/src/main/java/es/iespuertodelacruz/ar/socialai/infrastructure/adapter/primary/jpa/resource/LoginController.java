package es.iespuertodelacruz.ar.socialai.infrastructure.adapter.primary.jpa.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.iespuertodelacruz.ar.socialai.domain.model.User;
import es.iespuertodelacruz.ar.socialai.domain.port.primary.UserService;
import es.iespuertodelacruz.ar.socialai.infrastructure.security.JwtService;
import es.iespuertodelacruz.ar.socialai.infrastructure.security.UserDetailsLogin;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private JwtService jwtService;

	@PostMapping
	public ResponseEntity<String> login(@RequestBody UserDetailsLogin request) {
//		String username = request.getUsername();
//		String plainPassword = request.getPassword();
//		String token = null;
//		if( userService.checkCredentials(username, plainPassword) ) {
//			Optional<User> optUser = userService.findByNickname(username);
//			if(optUser.isPresent()){
//				User user = optUser.get();
//				if(user.isEnabled()) {
//					token = jwtService.generateToken(user.getNickname(), user.getRole().getName());
//				}else{
//					return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Debe verificar el email antes de iniciar sesión");
//				}
//			}
//		}
//
//		if(token == null)
//			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("User/pass erróneo");
//		else
//			return ResponseEntity.ok(token);

		String token = jwtService.generateToken(request.getUsername(), "ROLE_USER");
		return ResponseEntity.ok(token);
	}
}

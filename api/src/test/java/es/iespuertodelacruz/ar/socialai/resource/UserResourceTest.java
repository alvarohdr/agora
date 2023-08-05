package es.iespuertodelacruz.ar.socialai.resource;

import es.iespuertodelacruz.ar.socialai.domain.port.primary.UserService;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.primary.jpa.dto.UserDTO;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.primary.jpa.resource.LoginController;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.primary.jpa.resource.RegisterController;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.primary.jpa.resource.v2.UserResource;
import es.iespuertodelacruz.ar.socialai.infrastructure.security.UserDetailsLogin;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class UserResourceTest {
//
//    private static UserDetailsLogin userDetailsLogin;
//
//    @Autowired
//    RegisterController registerController;
//    @Autowired
//    LoginController loginController;
//    @Autowired
//    UserResource userResource;
//
//    @Autowired
//    private UserService userService;
//
//    private static String nickname = "UsuarioPrueba";
//    private static String biography = "Biografía prueba";
//    private static String email = "prueba@email.com";
//    private static String password = "1234";
//    private static byte[] profilePicture = new byte[0];
//    private static int id;
//
//
//    @BeforeAll
//    static void setUpBeforeClass(){
//        userDetailsLogin = new UserDetailsLogin();
//        userDetailsLogin.setUsername(nickname);
//        userDetailsLogin.setBiography(biography);
//        userDetailsLogin.setEmail(email);
//        userDetailsLogin.setPassword(password);
//        userDetailsLogin.setProfilePicture(profilePicture);
//        userDetailsLogin.setRole("ROLE_USER");
//    }
//
//    @Test
//    @Order(1)
//    public void testRegister(){
//        ResponseEntity<?> response = registerController.register(userDetailsLogin);
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//    }
//
//    @Test
//    @Order(2)
//    public void testLogin(){
//        /*ResponseEntity<?> response = loginController.login(userDetailsLogin);
//        Claims claims = new JwtService().getClaims(response.getBody().toString());
//        String username = claims.getSubject();
//        Optional<User> optUser = userService.findByNickname(username);
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertTrue(optUser.isPresent());
//        User user = optUser.get();
//        id = user.getId();
//
//        assertEquals(userDetailsLogin.getUsername(), user.getNickname());
//        assertEquals(userDetailsLogin.getEmail(), user.getEmail());
//        assertEquals(userDetailsLogin.getBiography(), user.getBiography());*/
//
//        //Error al comprobar el role y la profilePicture
//    }
//
//    @Test
//    @Order(3)
//    public void testFindByNickname(){
//        /*ResponseEntity<?> response = userResource.findByNickname(nickname);
//        UserDTO userDTO = (UserDTO)response.getBody();
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(nickname, userDTO.getNickname());*/
//    }
//
//    @Test
//    @Order(4)
//    public void testFindById(){
//        ResponseEntity<?> response = userResource.findById(id);
//        UserDTO userDTO = (UserDTO)response.getBody();
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(nickname, userDTO.getNickname());
//    }
//
//    @Test
//    @Order(5)
//    public void testDelete(){
//        ResponseEntity<?> response = userResource.delete(id);
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//
//        response = userResource.findById(id);
//        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
//    }
//}

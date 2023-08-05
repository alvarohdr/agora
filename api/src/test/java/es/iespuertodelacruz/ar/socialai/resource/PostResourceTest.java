package es.iespuertodelacruz.ar.socialai.resource;

import es.iespuertodelacruz.ar.socialai.domain.port.primary.UserService;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.secondary.jpa.mappers.EntityUserMapper;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class PostResourceTest {
//
//    private static PostDTO postDTO;
//    private static EntityUserMapper entityUserMapper;
//    private static PostDTOMapper postDTOMapper;
//    @Autowired
//    UserService userService;
//    @Autowired
//    IPostService postService;
//
//    @Autowired
//    PostResource postResource;
//
//    /*@BeforeAll
//    static void setUpBeforeClass(){
//        entityUserMapper = new EntityUserMapper();
//        postDTOMapper = new PostDTOMapper();
//    }
//
//    @Test
//    @Order(1)
//    public void testCreatePost(){
//        User user = userService.findByNickname("admin").get();
//        postDTO = new PostDTO();
//        postDTO.setUser(entityUserMapper.toEntity(user));
//        postDTO.setContentText("Post de ejemplo");
//        postDTO.setPrompt("Promt de emeplo");
//
//        ResponseEntity<?> response = postResource.createPost(postDTO);
//        PostDTO savedPost = (PostDTO)response.getBody();
//        postDTO.setId(savedPost.getId());
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//    }
//
//    @Test
//    @Order(2)
//    public void testFindAll(){
//        List<PostDTO> list = (List<PostDTO>)postResource.findAll().getBody();
//        assertTrue(list.size() > 0);
//    }
//
//    @Test
//    @Order(3)
//    public void testFindById(){
//        ResponseEntity<?> response = postResource.findById(postDTO.getId());
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//    }
//
//    @Test
//    @Order(4)
//    public void testUpdate(){
//        String prompt = "New prompt";
//        String header = "New header";
//
//        postDTO.setPrompt(prompt);
//        postDTO.setContentText(header);
//
//        ResponseEntity<?> response = postResource.update(postDTO.getId(), postDTO);
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        PostDTO post = (PostDTO) response.getBody();
//        assertEquals(prompt, post.getPrompt());
//        assertEquals(header, post.getContentText());
//
//
//        postService.deleteById(postDTO.getId());
//    }*/
//
//
//}

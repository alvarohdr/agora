package es.iespuertodelacruz.ar.socialai.resource;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class RoleResourceTest {
//
//    private static String name = "Prueba";
//    @Autowired
//    RoleResource roleResource;
//
//    private static RoleDTO roleDTO;
//    private static RoleDTOMapper roleDTOMapper;
//
//    @BeforeAll
//    static void setUpBeforeClass() {
//        roleDTO = new RoleDTO();
//        roleDTO.setName(name);
//        roleDTOMapper = new RoleDTOMapper();
//    }
//
//    @Test
//    @Order(1)
//    public void testCreateRole(){
//        ResponseEntity<?> response = roleResource.createRole(this.roleDTO);
//        RoleDTO savedRole = (RoleDTO)response.getBody();
//        this.roleDTO.setId(savedRole.getId());
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(name, roleDTOMapper.toDomain(savedRole).getName());
//    }
//
//    @Test
//    @Order(2)
//    public void testFindAll(){
//        List<RoleDTO> list = (List<RoleDTO>)roleResource.findAll().getBody();
//        assertTrue(list.size() > 0);
//    }
//
//    @Test
//    @Order(3)
//    public void testFindById(){
//        ResponseEntity<?> response = roleResource.findById(this.roleDTO.getId());
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(name, roleDTOMapper.toDomain((RoleDTO)response.getBody()).getName());
//    }
//
//    @Test
//    @Order(4)
//    public void testUpdate(){
//        this.roleDTO.setName("PruebaUpdate");
//        ResponseEntity<?> response = roleResource.update(roleDTO.getId(), roleDTO);
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals("PruebaUpdate", roleDTOMapper.toDomain((RoleDTO)response.getBody()).getName());
//    }
//
//
//    @Test
//    @Order(5)
//    public void testDeleteRole(){
//        if(this.roleDTO.getId() != null){
//            Integer id = this.roleDTO.getId();
//            ResponseEntity<?> response = roleResource.delete(id);
//            assertEquals(HttpStatus.OK, response.getStatusCode());
//            response = roleResource.findById(id);
//            assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
//        }
//    }
//}

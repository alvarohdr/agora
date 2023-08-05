 package es.iespuertodelacruz.ar.socialai.infrastructure.adapter.primary.jpa.resource.v2;

import es.iespuertodelacruz.ar.socialai.domain.model.User;
import es.iespuertodelacruz.ar.socialai.domain.port.primary.UserService;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.primary.jpa.dto.UserDTO;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.primary.jpa.dto.UserDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/v2/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        UserDTOMapper mapper = new UserDTOMapper();
        List<UserDTO> users = userService.findAll().stream()
                .map(u -> mapper.toDTO(u))
                .collect(Collectors.toList());

        return ResponseEntity.ok().body(users);
    }
}

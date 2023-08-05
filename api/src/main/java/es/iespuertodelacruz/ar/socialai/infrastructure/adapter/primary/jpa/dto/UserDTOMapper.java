package es.iespuertodelacruz.ar.socialai.infrastructure.adapter.primary.jpa.dto;

import es.iespuertodelacruz.ar.socialai.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapper {

    public User toDomain(UserDTO in){
        User u = new User();
        u.setId(in.getId());
        u.setName(in.getName());

        return u;
    }

    public UserDTO toDTO(User in){
        UserDTO u = new UserDTO();
        u.setId(in.getId());
        u.setName(in.getName());

        return u;
    }

}


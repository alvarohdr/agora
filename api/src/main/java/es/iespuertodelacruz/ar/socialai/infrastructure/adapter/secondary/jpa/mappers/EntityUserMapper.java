package es.iespuertodelacruz.ar.socialai.infrastructure.adapter.secondary.jpa.mappers;

import es.iespuertodelacruz.ar.socialai.domain.model.User;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.secondary.jpa.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class EntityUserMapper {
    public User toDomain(UserEntity in){
        User u = new User();
        u.setId(in.getId());
        u.setName(in.getName());

        return u;
    }

    public UserEntity toEntity(User in) {
        UserEntity u = new UserEntity();
        u.setId(in.getId());
        u.setName(in.getName());

        return u;
    }
}

package es.iespuertodelacruz.ar.socialai.domain.port.secondary;

import es.iespuertodelacruz.ar.socialai.domain.model.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll();
}

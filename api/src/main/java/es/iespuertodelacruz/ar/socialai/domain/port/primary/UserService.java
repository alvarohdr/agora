package es.iespuertodelacruz.ar.socialai.domain.port.primary;

import es.iespuertodelacruz.ar.socialai.domain.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    
}
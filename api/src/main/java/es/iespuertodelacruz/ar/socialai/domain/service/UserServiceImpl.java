package es.iespuertodelacruz.ar.socialai.domain.service;

import es.iespuertodelacruz.ar.socialai.domain.model.User;
import es.iespuertodelacruz.ar.socialai.domain.port.primary.UserService;
import es.iespuertodelacruz.ar.socialai.domain.port.secondary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

}

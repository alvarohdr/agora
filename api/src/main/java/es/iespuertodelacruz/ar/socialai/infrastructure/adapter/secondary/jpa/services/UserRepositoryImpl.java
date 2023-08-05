package es.iespuertodelacruz.ar.socialai.infrastructure.adapter.secondary.jpa.services;

import es.iespuertodelacruz.ar.socialai.domain.model.User;
import es.iespuertodelacruz.ar.socialai.domain.port.secondary.UserRepository;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.secondary.jpa.entity.UserEntity;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.secondary.jpa.mappers.EntityUserMapper;
import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.secondary.jpa.repository.UserEntityJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserEntityJPARepository repository;
    
    private EntityUserMapper mapper;

    @Override
    public List<User> findAll() {
        mapper = new EntityUserMapper();
        List<UserEntity> findEntities = repository.findAll();
        return findEntities.stream().map(entity -> mapper.toDomain(entity)).collect(Collectors.toList());
    }
}

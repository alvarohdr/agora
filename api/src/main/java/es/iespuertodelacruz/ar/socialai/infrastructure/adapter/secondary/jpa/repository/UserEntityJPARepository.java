package es.iespuertodelacruz.ar.socialai.infrastructure.adapter.secondary.jpa.repository;

import es.iespuertodelacruz.ar.socialai.infrastructure.adapter.secondary.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface UserEntityJPARepository extends JpaRepository<UserEntity, Integer> {
	
}

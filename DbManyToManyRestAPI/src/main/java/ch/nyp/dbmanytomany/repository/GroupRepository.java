package ch.nyp.dbmanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.nyp.dbmanytomany.model.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

}

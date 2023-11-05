package ma.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}

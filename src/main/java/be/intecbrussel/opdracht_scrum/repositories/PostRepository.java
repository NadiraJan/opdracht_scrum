package be.intecbrussel.opdracht_scrum.repositories;

import be.intecbrussel.opdracht_scrum.data.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}

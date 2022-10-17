package be.intecbrussel.opdracht_scrum.configData;

import be.intecbrussel.opdracht_scrum.data.Account;
import be.intecbrussel.opdracht_scrum.data.Post;
import be.intecbrussel.opdracht_scrum.services.PostService;
import be.intecbrussel.opdracht_scrum.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class SeeData implements CommandLineRunner {

    @Autowired
    private PostService postService;
    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {
        List<Post> posts = postService.getAll();

        if (posts.size() == 0) {

            Account account1 = new Account();
            Account account2 = new Account();

            account1.setFirstName("user1");
            account1.setLastName("lastNameUser1");
            account1.setUserName("userUser");
            account1.setEmail("user1@mail.com");
            account1.setPassword("password");
            account1.setCity("Brussel");



            account2.setFirstName("admin");
            account2.setLastName("ADMIN");
            account2.setUserName("adminAdmin");
            account2.setEmail("user2@mail.com");
            account2.setPassword("password");
            account2.setCity("Mechelen");


            Post post1 = new Post();
            post1.setTitle("Post1");
            post1.setBody("BodyOfPost1");
            post1.setLikes(4);
            post1.setCreatedAt(LocalDateTime.now());
            post1.setAccount(account1);

            Post post2 = new Post();
            post2.setTitle("Post2");
            post2.setBody("BodyOfPost2");
            post2.setLikes(0);
            post2.setCreatedAt(LocalDateTime.now());
            post2.setAccount(account2);

            postService.save(post1);
            postService.save(post2);
        }

    }
}

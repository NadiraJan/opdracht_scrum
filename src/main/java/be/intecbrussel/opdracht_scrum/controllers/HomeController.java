package be.intecbrussel.opdracht_scrum.controllers;

import be.intecbrussel.opdracht_scrum.data.Post;
import be.intecbrussel.opdracht_scrum.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String home(Model model){

        List<Post> posts=postService.getAll();
        model.addAttribute("posts", posts);
                return"home";
    }
}

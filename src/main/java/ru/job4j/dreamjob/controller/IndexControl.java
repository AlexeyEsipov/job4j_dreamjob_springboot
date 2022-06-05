package ru.job4j.dreamjob.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.dreamjob.model.User;
import ru.job4j.dreamjob.service.CandidateService;
import ru.job4j.dreamjob.service.CityService;
import ru.job4j.dreamjob.service.PostService;

import net.jcip.annotations.ThreadSafe;
import javax.servlet.http.HttpSession;

@ThreadSafe
@Controller
public class IndexControl {

    private final CandidateService candidateService;
    private final PostService postService;

    public IndexControl(CandidateService candidateService, PostService postService) {
        this.candidateService = candidateService;
        this.postService = postService;
    }

    @GetMapping("/index")
    public String index(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            user = new User();
            user.setName("Гость");
        }
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/visible")
    public String visible(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            user = new User();
            user.setName("Гость");
        }
        model.addAttribute("user", user);
        model.addAttribute("candidates", candidateService.findAllVisible());
        model.addAttribute("posts", postService.findAllVisible());
        return "visible";
    }
}

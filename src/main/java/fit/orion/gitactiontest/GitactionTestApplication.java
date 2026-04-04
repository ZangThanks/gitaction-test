package fit.orion.gitactiontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitactionTestApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Gitaction Test";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye to Gitaction Test 123";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitactionTestApplication.class, args);
    }

}

//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/ZangThanks/gitaction-test.git
//git push -u origin main
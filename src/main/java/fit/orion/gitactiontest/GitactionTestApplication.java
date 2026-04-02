package fit.orion.gitactiontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitactionTestApplication {

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
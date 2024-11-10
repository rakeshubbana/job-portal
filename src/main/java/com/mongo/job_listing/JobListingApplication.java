package com.mongo.job_listing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JobListingApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome You";
	}

	public static void main(String[] args) {
		SpringApplication.run(JobListingApplication.class, args);
	}

}
echo "# job-portal" >> README.md
		git init
		git add README.md
		git commit -m "first commit"
		git branch -M main
		git remote add origin https://github.com/rakeshubbana/job-portal.git
		git push -u origin main

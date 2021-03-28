package com.aslan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.printf("%s\n", "springboot-security-ldap::main(): STARTING THE APPLICATION");
		//SpringApplication.run(Application.class, args);
		
		SpringApplication app = new SpringApplication(Application.class);
		
		String APP_CURRENT_ENV = "local";
		if(System.getenv("work.environment")!=null) {
			String env_value = System.getenv("work.environment").toLowerCase();
			if(env_value.trim().equals("dev")) {
				APP_CURRENT_ENV = "dev";
			}
			
			System.out.printf("%s\n", "springboot-security-ldap::main(): work.environment: " + env_value);
		}
		
		// set active profile
		System.setProperty("spring.profiles.active", APP_CURRENT_ENV);
		
		// current directory
		System.setProperty("spring.profiles.active", APP_CURRENT_ENV);
		
		// Disabling restart: Make this false when you push to cloud (means on cloud), otherwise comment it for local use
		System.out.printf("%s\n", "springboot-security-ldap::main(): Current Directory= " + System.getProperty("user.dir"));
		
		// run app
		app.run(args);
		System.out.printf("%s\n", "springboot-security-ldap::main(): APPLICATION FINISHED");
		System.out.printf("%s\n", "springboot-security-ldap::main(): env(): " + APP_CURRENT_ENV);
	}
	
	@Override
	public void run(String... args) {
		System.out.printf("%s\n", "springboot-security-ldap::run(): EXECUTING => command line runner");
		try {
			
		} catch (Exception ex) {
			System.out.printf("%s\n", "springboot-security-ldap::run(): Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

} //end class

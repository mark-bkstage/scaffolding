package com.pst.crewpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pst.crewpro")
public class ProfilesApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProfilesApplication.class, args);
  }
}

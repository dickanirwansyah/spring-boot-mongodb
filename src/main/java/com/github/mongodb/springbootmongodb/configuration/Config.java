package com.github.mongodb.springbootmongodb.configuration;

import com.github.mongodb.springbootmongodb.document.User;
import com.github.mongodb.springbootmongodb.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class Config {

    @Bean
    CommandLineRunner runner(UserRepository userRepository){
        return  strings -> {
              userRepository.save(new User(1, "Muhammad Dicka Nirwansyah", "lead programmer", 19000L));
              userRepository.save(new User(2, "Jhoni Andreas", "operational", 8000L));
              userRepository.save(new User(3, "Adelia Syiva Tiara", "desainer", 7000L));
        };
    }
}

package com.example.touristapi.config;

import com.example.touristapi.entity.Tourist;
import com.example.touristapi.repository.TouristRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {
    @Bean
    CommandLineRunner loadSampleTourists(TouristRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Tourist("Ravi Kumar", "ravi@example.com", "Hyderabad"));
                repository.save(new Tourist("Anu Sharma", "anu@example.com", "Tirupati"));
                repository.save(new Tourist("Kiran Reddy", "kiran@example.com", "Vijayawada"));
            }
        };
    }
}

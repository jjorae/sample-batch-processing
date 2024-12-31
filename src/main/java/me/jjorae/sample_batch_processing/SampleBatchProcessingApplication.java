package me.jjorae.sample_batch_processing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Spring Boot 3.0부터는 @EnableBatchProcessing 어노테이션이 필요하지 않다.
 */
@SpringBootApplication
public class SampleBatchProcessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleBatchProcessingApplication.class, args);
	}

}

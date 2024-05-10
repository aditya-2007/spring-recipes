package com.aditya.spring6practice;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aditya.spring6practice.sequence.Sequence;
import com.aditya.spring6practice.sequence.config.SequenceConfiguration;
import com.aditya.spring6practice.shop.BannerLoader;
import com.aditya.spring6practice.shop.config.ShopConfiguration;

@SpringBootApplication
public class SpringRecipesApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringRecipesApplication.class, args);
		
		try (var context = new AnnotationConfigApplicationContext(SequenceConfiguration.class)){
			Sequence seqGenerator = (Sequence)context.getBean("sequence");
			System.out.println(seqGenerator.nextValue());
			System.out.println(seqGenerator.nextValue());
		}
		
	}

}

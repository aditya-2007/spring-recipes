package com.aditya.spring6practice.sequence.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aditya.spring6practice.sequence.Sequence;

@Configuration
public class SequenceConfiguration {

	@Bean
	public Sequence sequence() {
		var seqgen = new Sequence();
		seqgen.setPrefix("SSF");
		seqgen.setSuffix("T");
		seqgen.setInitial(1000);
		return seqgen;
	}
}

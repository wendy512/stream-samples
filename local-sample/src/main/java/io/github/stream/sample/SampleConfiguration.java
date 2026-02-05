package io.github.stream.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

/**
 * @author taowenwu
 * @date 2026-02-04 14:28:50
 * @since 1.0.0
 */
@Configuration
public class SampleConfiguration {

	@Bean
	public StopWatch stopWatch() {
		return new StopWatch();
	}
}

package chapter02.mixedconfig.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
}
package es.iespuertodelacruz.ar.socialai;

import es.iespuertodelacruz.ar.socialai.infrastructure.config.ApplicationConfig;
import es.iespuertodelacruz.ar.socialai.infrastructure.config.SecurityConfiguration;
import es.iespuertodelacruz.ar.socialai.infrastructure.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.util.logging.Logger;

@SpringBootApplication
@Import({ApplicationConfig.class, SecurityConfiguration.class, SwaggerConfig.class})
public class SocialaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialaiApplication.class, args);
		Logger logger = Logger.getLogger("debug");
		logger.info("LA APLICACIÓN SPRING ESTÁ LANZADA");
	}

}

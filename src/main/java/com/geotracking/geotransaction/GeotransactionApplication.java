package com.geotracking.geotransaction;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@SpringBootApplication
@EnableJpaAuditing
@OpenAPIDefinition(info = @Info(title = "Geo Tracking Device API Docs", version = "1.0", description = "Documentation GeoTracking APIs v1.0"))
public class GeotransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeotransactionApplication.class, args);
	}

}

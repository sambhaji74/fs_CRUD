package com.codebysambha.fs_Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.codebysambha.fs_Backend")
public class FsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsBackendApplication.class, args);
	}

}

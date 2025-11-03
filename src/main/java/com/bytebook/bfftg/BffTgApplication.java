package com.bytebook.bfftg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application entry point for the Telegram BFF service.
 */
@SpringBootApplication
public class BffTgApplication {
  /**
   * Start program.
   *
   * @param args for customisation of start.
   */
  public static void main(String[] args) {
    SpringApplication.run(BffTgApplication.class, args);
  }

}

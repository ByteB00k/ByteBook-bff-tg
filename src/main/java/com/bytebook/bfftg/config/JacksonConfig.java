package com.bytebook.bfftg.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Конфигурация Jackson для сериализации/десериализации JSON.
 * Настройки:
 * - SNAKE_CASE для имен полей
 * - Игнорирование null-значений
 * - Игнорирование неизвестных полей
 */
@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();

        mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);

        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);

        return mapper;
    }
}

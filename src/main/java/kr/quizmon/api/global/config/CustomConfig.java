package kr.quizmon.api.global.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "custom.properties")
public class CustomConfig {
    // JWT
    private String jwt_header;
    private String jwt_secret_key;
    private int jwt_expiration_hour;

}
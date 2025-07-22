package fun.kmoon.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Knife4jConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("苍穹外卖 API 接口文档")
                        .version("1.0.0")
                        .description("苍穹外卖 API 接口文档")
                        .contact(new Contact().name("Kmoon").email("hushan@kmoon.fun")));
    }
}
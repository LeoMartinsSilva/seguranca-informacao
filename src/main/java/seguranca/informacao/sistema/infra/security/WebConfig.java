package seguranca.informacao.sistema.infra.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .exposedHeaders("Location", "Access-Control-Allow-Origin");
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Adicione os manipuladores de recursos para servir arquivos estáticos
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }
}
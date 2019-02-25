package lk.ijse.dep.app.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("lk.ijse.dep.app")
@Import(JpaConfig.class)
public class AppConfig {
}

package dev.henriquejunqueira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
// força o spring a scanear pacotes externos, porém sobrescreve o comportamento padrão
//@ComponentScan(basePackages = "outside.henriquejunqueira")
// para solucionar o problema de sobrescrever o comportamento padrão, podemos fazer assim:
@ComponentScan(basePackages = {"outside.henriquejunqueira", "dev.henriquejunqueira"})
public class AnimeServiceApplication {

	public static void main(String[] args) {
        var applicationContext = SpringApplication.run(AnimeServiceApplication.class, args);
		Arrays.stream(applicationContext.getBeanDefinitionNames())
				.forEach(System.out::println);
	}

}

package ru.cooper.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Основной класс для запуска API Gateway.
 * <p>
 *     API Gateway является точкой входа для всех запросов к микросервисам.
 *     Он отвечает за маршрутизацию запросов к соответствующим сервисам,
 *     а также может выполнять дополнительные функции, такие как аутентификация,
 *     балансировка нагрузки и кэширование.
 * </p>
 *
 * @author duosora
 */
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}

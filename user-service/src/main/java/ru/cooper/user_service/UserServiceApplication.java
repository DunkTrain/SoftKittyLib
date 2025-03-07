package ru.cooper.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Основной класс для запуска сервиса управления пользователями.
 * <p>
 *     Сервис отвечает за регистрацию, аутентификацию и управление профилями пользователей.
 *     Он также обеспечивает безопасность данных пользователей и управление ролями.
 * </p>
 */
@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}

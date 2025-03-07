package ru.cooper.library_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Основной класс для запуска сервиса управления библиотекой.
 * <p>
 *     Сервис отвечает за управление метаданными книг, такими как название,
 *     автор, жанр и другие атрибуты. Он также предоставляет функционал
 *     для поиска книг и управления категориями.
 * </p>
 */
@SpringBootApplication
public class LibraryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryServiceApplication.class, args);
	}

}

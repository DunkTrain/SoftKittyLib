package ru.cooper.reading_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Основной класс для запуска сервиса чтения книг.
 * <p>
 *     Сервис отвечает за предоставление функционала для чтения книг,
 *     управления закладками и заметками, а также отслеживания прогресса чтения.
 *     Он взаимодействует с другими сервисами, такими как библиотека и файловый сервис,
 *     для получения контента и метаданных книг.
 * </p>
 */
@SpringBootApplication
public class ReadingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingServiceApplication.class, args);
	}

}

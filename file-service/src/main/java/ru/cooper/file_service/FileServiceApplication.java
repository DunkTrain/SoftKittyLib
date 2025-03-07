package ru.cooper.file_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Основной класс для запуска сервиса работы с файлами.
 * <p>
 *     Сервис отвечает за загрузку, хранение и обработку файлов,
 *     таких как книги в форматах EPUB, PDF и TXT. Он также может
 *     выполнять конвертацию файлов в другие форматы для удобства чтения.
 * </p>
 */
@SpringBootApplication
public class FileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileServiceApplication.class, args);
	}

}

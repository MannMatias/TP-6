package com.example.inicial1;

import com.example.inicial1.entities.*;
import com.example.inicial1.repositories.AutorRepository;
import com.example.inicial1.repositories.LibroRepository;
import com.example.inicial1.repositories.LocalidadRepository;
import com.example.inicial1.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Inicial1Application {
	private static final Logger logger = LoggerFactory.getLogger(Inicial1Application.class);

	@Autowired
	private PersonaRepository personaRepository;
	public static void main(String[] args) {
		SpringApplication.run(Inicial1Application.class, args);

		System.out.println("funcionando");
	}

	@Bean
	@Transactional
	CommandLineRunner init(PersonaRepository personaRepository, LocalidadRepository localidadRepository, AutorRepository autorRepository, LibroRepository libroRepository) {
		return args -> {
			// Creo un objeto localidad
			Localidad loc1 = Localidad.builder().denominacion("Guaymallen").build();
			Localidad loc2 = Localidad.builder().denominacion("San Rafael").build();
			Localidad loc3 = Localidad.builder().denominacion("Santa Rosa").build();

			// Creo un objeto persona
			Persona per1 = Persona.builder().
					nombre("Matías").apellido("Mann").dni(45720510).
					build();
			Domicilio dom1 = Domicilio.builder().
					calle("Donado").
					localidad(loc1).
					numero(786).build();



			// Ejemplos de libros
			Libro lib1 = Libro.builder()
					.titulo("El señor de los anillos")
					.fecha(1954)
					.genero("Fantasía")
					.paginas(1178)
					.autor("J. R. R. Tolkien")
					.build();

			Libro lib2 = Libro.builder()
					.titulo("Crimen y castigo")
					.fecha(1866)
					.genero("Novela psicológica")
					.paginas(671)
					.autor("Fiódor Dostoyevski")
					.build();

			Libro lib3 = Libro.builder()
					.titulo("Matar a un ruiseñor")
					.fecha(1960)
					.genero("Novela")
					.paginas(281)
					.autor("Harper Lee")
					.build();

			// Ejemplos de autores
			Autor aut1 = Autor.builder()
					.nombre("J. R. R.")
					.apellido("Tolkien")
					.biografia("J. R. R. Tolkien fue un escritor, poeta, filólogo y profesor inglés, autor de 'El señor de los anillos'.")
					.build();

			Autor aut2 = Autor.builder()
					.nombre("Fiódor")
					.apellido("Dostoyevski")
					.biografia("Fiódor Dostoyevski fue un novelista ruso conocido por sus obras sobre la condición humana, como 'Crimen y castigo'.")
					.build();

			Autor aut3 = Autor.builder()
					.nombre("Harper")
					.apellido("Lee")
					.biografia("Harper Lee fue una novelista estadounidense, famosa por su obra 'Matar a un ruiseñor'.")
					.build();

			personaRepository.save(per1);
		};
	};
}
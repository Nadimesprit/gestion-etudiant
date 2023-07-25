package tn.esprit.gestionetudiant;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import tn.esprit.gestionetudiant.entities.Etudiant;
import tn.esprit.gestionetudiant.repositories.EtudiantRepository;
import java.util.stream.Stream;

@EnableEurekaClient
@SpringBootApplication
public class GestionEtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionEtudiantApplication.class, args);
	}
	@Bean
	ApplicationRunner start (EtudiantRepository etudiantRepository){
		return args -> {
			Stream.of(
					Etudiant.builder().nom("Nagati")
							.prenom("Nadim")
							.email("Nadim.nagati@esprit.tn")
							.build(),
					Etudiant.builder().nom("Trabelsi")
							.prenom("Mayssa")
							.email("Mayssa.trabelsi@esprit.tn")
							.build())
			.forEach
			(
					Etudiant ->
					{
						etudiantRepository.save(Etudiant) ;
					}
			);
			etudiantRepository.findAll().forEach(System.out::println);
		};
	}
}

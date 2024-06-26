import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		//CRIANDO CURSOS
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descrição curso js");
		curso2.setCargaHoraria(4);
	
		//CRIANDO MENTORIA
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Descrição Mentoria java");
		mentoria.setData(LocalDate.now());
		
		//MENTORIA E CURSO COM CONTEUDO - POLIMORFISMO
		
		Conteudo conteudoC = new Curso();
		Conteudo conteudoM = new Mentoria();
		
//		ESCREVENDO NA TELA
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		//CRIANDO BOOTCAMP
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		//CRIANDO DEVS
		Dev devJulia = new Dev();
		devJulia.setNome("Júlia");
		devJulia.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + devJulia.getConteudosInscritos());
		
		devJulia.progredir();
		devJulia.progredir();
		
		System.out.println("-");
		System.out.println("Conteúdos Inscritos: " + devJulia.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos: " + devJulia.getConteudosConcluidos());
		System.out.println("XP: " + devJulia.calcularTotalXP());
		
		System.out.println("---------------------------");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
		
		devCamila.progredir();
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXP());
		
	}

}

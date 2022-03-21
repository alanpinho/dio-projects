import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Golang");
        curso2.setDescricao("Descrição do Curso de Golang");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudosDoBootcamp().add(curso1);
        bootcamp.getConteudosDoBootcamp().add(curso2);
        bootcamp.getConteudosDoBootcamp().add(mentoria);

        Dev devAlan = new Dev();
        devAlan.setNome("Alan");
        devAlan.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Alan: " + devAlan.getConteudosInscritos());
        System.out.println("-");
        devAlan.progredir();
        devAlan.progredir();
        System.out.println("Conteúdos Inscritos Alan: " + devAlan.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Alan: " + devAlan.getConteudosConcluidos());
        System.out.println("XP: " + devAlan.calcularTotalXp());

        System.out.println("-----------------------------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("-");
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());
    }
}

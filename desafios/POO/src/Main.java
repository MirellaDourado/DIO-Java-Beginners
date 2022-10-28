import java.time.LocalDate;

import br.com.desafio.dio.Bootcamp;
import br.com.desafio.dio.Devs;
import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso primeiroCurso = new Curso();
        primeiroCurso.setTitulo("curso java");
        primeiroCurso.setDescricao("descrição do curso de Java");
        primeiroCurso.setCargaHoraria(8);
        // System.out.println(primeiroCurso);

        Curso segundoCurso = new Curso();
        segundoCurso.setTitulo("curso JavaScript");
        segundoCurso.setDescricao("descrição do curso de JavaScript");
        segundoCurso.setCargaHoraria(4);
        // System.out.println(segundoCurso);

        Mentoria primeiraMentoria = new Mentoria();
        primeiraMentoria.setTitulo("mentoria Java");
        primeiraMentoria.setDescricao("descrição da mentoria de Java");
        // insere a data de criação na variável (por default: aaaa/mmm/dd)
        primeiraMentoria.setData(LocalDate.now());
        // System.out.println(primeiraMentoria);
    
    
        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descricao");
        bootcamp.getConteudos().add(primeiraMentoria);
        bootcamp.getConteudos().add(primeiroCurso);
        bootcamp.getConteudos().add(segundoCurso);

        System.out.println("Informações sobre o bootcamp");
        System.out.println("Nome do Bootcamp: " + bootcamp.getNome());
        System.out.println("Descrição do Bootcamp: " + bootcamp.getDescricao());
        System.out.println("Conteúdo do Bootcamp: " + bootcamp.getConteudos());
        System.out.println("Data de início: " + bootcamp.getDataInicial());
        System.out.println("Data final: " + bootcamp.getDataFinal());
        System.out.println("----------------------");
        
        
        System.out.println("Inscrição dos Devs:");
        Devs devJuliana = new Devs();
        devJuliana.setNome("Juliana");
        devJuliana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Juliana:\n" + devJuliana.getConteudosInscritos());
        
        Devs devLuis = new Devs();
        devLuis.setNome("Luis");
        devLuis.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Luis:\n" + devLuis.getConteudosInscritos());
        
        System.out.println("----------------------");
        System.out.println("Progressão dos Devs:");
        devLuis.progredir();
        devJuliana.progredir();
        devJuliana.progredir();
        System.out.println("Conteudos concluidos de Luis:" + devLuis.getConteudosConcluidos());
        System.out.println("Conteudos concluidos de Juliana:" + devJuliana.getConteudosConcluidos());

        System.out.println("-----------------------");
        System.out.println("Pontuação dos Devs");
        System.out.println("Juliana:" + devJuliana.calcularXP());
        System.out.println("Luis:" + devLuis.calcularXP());

    }
}

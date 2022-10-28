import java.time.LocalDate;

import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso primeiroCurso = new Curso();
        primeiroCurso.setTitulo("curso java");
        primeiroCurso.setDescricao("descrição do curso de Java");
        primeiroCurso.setCargaHoraria(8);
        System.out.println(primeiroCurso);

        Curso segundoCurso = new Curso();
        segundoCurso.setTitulo("curso JavaScript");
        segundoCurso.setDescricao("descrição do curso de JavaScript");
        segundoCurso.setCargaHoraria(4);
        System.out.println(segundoCurso);

        Mentoria primeiraMentoria = new Mentoria();
        primeiraMentoria.setTitulo("mentoria J va");
        primeiraMentoria.setDescricao("descrição da mentoria de Java");
        // insere a data de criação na variável (por default: aaaa/mmm/dd)
        primeiraMentoria.setData(LocalDate.now());
        System.out.println(primeiraMentoria);
    }
}

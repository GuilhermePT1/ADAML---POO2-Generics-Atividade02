public class RepositorioDeAlunos implements Repositorio<String> {

    @Override
    public void salvar(String aluno) {
        System.out.println("Salvando aluno: " + aluno);
    }
}
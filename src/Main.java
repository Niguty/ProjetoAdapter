import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminho = "pessoas.csv";

        RepositorioDePessoas repositorio = new PessoaCsvAdapter(caminho);
        List<Pessoa> pessoas = repositorio.listarPessoas();

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
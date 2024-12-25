package verificador_apostas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Verificador {

    private static final Set<Integer> numerosSorteados = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6));

    public static void main(String[] args) throws IOException {

        List<Aposta> apostas = obterApostasDoTxt();
        processarApostas(apostas);

        System.out.println("========== RESULTADO ==========\n");
        int i = 1;
        for (Aposta aposta : apostas) {
            System.out.println("Jogo " + i);
            System.out.println("Acertos: " + aposta.getAcertos() + "\n");
        }
    }

    private static List<Aposta> obterApostasDoTxt() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Welton\\Desktop\\apostas.txt"));
        String linha = reader.readLine();

        List<Aposta> apostas = new ArrayList<>();

        while (linha != null) {
            apostas.add(new Aposta(linha.split(",")));
            linha = reader.readLine();
        }

        return apostas;
    }

    private static void processarApostas(List<Aposta> apostas) {
        apostas.forEach(Verificador::verificarAcertos);
    }

    private static void verificarAcertos(Aposta aposta) {

        aposta.setAcertos(aposta.getAposta()
                .parallelStream()
                .filter(numerosSorteados::contains)
                .count());
    }

}

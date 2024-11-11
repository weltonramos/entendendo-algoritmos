package busca_binaria;

public class BuscaBinaria {

    public static void main(String[] args) {

        //, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 12
        int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 12};

        int posicaoNumero = buscaBinaria(vetor, 18);

        System.out.println(posicaoNumero);
    }

    private static int buscaBinaria(int[] vetor, int alvo) {

        if (vetor.length == 0)
            return -1;

        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            int posicao = (esquerda + direita) / 2;

            if (vetor[posicao] == alvo)
                return posicao;

            if (vetor[posicao] < alvo)
                esquerda = posicao + 1;
            else
                direita = posicao - 1;
        }
        return -1;
    }

}

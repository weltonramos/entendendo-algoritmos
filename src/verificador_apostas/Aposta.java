package verificador_apostas;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Aposta {

    private Set<Integer> aposta;
    private long acertos = 0;

    public Aposta(String[] numerosAposta) {
        this.aposta = Arrays.stream(numerosAposta).map(Integer::valueOf).collect(Collectors.toSet());
    }

    public Set<Integer> getAposta() {
        return aposta;
    }

    public void setAposta(Set<Integer> aposta) {
        this.aposta = aposta;
    }

    public long getAcertos() {
        return acertos;
    }

    public void setAcertos(long acertos) {
        this.acertos = acertos;
    }
}

public class JantarDosFilosofos {
    public static void main(String[] args) {
        final int NUM_FILOSOFOS = 5;
        boolean[] garfos = new boolean[NUM_FILOSOFOS];

        long startTime = System.nanoTime();

        for (int i = 0; i < 100; i++) {
            for (int filosofo = 0; filosofo < NUM_FILOSOFOS; filosofo++) {
                System.out.println("Filósofo " + filosofo + " está pensando.");

                int garfoEsquerdo = filosofo;
                int garfoDireito = (filosofo + 1) % NUM_FILOSOFOS;

                if (!garfos[garfoEsquerdo] && !garfos[garfoDireito]) {
                    garfos[garfoEsquerdo] = true;
                    garfos[garfoDireito] = true;

                    System.out.println("Filósofo " + filosofo + " está comendo.");

                    garfos[garfoEsquerdo] = false;
                    garfos[garfoDireito] = false;
                }
            }
            System.out.println("----- Fim da rodada " + (i + 1) + " -----\n");
        }

        long endTime = System.nanoTime();
        double durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Tempo total de execução: " + durationInSeconds + " segundos");
    }
}

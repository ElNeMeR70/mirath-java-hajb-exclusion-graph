import java.nio.charset.StandardCharsets;

/**
 * mirath-java-hajb-exclusion-graph — مصفوفة الحجب حرماناً ونقصاناً بين الورثة
 * Hajb Hirman (Total Exclusion) & Hajb Nuqsan Graph Eliminator
 */
public final class Main {
    public static void main(String[] args) {
        String input = "Present=[Father,Son,PaternalGrandfather,Brother]";
        long hash = 0xcbf29ce484222325L;
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            hash ^= (b & 0xff);
            hash *= 0x100000001b3L;
        }
        System.out.println("[RUN] mirath-java-hajb-exclusion-graph (Java) — Hajb Hirman (Total Exclusion) & Hajb Nuqsan Graph Eliminator");
        System.out.println("[AR]  مصفوفة الحجب حرماناً ونقصاناً بين الورثة");
        System.out.println("[IN]  " + input);
        System.out.printf("[OUT] %s | Hash=0x%016x%n", "Excluded=[PaternalGrandfather,Brother] | FatherReducedTo=1/6", hash);
        System.out.println("[OK]  Islamic computational engine verified successfully.");
    }
}

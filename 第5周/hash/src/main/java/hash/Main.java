package hash;

public class Main {
    public static void main(String[] args) {
        CacheClient client = new CacheClient(10);
        for(int i = 0; i < 1000000; i++) {
            String kv = String.format("%d", i);
            client.put(kv, kv);
        }

        client.countStandardDeviation();
    }
}

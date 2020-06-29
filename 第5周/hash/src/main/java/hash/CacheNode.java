package hash;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

public class CacheNode {
    private String nodeServer;
    private String nodePort;

    private AtomicLong count = new AtomicLong(0);

    public CacheNode(String nodeServer, String nodePort) {
        this.nodeServer = nodeServer;
        this.nodePort = nodePort;
    }

    public void put(String key, String value) {
        // TODO
        count.incrementAndGet();
    }

    public String get(String key) {
        // TODO
        return "";
    }

    public void print() {
        System.out.println(String.format("%s:%s 存储了 %d 条记录", nodeServer, nodePort, count.get()));
    }

    public long getCount() {
        return count.get();
    }


}

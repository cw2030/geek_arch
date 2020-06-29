package hash;

import java.util.ArrayList;
import java.util.List;

public class CacheClient {
    private List<CacheNode> list = new ArrayList<CacheNode>();
    private int clusters;

    public CacheClient(int clusters) {
        this.clusters = clusters;
        for (int i = 1; i <= clusters; i++) {
            list.add(new CacheNode(String.format("192.168.0.%d", i),"9090"));
        }
    }

    public void put(String key, String value) {
        int hashCode = Hash.FNVHash1(key);
        int idx = Math.abs(hashCode % clusters);
        list.get(idx).put(key,value);
    }

    public void countStandardDeviation() {
        long[] array = new long[clusters];
        CacheNode node ;
        for (int i = 0; i < clusters; i++) {
            node = list.get(i);
            node.print();
            array[i] = node.getCount();
        }
        System.out.println(String.format("标准差是：%f", standardDeviation(array)));
    }


    //标准差σ=sqrt(s^2)
    private double standardDeviation(long[] x) {
        int m=x.length;
        double sum=0;
        for(int i=0;i<m;i++){//求和
            sum+=x[i];
        }
        double dAve=sum/m;//求平均值
        double dVar=0;
        for(int i=0;i<m;i++){//求方差
            dVar+=(x[i]-dAve)*(x[i]-dAve);
        }
        //reture Math.sqrt(dVar/(m-1));
        return Math.sqrt(dVar/m);
    }
}

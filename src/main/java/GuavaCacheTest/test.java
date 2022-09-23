package GuavaCacheTest;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * @author by woyuan  2022/6/29
 */
public class test {
    public static void main(String[] args) {
        LoadingCache<String, Boolean> shortCallCache;

        shortCallCache = CacheBuilder.newBuilder().build(new CacheLoader<String, Boolean>() {
            @Override
            public Boolean load(String key) {
                return Boolean.TRUE;
            }
        });

        shortCallCache.put("a", Boolean.FALSE);
        shortCallCache.put("b", Boolean.FALSE);


        }
    }


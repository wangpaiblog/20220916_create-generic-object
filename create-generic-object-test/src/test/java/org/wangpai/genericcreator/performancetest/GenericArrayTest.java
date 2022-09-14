package org.wangpai.genericcreator.performancetest;

import org.junit.jupiter.api.Test;
import org.wangpai.genericcreator.model.Demo;
import org.wangpai.genericcreator.model.GenericCreator;

public class GenericArrayTest {

    public static void main(String[] args) {
        long maxTime = 10000000000L;
        int length = 10000;

        {
            final long START_TIME = System.currentTimeMillis();
            for (long time = 0; time < maxTime; ++time) {
                GenericCreator.createGenericArray(Demo[].class, length);
            }
            final long interval = System.currentTimeMillis() - START_TIME;
            System.out.println(String.format("测试 2 运行用时：%dms", interval));
        }

        {
            final long START_TIME = System.currentTimeMillis();
            for (long time = 0; time < maxTime; ++time) {
                GenericCreator.createGenericArray(Demo[]::new, length);
            }
            final long interval = System.currentTimeMillis() - START_TIME;
            System.out.println(String.format("测试 1 运行用时：%dms", interval));
        }


        {
            final long START_TIME = System.currentTimeMillis();
            for (long time = 0; time < maxTime; ++time) {
                GenericCreator.createGenericArray(Demo[].class, length);
            }
            final long interval = System.currentTimeMillis() - START_TIME;
            System.out.println(String.format("测试 2 运行用时：%dms", interval));
        }

        {
            final long START_TIME = System.currentTimeMillis();
            for (long time = 0; time < maxTime; ++time) {
                GenericCreator.createGenericArray(Demo[]::new, length);
            }
            final long interval = System.currentTimeMillis() - START_TIME;
            System.out.println(String.format("测试 1 运行用时：%dms", interval));
        }

        // ----------- 以上是预测试，结果不计最终测试结果。实验结果表明，方法在第一次运行时，时间会偏大很多，所以先进行一次预测试 ----------

        {
            final long START_TIME = System.currentTimeMillis();
            for (long time = 0; time < maxTime; ++time) {
                GenericCreator.createGenericArray(Demo[].class, length);
            }
            final long interval = System.currentTimeMillis() - START_TIME;
            System.out.println(String.format("测试 2 运行用时：%dms", interval));
        }

        {
            final long START_TIME = System.currentTimeMillis();
            for (long time = 0; time < maxTime; ++time) {
                GenericCreator.createGenericArray(Demo[]::new, length);
            }
            final long interval = System.currentTimeMillis() - START_TIME;
            System.out.println(String.format("测试 1 运行用时：%dms", interval));
        }
    }

    @Test
    void test() {
        long maxTime = 10000000000L;
        int length = 10000;
        {
            final long START_TIME = System.currentTimeMillis();
            for (long time = 0; time < maxTime; ++time) {
                GenericCreator.createGenericArray(Demo[]::new, length);
            }
            final long interval = System.currentTimeMillis() - START_TIME;
            System.out.println(String.format("测试 1 运行用时：%dms", interval));
        }

        {
            final long START_TIME = System.currentTimeMillis();
            for (long time = 0; time < maxTime; ++time) {
                GenericCreator.createGenericArray(Demo[].class, length);
            }
            final long interval = System.currentTimeMillis() - START_TIME;
            System.out.println(String.format("测试 2 运行用时：%dms", interval));
        }

        // ----------- 以上是预测试，结果不计最终测试结果。实验结果表明，方法在第一次运行时，时间会偏大很多，所以先进行一次预测试 ----------

        {
            final long START_TIME = System.currentTimeMillis();
            for (long time = 0; time < maxTime; ++time) {
                GenericCreator.createGenericArray(Demo[]::new, length);
            }
            final long interval = System.currentTimeMillis() - START_TIME;
            System.out.println(String.format("测试 1 运行用时：%dms", interval));
        }

        {
            final long START_TIME = System.currentTimeMillis();
            for (long time = 0; time < maxTime; ++time) {
                GenericCreator.createGenericArray(Demo[].class, length);
            }
            final long interval = System.currentTimeMillis() - START_TIME;
            System.out.println(String.format("测试 2 运行用时：%dms", interval));
        }
    }
}

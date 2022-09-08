package org.wangpai.genericcreator.model;

import java.util.function.IntFunction;
import java.util.function.Supplier;

/**
 * @since 2022-9-8
 */
public class GenericCreator {
    public static <T> T createGenericObject(Supplier<T> genericObjectCreator) {
        return genericObjectCreator.get();
    }

    public static <T> T createGenericObject(DemoObjectConstructor<T> genericObjectCreator,
                                            String firstPara, String secondPara) {
        return genericObjectCreator.constructor(firstPara, secondPara);
    }

    public static <T> T[] createGenericArray(IntFunction<T[]> genericArrayCreator, int arrayLength) {
        return genericArrayCreator.apply(arrayLength);
    }
}

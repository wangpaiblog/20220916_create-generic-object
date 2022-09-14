package org.wangpai.genericcreator.model;

import java.lang.reflect.Array;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/**
 * @since 2022-9-8
 */
public class GenericCreator {
    public static <T> T createGenericObject(Supplier<T> genericObjectCreator) {
        return genericObjectCreator.get();
    }

    public static <T> T createGenericObject(DemoConstructor<T> genericObjectCreator,
                                            String firstPara, String secondPara) {
        return genericObjectCreator.constructor(firstPara, secondPara);
    }

    public static <T> T[] createGenericArray(IntFunction<T[]> genericArrayCreator, int arrayLength) {
        return genericArrayCreator.apply(arrayLength);
    }

    public static <T> T[] createGenericArray(Class<T[]> classArrayT, int arrayLength) {
        return (T[]) Array.newInstance(classArrayT.getComponentType(), arrayLength);
    }
}

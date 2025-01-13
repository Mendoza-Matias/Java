package com.mmendoza.utilities;

import java.util.Arrays;
import java.util.List;

public class Utilities {

    /* parameters generics */
    public static <T> List<T> arrayToList(T[] array) {
        return Arrays.asList(array);
    }

}

package com.lj.common.utils;

import java.util.function.Consumer;

/**
 * The utility class checks for the give dependency to make sure it meets the objective.
 */
public class DependencyChecker {

    /**
     * The constructor.
     *
     */
    private DependencyChecker() {
    }

    /**
     * Ensure a given dependency is not null.
     */
    public static Consumer<Object> ensureNotNull = (T) -> {
        if (T == null) {
            throw new IllegalArgumentException("Dependency cannot be null");
        }
    };

    /**
     * Ensure a given @String dependency is not null or empty.
     */
    public static Consumer<String> ensureNotNullOrEmpty = (string) -> {
        if (string == null || string.equals("")) {
            throw new IllegalArgumentException(
                    "Dependency cannot be null or empty"
            );
        }
    };

}

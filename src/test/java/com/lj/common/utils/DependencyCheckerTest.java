package com.lj.common.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DependencyCheckerTest {

    @Test
    public void testEnsureNotNull() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> DependencyChecker.ensureNotNull.accept(null));
        assertEquals("Dependency cannot be null", exception.getMessage());
        DependencyChecker.ensureNotNull.accept(1);
    }

    @Test
    public void testEnsureNotNullOrEmpty() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> DependencyChecker.ensureNotNullOrEmpty.accept(null));
        assertEquals("Dependency cannot be null or empty", exception.getMessage());
        exception = Assertions.assertThrows(IllegalArgumentException.class, () -> DependencyChecker.ensureNotNullOrEmpty.accept(""));
        assertEquals("Dependency cannot be null or empty", exception.getMessage());
        DependencyChecker.ensureNotNullOrEmpty.accept("test");
    }
}
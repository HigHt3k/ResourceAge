package com.util;

public class IdGenerator {
    private static int entityId = -1;

    public static int generateNextId() {
        return entityId++;
    }
}

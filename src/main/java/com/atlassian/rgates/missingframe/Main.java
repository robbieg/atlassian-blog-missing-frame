package com.atlassian.rgates.missingframe;

import java.util.Collections;

import static java.util.stream.Collectors.toList;

public class Main {
    static class Thing {
        Long
        getId() {
            return 163L;
        }
    }

    public static void main(String[] args) {
        Thing thing = null;
        System.out.println(
            Collections.singleton(thing).stream().map(Thing::getId).collect(toList())
        );
    }
}

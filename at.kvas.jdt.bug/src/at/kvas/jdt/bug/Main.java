/*
 * Copyright (c) Salomon Automation GmbH
 */
package at.kvas.jdt.bug;

public class Main<R extends Resource> {

    public static void main(String[] args) {

        Main<Resource> m = new Main<>();
        m.tryWithResource(new ResourceImpl());

    }

    public void tryWithResource(R resource) {
        try (R r = resource) {
            r.compute();
        }
    }

}

/*
 * Copyright (c) Salomon Automation GmbH
 */
package at.kvas.jdt.bug;

public class ResourceImpl implements Resource {

    @Override
    public void close() {
        System.out.println("close");
    }

    @Override
    public void compute() {
        System.out.println("compute");
    }

}

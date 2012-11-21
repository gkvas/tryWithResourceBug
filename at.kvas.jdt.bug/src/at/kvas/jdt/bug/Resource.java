/*
 * Copyright (c) Salomon Automation GmbH
 */
package at.kvas.jdt.bug;

public interface Resource extends AutoCloseable {

    void compute();

    @Override
    public void close();

}

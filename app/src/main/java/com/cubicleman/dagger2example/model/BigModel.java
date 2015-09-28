package com.cubicleman.dagger2example.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @since 9/27/15.
 */

/**
 * this is injected into the application level pf the graph
 */
@Singleton
public class BigModel {

    @Inject
    public BigModel() {
    }
}

package com.cubicleman.dagger2example.model;

import javax.inject.Inject;

/**
 * @since 9/27/15.
 */
public class ModelTwo {

    private final ModelOne modelOne;

    @Inject
    public ModelTwo( ModelOne modelOne ) {

        this.modelOne = modelOne;
    }




}

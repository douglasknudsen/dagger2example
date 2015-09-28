package com.cubicleman.dagger2example.dagger;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @since 9/27/15.
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity {}


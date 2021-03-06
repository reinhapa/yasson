/*******************************************************************************
 * Copyright (c) 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * Roman Grigoriadi
 ******************************************************************************/

package org.eclipse.yasson.defaultmapping.inheritance.model.generics;

/**
 * @author Roman Grigoriadi
 */
public class ImplementsGenericInterfaces<A, B> implements GenericInterface<A>, AnotherGenericInterface<B> {

    private A a;

    private B b;

    @Override
    public B getAnotherGenericValue() {
        return b;
    }

    @Override
    public void setAnotherGenericValue(B value) {
        this.b = value;
    }

    @Override
    public A getGenericValue() {
        return a;
    }

    @Override
    public void setGenericValue(A value) {
        this.a = value;
    }
}

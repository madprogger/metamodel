/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Michael Kroll
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package metamodel.constructor.impl;

import metamodel.constructor.AbstractConstructor;

/**
 * Base implementation for all constructor-definitions.
 * <p>
 * By convention, each subclass/interface should have the same type arguments at the same positions: &lt;BASE [,
 * ...]&gt;.
 *
 * @author Michael Kroll
 * @param <BASE> type of class that declares the method
 */
public abstract class AbstractConstructorImpl<BASE> implements AbstractConstructor<BASE> {

	private final Class<BASE> declaringClass;
	private final Class<?>[] parameterClasses;

	/**
	 * Constructor.
	 *
	 * @param declaringClass class that declares the constructor
	 * @param parameterClasses classes of parameters to be used for invocation
	 */
	public AbstractConstructorImpl(final Class<BASE> declaringClass, final Class<?>... parameterClasses) {
		this.declaringClass = declaringClass;
		this.parameterClasses = parameterClasses;
	}

	@Override
	public Class<BASE> getDeclaringClass() {
		return declaringClass;
	}

	@Override
	public Class<?>[] getParameterClasses() {
		return parameterClasses;
	}
}

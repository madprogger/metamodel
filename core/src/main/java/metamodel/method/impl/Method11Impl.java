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
package metamodel.method.impl;

import metamodel.method.Method11;

/**
 * Implementation for method-definitions with 11 parameters.
 * <p>
 * For Methods with return type {@code void}, the type parameter RT is {@link Void}.
 *
 * @author Michael Kroll
 * @param <BASE> type of class that declares the method
 * @param <RT> return type
 * @param <P1> type of first parameter
 * @param <P2> type of second parameter
 * @param <P3> type of third parameter
 * @param <P4> type of 4th parameter
 * @param <P5> type of 5th parameter
 * @param <P6> type of 6th parameter
 * @param <P7> type of 7th parameter
 * @param <P8> type of 8th parameter
 * @param <P9> type of 9th parameter
 * @param <P10> type of 10th parameter
 * @param <P11> type of 11th parameter
 */
public class Method11Impl<BASE, RT, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> extends AbstractMethodImpl<BASE, RT>
        implements Method11<BASE, RT, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> {

	public Method11Impl(final String name, final Class<BASE> declaringClass, final Class<?> param1Class,
	        final Class<?> param2Class, final Class<?> param3Class, final Class<?> param4Class,
	        final Class<?> param5Class, final Class<?> param6Class, final Class<?> param7Class,
	        final Class<?> param8Class, final Class<?> param9Class, final Class<?> param10Class,
	        final Class<?> param11Class) {
		super(name, declaringClass, param1Class, param2Class, param3Class, param4Class, param5Class, param6Class,
		        param7Class, param8Class, param9Class, param10Class, param11Class);
	}
}

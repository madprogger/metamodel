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

import metamodel.constructor.Constructor15;

/**
 * Implementation for constructor-definitions with 15 parameters.
 *
 * @author Michael Kroll
 * @param <BASE> type of class that declares the method
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
 * @param <P12> type of 12th parameter
 * @param <P13> type of 13th parameter
 * @param <P14> type of 14th parameter
 * @param <P15> type of 15th parameter
 */
public class Constructor15Impl<BASE, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> extends
        AbstractConstructorImpl<BASE> implements
        Constructor15<BASE, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> {

	public Constructor15Impl(final Class<BASE> declaringClass, final Class<?> param1Class, final Class<?> param2Class,
	        final Class<?> param3Class, final Class<?> param4Class, final Class<?> param5Class,
	        final Class<?> param6Class, final Class<?> param7Class, final Class<?> param8Class,
	        final Class<?> param9Class, final Class<?> param10Class, final Class<?> param11Class,
	        final Class<?> param12Class, final Class<?> param13Class, final Class<?> param14Class,
	        final Class<?> param15Class) {
		super(declaringClass, param1Class, param2Class, param3Class, param4Class, param5Class, param6Class,
		        param7Class, param8Class, param9Class, param10Class, param11Class, param12Class, param13Class,
		        param14Class, param15Class);
	}
}
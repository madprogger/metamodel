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
package metamodel.access.constructor;

import java.lang.reflect.InvocationTargetException;

import metamodel.constructor.Constructor14;

/**
 * Call-wrapper for Constructor with 14 parameters.
 *
 * @author Michael Kroll
 * @param <BASE> type of class that declares the constructor
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
 */
public class Constructable14<BASE, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> {

	private final Constructor14<BASE, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> constructorDefinition;

	public Constructable14(
	        final Constructor14<BASE, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> constructorDefinition) {
		this.constructorDefinition = constructorDefinition;
	}

	public BASE invoke(final P1 param1, final P2 param2, final P3 param3, final P4 param4, final P5 param5,
	        final P6 param6, final P7 param7, final P8 param8, final P9 param9, final P10 param10, final P11 param11,
	        final P12 param12, final P13 param13, final P14 param14) throws NoSuchMethodException, SecurityException,
	        InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ConstructorHelper.invoke(constructorDefinition, param1, param2, param3, param4, param5, param6, param7,
		        param8, param9, param10, param11, param12, param13, param14);
	}
}

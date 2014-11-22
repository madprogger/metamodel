Meta models for POJOs
====================

This tooling enables you to generate meta model classes of standard POJOs. These meta model classes can then be used to reflectively access the data of your POJO-instances in a type safe way.

What for?
=========

One word: testing. There are certain circumstances, where you want to change/read values of objects that simply do not have any setters/getters for these values. For Example:

- Manually set fields that are normally set by a dependency-injection framework, but you don't want to start the whole container just for testing one small class.
- Checking internal state of objects without the need to add getters only for testing. Beware: this type of access points at bad code/design.
- Testing legacy code while not being allowed to alter it

Using reflection in productive/non-testing code is not really the way it's meant to be done, although this tooling may also be used for this type of scenario.

No need for meta models!?
========================

Really? One may think simply writing  

	object.getClass().getDeclaredField("fieldName").set(object, newValue);
is all one has to do, with absolutely no need for a meta model.

Well...

- Think of type safety, above code would throw an IllegalArgumentException if `newValue` is of wrong type... during runtime.
- Think of inheritance: what if fieldName is declared in one of the super classes, would this still be a one-liner?
- A type and its super type declare a field with the same name. Are you sure you manipulate only the correct field?
- Compile-time-check with meta model vs. NoSuchFieldException during runtime
- Code-completion: some typos are (nearly) forever until fixed 


Ingredients
===========

- A generator that builds metamodels from java-source-files (using <https://code.google.com/p/javaparser/> for reading source-files and <https://codemodel.java.net/> for writing the metamodels)
- A maven-build-plugin for seamless integration in, well, maven builds :)
- Utilities that you may use along the generated metamodel to read/write values of fields etc. 

That's it, have Fun!

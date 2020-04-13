# GoF Patterns
Utilities and GoF patterns base implementations in java.

This library implements design patterns in these modes:
+ **Concrete implementations for some patterns.** 
  This are full implementations of a pattern with a concrete purpose. IE. the `BooleanBuilder` class is an implementation 
  of the builder pattern to ease the collection of boolean results.
+ **Base patterns implementations.** 
  Some patterns are not fully implemented as it needs concrete parts to be provided. Usually implementing or extending 
  this abstractions we force the pattern usage in custom code.
+ **Pattern definitions.** 
  This implementations are basically for documentation purposes. IE. the `Decorator` type is an abstract class and if
  any class extends it we can know that the intention of our custom code is to use a decorator pattern. Although it also 
  provides a base functionality to ease the decoration.
  
  NOTE: The intention of this library is not to cover all GoF patterns.

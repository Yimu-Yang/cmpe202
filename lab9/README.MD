# Java Object Oriented Programming vs. Java Functional Programming(Strategy Pattern)

## Object Oriented Implementation
For Object-Oriented Implementation, we need to implement the sorting strategy Interface with three concrete classes in advance, which are BubbleSort, MergeSort, and QuickSort. Every time we change the sorting strategy, we need to create an object of any of these classes and pass the object to the function. The key to change the sorting strategy is changing the strategy object.

## Functional(Java Lambda) Implementation
For Functional(Java Lambda) Implementation, we don't need to implement the sorting strategy Interface. In contrast, the sorting strategies are created dynamically. The object is passed in form of function, not the state. The key to change the sorting strategy is changing the sorting function but not the sorting object.
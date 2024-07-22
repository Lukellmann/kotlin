package test

interface Thing<X>

interface Foo<A, B>

interface Bar<A, B, C> : Foo<A, Pair<B, C>>, Thing<B>

interface Baz<X> : Bar<X, String, X>, Thing<String>

class Y<U> : Baz<U>

class Z<V> : Bar<List<V>, Int, String>

object O : Foo<List<Int>, Map<String, Int>>

val v<caret>alue: O = O

// CLASS_ID: test/Baz
// IS_SUBTYPE: false
// IS_SUBTYPE_LENIENT: false

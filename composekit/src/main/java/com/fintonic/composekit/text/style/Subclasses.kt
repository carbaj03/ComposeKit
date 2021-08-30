package com.fintonic.composekit.text.style

inline fun <reified A> subclasses(): List<Pair<String, A>> =
    A::class.sealedSubclasses
        .filter { it.objectInstance != null }
        .map { klass -> klass.simpleName.toString() to klass.objectInstance!! }
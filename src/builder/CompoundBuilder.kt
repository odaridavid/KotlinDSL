package builder

import Compound
import HomeDsl

@HomeDsl
class CompoundBuilder(var hasDecorations: Boolean = false) {

    fun build(): Compound {
        return Compound(hasDecorations)
    }
}
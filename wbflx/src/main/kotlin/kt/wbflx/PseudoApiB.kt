package kt.wbflx

import reactor.core.publisher.Flux

class PseudoApiB {
    companion object {
        fun getPseudoPersonB(): Flux<PseudoPersonB> {
            val people = listOf(
                PseudoPersonB("Clara", "18", "58"),
                PseudoPersonB("Augusto", "27", "78")
            )
            return Flux.fromIterable(people)
        }
    }

}
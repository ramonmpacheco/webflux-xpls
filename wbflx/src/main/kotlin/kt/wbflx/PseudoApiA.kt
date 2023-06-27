package kt.wbflx

import reactor.core.publisher.Flux

class PseudoApiA {
    companion object {
        fun getPseudoPersonA(): Flux<PseudoPersonA> {
            val people = listOf(
                PseudoPersonA("Ana", "30", "160"),
                PseudoPersonA("André", "30", "160")
            )
            return Flux.fromIterable(people)
        }
    }

}
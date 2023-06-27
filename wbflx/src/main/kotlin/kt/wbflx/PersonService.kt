package kt.wbflx

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class PersonService {
    fun getPeopleFluxFromTwoSources(): Flux<Person> {
        return Flux.concat(
            PseudoApiA.getPseudoPersonA().map { Person().personFrom(it) },
            PseudoApiB.getPseudoPersonB().map { Person().personFrom(it) }
        )
    }
}
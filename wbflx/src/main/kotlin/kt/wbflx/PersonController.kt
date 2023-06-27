package kt.wbflx

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("api/vi/person")
class PersonController(private val personService: PersonService) {
    @GetMapping("/getPeopleFluxFromTwoSources")
    fun getPeopleFluxFromTwoSources(): Flux<Person> {
        return personService.getPeopleFluxFromTwoSources()
    }
}
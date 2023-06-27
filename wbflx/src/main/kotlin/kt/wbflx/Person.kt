package kt.wbflx

data class Person (
    val name: String = "",
    val age: String = ""
) {
    fun personFrom(personA: PseudoPersonA) = Person(
        name = personA.name,
        age = personA.age
    )

    fun personFrom(personB: PseudoPersonB) = Person(
        name = personB.name,
        age = personB.age
    )
}
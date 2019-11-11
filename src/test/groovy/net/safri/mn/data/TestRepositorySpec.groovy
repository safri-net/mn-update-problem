package net.safri.mn.data

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class TestRepositorySpec extends Specification {

    @Inject
    TestRepository repository

    def "Update method handles @DateUpdated"() {
        when:
        def t = repository.save(new TestEntity(name: "test"))
        then:
        t.updated

        when:
        t.name = "test2"
        Thread.sleep(1000)
        repository.update(t)
        def s = repository.findById(t.id).get()

        then:
        s.name == "test2"
        s.updated > t.updated
    }
}

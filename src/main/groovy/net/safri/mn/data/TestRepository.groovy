package net.safri.mn.data

import io.micronaut.data.annotation.Id
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository


@JdbcRepository(dialect = Dialect.H2)
interface TestRepository extends CrudRepository<TestEntity,UUID> {
    void update(@Id UUID id, String name)
}

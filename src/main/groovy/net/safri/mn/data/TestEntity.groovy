package net.safri.mn.data

import io.micronaut.data.annotation.AutoPopulated
import io.micronaut.data.annotation.DateUpdated

import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import java.time.LocalDateTime

@Entity
class TestEntity {

    @Id
    @AutoPopulated
    UUID id

    @NotBlank
    String name

    @DateUpdated
    LocalDateTime updated
}

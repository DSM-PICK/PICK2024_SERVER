package dsm.pick2024.domain.classroom.entity

import dsm.pick2024.global.base.BaseUUIDEntity
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity

@Entity(name = "tbl_classroom")
class ClassroomJpaEntity(
    id: UUID?,
    @Column(name = "classroom", nullable = false, unique = true)
    val classroomName: String,

    @Column(name = "floor", nullable = false)
    val floor: Int
) : BaseUUIDEntity(id)
